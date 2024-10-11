package Servlets;

import java.io.IOException;
import java.util.Vector;

import datatype.DtDeportista;
import datatype.DtEntrenador;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.*;
import excepciones.*;





@WebServlet("/consultarUsuario")
@MultipartConfig
public class consultarUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public consultarUsuario() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        Fabrica fab = Fabrica.getInstance();
        Vector<String> vUsuarios = new Vector<String>();
        try {
			vUsuarios = fab.getIControladorUsuario().obtenerVectorUsuarios();
		} catch (PersistenciaException e) {
			e.printStackTrace();
		}
        request.setAttribute("listUsu", vUsuarios);
        
        RequestDispatcher rd = request.getRequestDispatcher("consultarUsuario.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Fabrica fab = Fabrica.getInstance();
    	IControladorUsuario ICU = fab.getIControladorUsuario();
    	IControladorClaseDeportiva ICC = fab.getIControladorClaseDeportiva();
    	IControladorActividad ICA = fab.getIControladorActividad();
    	
    	Vector<String> vUsuarios = new Vector<String>();
        try {
			vUsuarios = ICU.obtenerVectorUsuarios();
		} catch (PersistenciaException e) {
			e.printStackTrace();
		}
        request.setAttribute("listUsu", vUsuarios);
    	
    	String nickname = request.getParameter("buscar");
    	
    	try {
    		
			if(ICU.usuarioExiste(nickname)){
				RequestDispatcher rd;
				if(ICU.esEntrenador(nickname)){
					DtEntrenador traerEntrenador = ICU.obtenerEntrenador(nickname);
					request.setAttribute("nombre", traerEntrenador.getNombre());
	     			request.setAttribute("apellido", traerEntrenador.getApellido());
	     			request.setAttribute("nickname", traerEntrenador.getNickname());
	     			request.setAttribute("correo", traerEntrenador.getMail());
	     			request.setAttribute("fnac", traerEntrenador.getFechaNacimiento());
	     			request.setAttribute("tipoUsuario", "Entrenador");
	     			request.setAttribute("web", traerEntrenador.getSitioWeb());
	     			request.setAttribute("disciplina", traerEntrenador.getDisciplina());
	     			request.setAttribute("imgen", request.getContextPath()+ traerEntrenador.getImagen());
	     			
	     			HttpSession session = request.getSession(false);
					if(nickname.equals((String) session.getAttribute("usuarioLogueado"))) {
						request.setAttribute("actividades", ICA.obtenerArrayActividadesEntrenador(nickname));
					}else {
		     			request.setAttribute("actividadesAceptadas", ICA.obtenerArrayActividadesAceptadasEntrenador(nickname));
					}
	     			
	     			rd = request.getRequestDispatcher("/consultarUsuario.jsp");
	     			rd.forward(request, response);
				}else{
					DtDeportista traerDeportista = ICU.obtenerDeportista(nickname);
					request.setAttribute("nombre", traerDeportista.getNombre());
	     			request.setAttribute("apellido", traerDeportista.getApellido());
	     			request.setAttribute("nickname", traerDeportista.getNickname());
	     			request.setAttribute("correo", traerDeportista.getMail());
	     			request.setAttribute("fnac", traerDeportista.getFechaNacimiento());
	     			request.setAttribute("imgen",request.getContextPath()+ traerDeportista.getImagen());
	     			request.setAttribute("tipoUsuario", "Deportista");
	     			
	     			if (traerDeportista.isEsProfesional()) {
	     	            request.setAttribute("prof", true);
	     	        } else {
	     	            request.setAttribute("prof", false);
	     	        }
	     			
	     			HttpSession session = request.getSession(false);
					if(nickname.equals((String) session.getAttribute("usuarioLogueado"))) {
						request.setAttribute("inscrips", ICC.obtenerInscrpcionesDeportista(nickname));
					}else {
		     			request.setAttribute("clasesIns", ICC.obtenerClasesDeportista(nickname));
					}
	     			
	     			rd = request.getRequestDispatcher("/consultarUsuario.jsp");
	     			rd.forward(request, response);
				}
			}else{
				RequestDispatcher rd;
				request.setAttribute("estado", "Vuelva a intentar mas tarde.");
     			request.setAttribute("mensaje", "El usuario no existe.");
     			request.setAttribute("pag", "\"consultarUsuario.jsp\"");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
				
			}
		} catch (PersistenciaException e) {
			e.printStackTrace();
		}
    }
}
