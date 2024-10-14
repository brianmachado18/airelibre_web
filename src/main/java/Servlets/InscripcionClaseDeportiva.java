package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.Vector;

import excepciones.ClaseNoExisteException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.Fabrica;
import logica.IControladorActividad;
import logica.IControladorUsuario;

@WebServlet("/InscripcionClaseDeportiva")
public class InscripcionClaseDeportiva extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
        
        String BuscaAct  = request.getParameter("buscar");

        // Procesar la inscripción
        Fabrica fab = Fabrica.getInstance();
        IControladorActividad ICA = fab.getIControladorActividad();


        try {
        	System.out.println(BuscaAct);
        	if  (ICA.actividadExiste(BuscaAct)) {
        		 Vector<String> vClases = fab.getIControladorActividad().obtenerVectorClasesActividad(BuscaAct);
                 System.out.println(vClases);
                 request.setAttribute("listCla", vClases);
             	request.getRequestDispatcher("/inscripcionClaseDeportiva.jsp").forward(request, response);
        	}else{
        		RequestDispatcher rd;
				request.setAttribute("estado", "Vuelva a intentar mas tarde.");
     			request.setAttribute("mensaje", "La actividad no existe.");
     			request.setAttribute("pag", "\"inscripcionClaseDeportiva.jsp\"");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
        	}

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}