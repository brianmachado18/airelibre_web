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
import servidor.PersistenciaException_Exception;
import excepciones.*;

@WebServlet("/altaActividad")
@MultipartConfig
public class altaActividad extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public altaActividad() {
        super();
        
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistenciaException_Exception {
    	
    	servidor.PublicadorService service = new servidor.PublicadorService();
    	servidor.Publicador port = service.getPublicadorPort();
    	
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
    	
    	if(archivo.getSize() > 0) {
    		nombreArchivo = archivo.getSubmittedFileName();
    		extension = nombreArchivo.substring(nombreArchivo.lastIndexOf("0"));
    		rutaDestino = request.getServletContext().getRealPath("/Actividades/") + nombre + extension;
    		archivo.write(rutaDestino);
    		rutaPersistir = "/Actividades/" + nombre + extension;
    	}

    	try {
			
    		HttpSession session = request.getSession(false);
    		
    		if(port.actividadExiste(nombre)) {
    			RequestDispatcher rd;
    			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
    			request.setAttribute("mensaje", "El nombre de la actividad ya están en uso.");
     			request.setAttribute("pag", "\"altaActividad.jsp\"");
    			rd = request.getRequestDispatcher("/notificacion.jsp");
    			rd.forward(request, response);
    		}else {
    			port.altaActividad(nombre, descripcion, Integer.parseInt(duracion), Integer.parseInt(costo), lugar, fechaAlta, rutaPersistir, (String) session.getAttribute("usuarioLogueado"));
    			RequestDispatcher rd;
    			request.setAttribute("estado", "Actividad creada.");
     			request.setAttribute("pag", "\"index.jsp\"");
    			rd = request.getRequestDispatcher("/notificacion.jsp");
    			rd.forward(request, response);
    		}
    		
		} catch (Exception e) {
			
		}
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
			processRequest(request, response);
		} catch (ServletException | IOException | PersistenciaException_Exception e) {
			e.printStackTrace();
		}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
    	try {
			processRequest(request, response);
		} catch (ServletException | IOException | PersistenciaException_Exception e) {
			e.printStackTrace();
		}
    }
}
