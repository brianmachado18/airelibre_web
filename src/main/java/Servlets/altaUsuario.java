package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
        String confContrasena = request.getParameter("confirmar"); 
        String fechaNacimientoStr = request.getParameter("fecha");
        String paginaWeb = request.getParameter("sitio_web"); 
        String disciplina = request.getParameter("disciplina"); 
        
        System.out.println(fechaNacimientoStr);
        
        DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fecha = LocalDate.parse(fechaNacimientoStr, formatoFecha);
        
        try {
			ICC.AltaUsuario(nickname, contrasena, nombre, apellido, correo, fecha, "Entrenador", false, disciplina, paginaWeb);

			
		} catch (PersistenciaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
