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


@WebServlet("/index")
@MultipartConfig
public class index extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public index() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	 HttpSession session = request.getSession(false); // Evita crear una nueva sesión si no existe
    	    
    	    if (session != null) {
    	        String usuarioLogueado = (String) session.getAttribute("usuarioLogueado");
    	        String tipoUsuario = (String) session.getAttribute("tipoUsuario");
    	        
    	        if (usuarioLogueado != null) {
    	            request.setAttribute("isLogged", true);
    	            request.setAttribute("uTipo", tipoUsuario);
    	        } else {
    	            request.setAttribute("isLogged", false);
    	        }
    	    } else {
    	        request.setAttribute("isLogged", false);
    	    }
    	    
    	    RequestDispatcher rd = request.getRequestDispatcher("/index.jsp");
    	    rd.forward(request, response);

    	
    }
}
