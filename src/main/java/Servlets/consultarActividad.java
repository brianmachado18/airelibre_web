package Servlets;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import logica.*;
import datatype.*;

@WebServlet("/consultarActividad")
@MultipartConfig
public class consultarActividad extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public consultarActividad() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Fabrica fab = Fabrica.getInstance();
    	IControladorActividad ICA = fab.getIControladorActividad();
    	
    	String nombre = request.getParameter("buscar");
    	
    	if(ICA.actividadExiste(nombre)) {
    		RequestDispatcher rd;
    		
    		DtActividad tActividad = ICA.obtenerActividad(nombre);
    		request.setAttribute("nombre", tActividad.getNombre());
    		request.setAttribute("descripcion", tActividad.getDescripcion());
    		request.setAttribute("duracionHoras", tActividad.getDuracionHoras());
    		request.setAttribute("costo", tActividad.getCosto());
    		request.setAttribute("lugar", tActividad.getLugar());
    		request.setAttribute("fechaAlta", tActividad.getFechaAlta());
    		request.setAttribute("estado", tActividad.getEstado());
    		request.setAttribute("imgen", request.getContextPath()+ tActividad.getImagen());
			request.setAttribute("clases", ICA.obtenerVectorClasesActividad(nombre));
    		
    		rd = request.getRequestDispatcher("/consultarActividad.jsp");
 			rd.forward(request, response);
    	}else{
			RequestDispatcher rd;
			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
 			request.setAttribute("mensaje", "La actividad no existe.");
 			rd = request.getRequestDispatcher("/notificacion.jsp");
 			rd.forward(request, response);
		}
    	
    }
}