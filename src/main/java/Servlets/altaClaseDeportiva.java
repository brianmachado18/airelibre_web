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
import excepciones.*;
import datatype.*;

@WebServlet("/altaClaseDeportiva")
@MultipartConfig
public class altaClaseDeportiva extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public altaClaseDeportiva() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Fabrica fab = Fabrica.getInstance();
        IControladorClaseDeportiva ICC = fab.getIControladorClaseDeportiva();
        IControladorActividad ICA = fab.getIControladorActividad();

        // Obtener los parámetros del formulario
        String nombreClaseDeportiva = request.getParameter("nombre");
        String fecha = request.getParameter("fecha");
        String hora = request.getParameter("hora");
        String lugar = request.getParameter("lugar");
        int cupo = Integer.parseInt(request.getParameter("cupo"));
        String actividad = request.getParameter("actividad");
        String fechaAlta = request.getParameter("fechaAlta"); 

        // Manejo de la imagen (opcional)
        Part archivo = request.getPart("imagen");
        String nombreArchivo = null;
        String extension = null;
        String rutaArchivo = null;
       
        if (archivo.getSize() > 0) {
            nombreArchivo = archivo.getSubmittedFileName();
            extension = nombreArchivo.substring(nombreArchivo.lastIndexOf("."));
        }
        LocalDate fechaAux = LocalDate.parse(fecha, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate fechaAux2 = LocalDate.parse(fechaAlta, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        DateTimeFormatter formatoHora = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime horaFor = LocalTime.parse(hora, formatoHora);
        DtActividad Act = ICA.obtenerActividad(actividad);
        
        // Crear la nueva clase deportiva
        ClaseDeportiva nuevaClaseDeportiva = new ClaseDeportiva();
        try {
        	ICC.AltaClaseDeportiva(nombreClaseDeportiva, fechaAux, horaFor, lugar, cupo, fechaAux2, Act);

            // Redirigir a la página de éxito
            request.setAttribute("estado", "Clase Deportiva creada exitosamente.");
            RequestDispatcher rd = request.getRequestDispatcher("/notificacion.jsp");
            rd.forward(request, response);

        } catch (Exception e) {
 			RequestDispatcher rd;
 			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
 			request.setAttribute("mensaje", "Error al conectarse a la base de datos.");
 			rd = request.getRequestDispatcher("/notificacion.jsp");
 			rd.forward(request, response);
        	e.printStackTrace();
        }
    }
}
