package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.Fabrica;
import logica.IControladorUsuario;
import datatype.DtDeportista;
import datatype.DtEntrenador;
import excepciones.PersistenciaException;

@WebServlet("/modificarUsuario")
public class modificarUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String nickname = (String) session.getAttribute("usuarioLogueado");


            Fabrica fabrica = Fabrica.getInstance();
            IControladorUsuario ICC = fabrica.getIControladorUsuario();

            try {
            	if (ICC.usuarioExiste(nickname)) {
            	    RequestDispatcher rd;
            	    if (ICC.esEntrenador(nickname)) {
            	        DtEntrenador traerEntrenador = ICC.obtenerEntrenador(nickname);
            	        
            	        request.setAttribute("nombre", traerEntrenador.getNombre());
            	        request.setAttribute("apellido", traerEntrenador.getApellido());
            	        request.setAttribute("nickname", traerEntrenador.getNickname());
            	        request.setAttribute("correo", traerEntrenador.getMail());
            	        request.setAttribute("fnac", traerEntrenador.getFechaNacimiento());
            	        request.setAttribute("con", traerEntrenador.getContrasena());
            	        request.setAttribute("web", traerEntrenador.getSitioWeb());
            	        request.setAttribute("disciplina", traerEntrenador.getDisciplina());
            	        request.setAttribute("imgen", request.getContextPath()+traerEntrenador.getImagen());

            	        rd = request.getRequestDispatcher("/modificarUsuario.jsp");
            	        rd.forward(request, response);
            	    } else {
     
            	        DtDeportista traerDeportista = ICC.obtenerDeportista(nickname);

            	        request.setAttribute("nombre", traerDeportista.getNombre());
            	        request.setAttribute("apellido", traerDeportista.getApellido());
            	        request.setAttribute("nickname", traerDeportista.getNickname());
            	        request.setAttribute("correo", traerDeportista.getMail());
            	        request.setAttribute("fnac", traerDeportista.getFechaNacimiento());
            	        request.setAttribute("con", traerDeportista.getContrasena());
            	        request.setAttribute("imgen", request.getContextPath()+traerDeportista.getImagen());
            	        
            	        rd = request.getRequestDispatcher("/modificarUsuario.jsp");
            	        rd.forward(request, response);
            	    }
            	} else {
            	    
            	    System.out.println("El usuario no existe en la base de datos.");
            	}
            } catch (Exception e) {
                e.printStackTrace();
                request.setAttribute("mensajeError", "Error al cargar los datos del usuario.");
                RequestDispatcher rd = request.getRequestDispatcher("/error.jsp");
                rd.forward(request, response);
            }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    	Fabrica fab = Fabrica.getInstance();
    	IControladorUsuario ICC = fab.getIControladorUsuario();
    	
    	HttpSession session = request.getSession(false);
        String nickname = (String) session.getAttribute("usuarioLogueado");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String contrasena = request.getParameter("contrasena");   
        String fechaNacimientoStr = request.getParameter("fechaNacimiento");
        LocalDate fecha = null;
        
        if (fechaNacimientoStr != null && !fechaNacimientoStr.isEmpty()) {
        	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        	fecha = LocalDate.parse(fechaNacimientoStr, formatoFecha);
        }else {
        	System.out.println(nickname);
        }
        
        try {
        	if (ICC.esEntrenador(nickname)){
    	        DtEntrenador traerEntrenador = ICC.obtenerEntrenador(nickname);
    	        System.out.println("Nombre:"+ nombre);
    	        System.out.println("Apellido:"+ apellido);
    	        System.out.println("Password:"+ contrasena);
    	        System.out.println("fecha:"+ fecha);
				ICC.modifiarUsuario(nickname, contrasena, nombre, apellido, traerEntrenador.getMail(), fecha, "Entrenador", false , traerEntrenador.getDisciplina(), traerEntrenador.getSitioWeb());
        	}else{
    	        DtDeportista traerDeportista = ICC.obtenerDeportista(nickname);
    	        System.out.println("Nombre:"+ nombre);
    	        System.out.println("Apellido:"+ apellido);
    	        System.out.println("Password:"+ contrasena);
    	        System.out.println("fecha:"+ fecha);
    	        ICC.modifiarUsuario(nickname, contrasena, nombre, apellido, traerDeportista.getMail(), fecha, "Deportista", traerDeportista.isEsProfesional() , null, null);
        	}

    			
    			RequestDispatcher rd;
     			request.setAttribute("estado", "Usuario modificado.");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			request.setAttribute("pag", "\"index.jsp\"");
     			rd.forward(request, response);
     		
		} catch (PersistenciaException e) {
			e.printStackTrace();
		}
    }
}
