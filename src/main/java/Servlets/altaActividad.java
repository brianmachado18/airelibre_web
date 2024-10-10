package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import datatype.DtEntrenador;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.Part;
import logica.*;
import excepciones.*;

@WebServlet("/altaActividad")
@MultipartConfig
public class altaActividad extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public altaActividad() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Fabrica fab = Fabrica.getInstance();
    	IControladorActividad ICA = fab.getIControladorActividad();
    	IControladorUsuario ICU = fab.getIControladorUsuario();
    	
    	String nombre = request.getParameter("nombre");
    	String descripcion = request.getParameter("descripcion");
    	String duracion = request.getParameter("duracionHoras");
    	String costo = request.getParameter("costo");
    	String lugar = request.getParameter("lugar");
    	String fechaAlta = request.getParameter("fechaAlta");
    	
    	Part archivo = request.getPart("imagen");
    	String nombreArchivo = null;
    	String extension = null;
    	String rutaDestino = null;
    	String rutaPersistir = null;
    	if(archivo.getSize()>0) {
	    	nombreArchivo = archivo.getSubmittedFileName(); 
	        extension = nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
	        rutaDestino = request.getServletContext().getRealPath("/Actividades/") + nombre + extension;
	        archivo.write(rutaDestino);
	        rutaPersistir = "/Actividades/" + nombre + extension;
    	}
    	
        LocalDate fecha = LocalDate.parse(fechaAlta, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        
        try {
        	HttpSession session = request.getSession(false);
            System.out.println((String) session.getAttribute("usuarioLogueado"));
            DtEntrenador dtEnt = ICU.obtenerEntrenador((String) session.getAttribute("usuarioLogueado"));
        	
       	 	if (ICA.actividadExiste(nombre)) {
    			RequestDispatcher rd;
    			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
    			request.setAttribute("mensaje", "El nombre de la actividad ya están en uso.");
     			request.setAttribute("pag", "\"altaActividad.jsp\"");
    			rd = request.getRequestDispatcher("/notificacion.jsp");
    			rd.forward(request, response);
    		}else {
    			ICA.AltaActividad(nombre, descripcion, Integer.parseInt(duracion), Integer.parseInt(costo), lugar, fecha, rutaPersistir, dtEnt);
    			RequestDispatcher rd;
    			request.setAttribute("estado", "Actividad creada.");
     			request.setAttribute("pag", "\"index.jsp\"");
    			rd = request.getRequestDispatcher("/notificacion.jsp");
    			rd.forward(request, response);
    		}
		} catch (PersistenciaException e) {
			e.printStackTrace();
		}
    	
    }
}
