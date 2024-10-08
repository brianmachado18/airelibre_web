package Servlets;

import java.io.IOException;

import datatype.DtDeportista;
import datatype.DtEntrenador;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Fabrica fab = Fabrica.getInstance();
    	IControladorUsuario ICC = fab.getIControladorUsuario();
    	
    	String nickname = request.getParameter("buscar");
    	
    	try {
    		
			if(ICC.usuarioExiste(nickname)){
				RequestDispatcher rd;
				if(ICC.esEntrenador(nickname)){
					DtEntrenador traerEntrenador = ICC.obtenerEntrenador(nickname);
					request.setAttribute("nombre", traerEntrenador.getNombre());
	     			request.setAttribute("apellido", traerEntrenador.getApellido());
	     			request.setAttribute("nickname", traerEntrenador.getNickname());
	     			request.setAttribute("correo", traerEntrenador.getMail());
	     			request.setAttribute("fnac", traerEntrenador.getFechaNacimiento());
	     			request.setAttribute("con", traerEntrenador.getContrasena());
	     			request.setAttribute("tipoUsuario", "Entrenador");
	     			request.setAttribute("web", traerEntrenador.getSitioWeb());
	     			request.setAttribute("disciplina", traerEntrenador.getDisciplina());
	     			request.setAttribute("imgen", traerEntrenador.getImagen());
	     			
	     			rd = request.getRequestDispatcher("/consultarUsuario.jsp");
	     			rd.forward(request, response);
				}else{
					DtDeportista traerDeportista = ICC.obtenerDeportista(nickname);
					request.setAttribute("nombre", traerDeportista.getNombre());
	     			request.setAttribute("apellido", traerDeportista.getApellido());
	     			request.setAttribute("nickname", traerDeportista.getNickname());
	     			request.setAttribute("correo", traerDeportista.getMail());
	     			request.setAttribute("fnac", traerDeportista.getFechaNacimiento());
	     			request.setAttribute("con", traerDeportista.getContrasena());
	     			request.setAttribute("imgen",request.getContextPath()+ traerDeportista.getImagen());
	     			
	     			System.out.println(request.getContextPath() + traerDeportista.getImagen());
	     			
	     			request.setAttribute("tipoUsuario", "Deportista");
	     		
	     			if (traerDeportista.isEsProfesional()) {
	     	            request.setAttribute("prof", true);
	     	        } else {
	     	            request.setAttribute("prof", false);
	     	        }
	     			
	     			rd = request.getRequestDispatcher("/consultarUsuario.jsp");
	     			rd.forward(request, response);
				}
			}else{
				RequestDispatcher rd;
				request.setAttribute("estado", "Vuelva a intentar mas tarde.");
     			request.setAttribute("mensaje", "El usuario no existe.");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
				
			}
		} catch (PersistenciaException e) {
			e.printStackTrace();
		}
    	
    	System.out.println(nickname);
    }
}
