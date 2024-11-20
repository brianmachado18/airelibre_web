package Servlets;

import java.io.IOException;
import java.util.List;
import java.util.Vector;

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

@WebServlet("/consultarActividad")
@MultipartConfig
public class consultarActividad extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public consultarActividad() {
        super();
        
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException, PersistenciaException_Exception {
    	
    	servidor.PublicadorService service = new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        
    	List<String> vActividades = null;

        vActividades = port.obtenerVectorActividad();

        request.setAttribute("listAct", vActividades);
    	
    	String nombre = request.getParameter("buscar");
    	
    	if(port.actividadExiste(nombre)) {
    		RequestDispatcher rd;
    		
    		servidor.DtActividad tActividad = port.obtenerActividad(nombre);
    		request.setAttribute("nombre", tActividad.getNombre());
    		request.setAttribute("descripcion", tActividad.getDescripcion());
    		request.setAttribute("duracionHoras", tActividad.getDuracionHoras());
    		request.setAttribute("costo", tActividad.getCosto());
    		request.setAttribute("lugar", tActividad.getLugar());
    		request.setAttribute("fechaAlta", tActividad.getFechaAltaString());
    		request.setAttribute("estado", tActividad.getEstado());
    		request.setAttribute("imgen", request.getContextPath()+ tActividad.getImagen());
			request.setAttribute("clases", port.obtenerVectorClasesActividad(nombre));
    		
    		rd = request.getRequestDispatcher("/consultarActividad.jsp");
 			rd.forward(request, response);
    	}else{
			RequestDispatcher rd;
			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
 			request.setAttribute("mensaje", "La actividad no existe.");
 			request.setAttribute("pag", "\"consultarActividad.jsp\"");
 			rd = request.getRequestDispatcher("/notificacion.jsp");
 			rd.forward(request, response);
		}
    	
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        servidor.PublicadorService service = new servidor.PublicadorService();
        servidor.Publicador port = service.getPublicadorPort();
        List<String> vActividades = null;
	
		try {
			vActividades = port.obtenerVectorActividad();
		} catch (PersistenciaException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

        request.setAttribute("listAct", vActividades);
        
        if(request.getParameter("actividadSeleccionada")!=null) {
        	String actividadSeleccionada = request.getParameter("actividadSeleccionada");
            request.setAttribute("nom", actividadSeleccionada);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("consultarActividad.jsp");
        rd.forward(request, response);
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