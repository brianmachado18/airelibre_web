package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import logica.*;
import servidor.PersistenciaException_Exception;
import excepciones.*;





@WebServlet("/altaUsuario")
@MultipartConfig
public class altaUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public altaUsuario() {
        super();
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException, PersistenciaException_Exception {
    	
        servidor.PublicadorService service = new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
    	
    	String nickname = request.getParameter("nickname");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("email");
        String contrasena = request.getParameter("contrasena");   
        String fechaNacimientoStr = request.getParameter("fecha");
        String paginaWeb = request.getParameter("sitio_web"); 
        String disciplina = request.getParameter("disciplina"); 
        String tipoUsuario = request.getParameter("role");
        String esProfesionalStr = request.getParameter("profesional"); 
        Boolean esProfesional = "si".equals(esProfesionalStr);
        
        Part archivo = request.getPart("imagen"); 
        String nombreArchivo = null; 
        String extension = null;
        String rutaArchivo = null;
       
        if(archivo.getSize() > 0) {
            nombreArchivo = archivo.getSubmittedFileName(); 
            extension = nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
            String rutaDestino = request.getServletContext().getRealPath("/Perfiles/") + nickname + extension;
            archivo.write(rutaDestino);
            rutaArchivo = "/Perfiles/" + nickname + extension;
        }

        
        if (port.usuarioExiste(nickname) && port.usuarioExiste(correo)) {
			RequestDispatcher rd;
			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
			request.setAttribute("mensaje", "El nickname o el correo electrónico ya están en uso.");
			request.setAttribute("pag", "\"altaUsuario.jsp\"");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}else {
			port.altaUsuario(nickname, contrasena, nombre, apellido, correo, fechaNacimientoStr, tipoUsuario.trim(), esProfesional, disciplina, paginaWeb, rutaArchivo);
			RequestDispatcher rd;
			request.setAttribute("estado", "Usuario creado.");
			request.setAttribute("pag", "\"login.jsp\"");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   	 try {
			processRequest(request, response);
		} catch (ServletException | IOException | PersistenciaException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
