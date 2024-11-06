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
import servidor.PersistenciaException_Exception;
import datatype.DtDeportista;
import datatype.DtEntrenador;
import excepciones.PersistenciaException;

@WebServlet("/modificarUsuario")
public class modificarUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistenciaException_Exception {
    	
    	servidor.PublicadorService service = new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();

    	
    	HttpSession session = request.getSession(false);
        String nickname = (String) session.getAttribute("usuarioLogueado");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String contrasena = request.getParameter("contrasena");   
        String fechaNacimientoStr = request.getParameter("fechaNacimiento");

        	if (port.esEntrenador(nickname)){
    	        servidor.DtEntrenador traerEntrenador = port.obtenerEntrenador(nickname);
    	        System.out.println("Nombre:"+ nombre);
    	        System.out.println("Apellido:"+ apellido);
    	        System.out.println("Password:"+ contrasena);
    	        System.out.println("fecha:"+ fechaNacimientoStr);
				port.modifiarUsuario(nickname, contrasena, nombre, apellido, traerEntrenador.getMail(), fechaNacimientoStr, "Entrenador", false , traerEntrenador.getDisciplina(), traerEntrenador.getSitioWeb());
        	}else{
    	        servidor.DtDeportista traerDeportista = port.obtenerDeportista(nickname);
    	        System.out.println("Nombre:"+ nombre);
    	        System.out.println("Apellido:"+ apellido);
    	        System.out.println("Password:"+ contrasena);
    	        System.out.println("fecha:"+ fechaNacimientoStr);
    	        port.modifiarUsuario(nickname, contrasena, nombre, apellido, traerDeportista.getMail(), fechaNacimientoStr, "Deportista", traerDeportista.isEsProfesional() , null, null);
        	}

    			
    			RequestDispatcher rd;
     			request.setAttribute("estado", "Usuario modificado.");
     			request.setAttribute("pag", "\"index.jsp\"");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
     		
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        String nickname = (String) session.getAttribute("usuarioLogueado");


            servidor.PublicadorService service = new servidor.PublicadorService();
            servidor.Publicador port = service.getPublicadorPort();

            try {
            	if (port.usuarioExiste(nickname)) {
            	    RequestDispatcher rd;
            	    if (port.esEntrenador(nickname)) {
            	        servidor.DtEntrenador traerEntrenador = port.obtenerEntrenador(nickname);
            	        
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
     
            	        servidor.DtDeportista traerDeportista = port.obtenerDeportista(nickname);

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
                RequestDispatcher rd;
     			request.setAttribute("estado", "Error al Modificar.");
     			request.setAttribute("pag", "\"modificarUsuario.jsp\"");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
            }
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      	 try {
 			processRequest(request, response);
 		} catch (ServletException | IOException | PersistenciaException_Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
    }
}
