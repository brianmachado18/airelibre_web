package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
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
import modelo.*;
import servidor.PersistenciaException_Exception;
import excepciones.*;
import datatype.*;

@WebServlet("/altaClaseDeportiva")
@MultipartConfig
public class altaClaseDeportiva extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public altaClaseDeportiva() {
        super();
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException, PersistenciaException_Exception {
    	

    	servidor.PublicadorService service = new servidor.PublicadorService();
    	servidor.Publicador port = service.getPublicadorPort();
    	
        // Obtener los parámetros del formulario
        String nombreClaseDeportiva = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        String lugar = request.getParameter("lugar");
        int cupo = Integer.parseInt(request.getParameter("cupo"));
        String actividad = request.getParameter("actividad");

        // Manejo de la imagen (opcional)
        Part archivo = request.getPart("imagen");
        String nombreArchivo = null;
        String extension = null;
        String rutaArchivo = null;
       
        if (archivo.getSize() > 0) {
            nombreArchivo = archivo.getSubmittedFileName();
            extension = nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
            String rutaDestino = request.getServletContext().getRealPath("/Clases/") + nombreClaseDeportiva + extension;
            archivo.write(rutaDestino);
            rutaArchivo = "/Clases/" + nombreClaseDeportiva + extension; 
        }
        

        
        // Crear la nueva clase deportiva
		RequestDispatcher rd;
        try {
        	if(port.claseExiste(nombreClaseDeportiva)) {
     			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
     			request.setAttribute("mensaje", "El nombre de la actividad ya están en uso.");
     			request.setAttribute("pag", "\"altaClaseDeportiva.jsp\"");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
        	} else {
            	port.altaClaseDeportiva(nombreClaseDeportiva, fecha, hora, lugar, cupo, actividad, rutaArchivo);
        		request.setAttribute("estado", "Clase Deportiva creada exitosamente.");
     			request.setAttribute("pag", "\"index.jsp\"");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
                rd.forward(request, response);
        	}
        } catch (Exception e) {
        	e.printStackTrace();
        	request.setAttribute("estado", "Vuelva a intentar mas tarde.");
 			request.setAttribute("mensaje", "Error al Conectarse con la Base de Datos.");
 			request.setAttribute("pag", "\"altaClaseDeportiva.jsp\"");
 			rd = request.getRequestDispatcher("/notificacion.jsp");
 			rd.forward(request, response);
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