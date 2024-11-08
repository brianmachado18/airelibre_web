package Servlets;

import java.io.IOException;
import java.util.Vector;

import org.eclipse.persistence.internal.oxm.schema.model.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import servidor.PersistenciaException_Exception;
import excepciones.PersistenciaException;

@WebServlet("/consultarClaseDeportiva")
@MultipartConfig
public class consultarClaseDeportiva extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public consultarClaseDeportiva() {
        super();
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, PersistenciaException_Exception {
    	
    	servidor.PublicadorService service = new servidor.PublicadorService();
    	servidor.Publicador port = service.getPublicadorPort();
    	
    	java.util.List<String> vClases = port.obtenerVectorClases();
        request.setAttribute("listCla", vClases);
    	
    	String nombre = request.getParameter("buscar");
    	
    	if(port.claseExiste(nombre)) {
    		RequestDispatcher rd;
    		
    		servidor.DtClaseDeportiva tClase = port.obtenerClase(nombre);
    		request.setAttribute("nombre", tClase.getNombre());
    		request.setAttribute("fecha", tClase.getFecha());
    		request.setAttribute("hora", tClase.getHora());
    		request.setAttribute("lugar", tClase.getLugar());
    		request.setAttribute("fechaAlta", tClase.getFechaAlta());
    		request.setAttribute("cupo", tClase.getCupo());
    		request.setAttribute("imgen", request.getContextPath()+ tClase.getImagen());
    		request.setAttribute("inscrips", port.obtenerListaInscripciones(nombre));
    		
    		rd = request.getRequestDispatcher("/consultarClaseDeportiva.jsp");
 			rd.forward(request, response);
    	}else {
    		RequestDispatcher rd;
			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
 			request.setAttribute("mensaje", "La clase no existe.");
 			request.setAttribute("pag", "\"consultarClaseDeportiva.jsp\"");
 			rd = request.getRequestDispatcher("/notificacion.jsp");
 			rd.forward(request, response);
    	}
    	
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
    	servidor.PublicadorService service = new servidor.PublicadorService();
    	servidor.Publicador port = service.getPublicadorPort();
    	java.util.List<String> vClases = port.obtenerVectorClases();
        request.setAttribute("listCla", vClases);
        
        if(request.getParameter("claseSeleccionada")!=null) {
        	String claseSeleccionada = request.getParameter("claseSeleccionada");
        	request.setAttribute("nom", claseSeleccionada);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("consultarClaseDeportiva.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	try {
			processRequest(request, response);
		} catch (ServletException | IOException | PersistenciaException_Exception e) {
			e.printStackTrace();
		}
    	
    }
}