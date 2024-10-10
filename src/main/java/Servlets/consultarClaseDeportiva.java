package Servlets;

import java.io.IOException;

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

@WebServlet("/consultarClaseDeportiva")
@MultipartConfig
public class consultarClaseDeportiva extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public consultarClaseDeportiva() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        String actividadSeleccionada = request.getParameter("claseSeleccionada");
        request.setAttribute("nom", actividadSeleccionada);
        
        RequestDispatcher rd = request.getRequestDispatcher("consultarClaseDeportiva.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    }
}