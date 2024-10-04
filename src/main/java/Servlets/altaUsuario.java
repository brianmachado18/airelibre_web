package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;
import logica.*;
import excepciones.*;





@WebServlet("/altaUsuario")
@MultipartConfig
public class altaUsuario extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public altaUsuario() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Fabrica fab = Fabrica.getInstance();
    	IControladorUsuario ICC = fab.getIControladorUsuario();
    	
    	
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
        String nombreArchivo = archivo.getSubmittedFileName(); 
        String extension = nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
       
        String rutaDestino = "\\Perfiles\\" + nickname + extension;
        archivo.write(rutaDestino);
        
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaNacimientoStr, formatoFecha);
        
        try {
        	 if (ICC.usuarioExiste(nickname, correo)) {
     			RequestDispatcher rd;
     			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
     			request.setAttribute("mensaje", "El nickname o el correo electrónico ya están en uso.");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
     		}else {
    			ICC.AltaUsuario(nickname, contrasena, nombre, apellido, correo, fecha, tipoUsuario, esProfesional, disciplina, paginaWeb, rutaDestino);
    			RequestDispatcher rd;
     			request.setAttribute("estado", "Usuario creado.");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
     		}
		} catch (PersistenciaException e) {
			e.printStackTrace();
		}
    }
}
