package Servlets;

import java.io.IOException;
import java.util.Vector;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.*;
import datatype.*;
import excepciones.PersistenciaException;

@WebServlet("/consultarClaseDeportiva")
@MultipartConfig
public class consultarClaseDeportiva extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public consultarClaseDeportiva() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        Fabrica fab = Fabrica.getInstance();
        Vector<String> vClases = new Vector<String>();
        vClases = fab.getIControladorClaseDeportiva().obtenerVectorClases();
        request.setAttribute("listCla", vClases);
        
        if(request.getParameter("claseSeleccionada")!=null) {
        	String claseSeleccionada = request.getParameter("claseSeleccionada");
        	request.setAttribute("nom", claseSeleccionada);
        }
        
        RequestDispatcher rd = request.getRequestDispatcher("consultarClaseDeportiva.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Fabrica fab = Fabrica.getInstance();
    	IControladorClaseDeportiva ICC = fab.getIControladorClaseDeportiva();
    	
    	Vector<String> vClases = new Vector<String>();
        vClases = ICC.obtenerVectorClases();
        request.setAttribute("listCla", vClases);
    	
    	String nombre = request.getParameter("buscar");
    	
    	if(ICC.claseExiste(nombre)) {
    		RequestDispatcher rd;
    		
    		DtClaseDeportiva tClase = ICC.obtenerClase(nombre);
    		request.setAttribute("nombre", tClase.getNombre());
    		request.setAttribute("fecha", tClase.getFecha());
    		request.setAttribute("hora", tClase.getHora());
    		request.setAttribute("lugar", tClase.getLugar());
    		request.setAttribute("fechaAlta", tClase.getFechaAlta());
    		request.setAttribute("cupo", tClase.getCupo());
    		request.setAttribute("imgen", request.getContextPath()+ tClase.getImagen());
    		request.setAttribute("inscrips", ICC.obtenerListaInscripciones(nombre));
    		
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
}