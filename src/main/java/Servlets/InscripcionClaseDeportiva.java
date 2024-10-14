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

@WebServlet("/InscripcionClaseDeportiva")
public class InscripcionClaseDeportiva extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String actividadSeleccionada = request.getParameter("actividad");
        System.out.println(actividadSeleccionada + 1 );
        if (actividadSeleccionada != null && !actividadSeleccionada.isEmpty()) {
            Fabrica fab = Fabrica.getInstance();
            Vector<String> vClases = fab.getIControladorActividad().obtenerVectorClasesActividad("actividad real");
            System.out.println(vClases);
            request.setAttribute("listCla", vClases);
        }
        RequestDispatcher rd = request.getRequestDispatcher("inscripcionClaseDeportiva.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response); // Para manejar peticiones POST de la misma forma
        
        String BuscaAct  = request.getParameter("buscar");

        // Procesar la inscripción
        Fabrica fab = Fabrica.getInstance();
        String clase = request.getParameter("clase");
        HttpSession session = request.getSession(false);
        String nombre = (String) session.getAttribute("usuarioLogueado");
        String cupoStr = request.getParameter("cupo");

        try {
        	if  (BuscaAct != null) {
        		 Vector<String> vClases = fab.getIControladorActividad().obtenerVectorClasesActividad(BuscaAct);
                 System.out.println(vClases);
                 request.setAttribute("listCla", vClases);
        	}
            int cupo = Integer.parseInt(cupoStr);
            LocalDate fechaHoy = LocalDate.now();
            fab.getIControladorClaseDeportiva().AltainscripcionAClase(clase, nombre, cupo, fechaHoy);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (ClaseNoExisteException e) {
            e.printStackTrace();
        }
    }
}