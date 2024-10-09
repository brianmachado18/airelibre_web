package Servlets;

import java.io.IOException;
import java.util.regex.Pattern;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.*;
import excepciones.*;





@WebServlet("/login")
@MultipartConfig
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public login() {
        super();
        
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	
    	Fabrica fab = Fabrica.getInstance();
    	IControladorUsuario ICC = fab.getIControladorUsuario();
    	
    	String nickname = request.getParameter("username");
    	String password = request.getParameter("password");
    	//Boolean usuarioExiste;
    	Boolean consExiste = false;
    	
    	try {
    		
    		if(!Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$").matcher(nickname).matches()){
    			if(ICC.usuarioExiste(nickname, null)) {
    				consExiste = ICC.traerPass(nickname, null, password);
    			}
    		}else{
    			if(ICC.usuarioExiste(null, nickname)) {
    				consExiste = ICC.traerPass(null, nickname, password);
        			nickname = ICC.obtenerNickname(nickname);
    			}
    		}
    		
    		if(consExiste){
                HttpSession session = request.getSession();
                session.setAttribute("usuarioLogueado", nickname);
                if(ICC.esEntrenador(nickname)){
                	session.setAttribute("tipoUsuario", "Entrenador");
                }else {
                	session.setAttribute("tipoUsuario", "Deportista");
                }
                response.sendRedirect("index.jsp");
                
                
                //Visualizar datos guiardados en localStorage
//                HttpSession session2 = request.getSession(false);
//                if (session2 != null) {
//                    String usuarioLogueado = (String) session2.getAttribute("usuarioLogueado");
//                    if (usuarioLogueado != null) {
//                        System.out.println("Usuario logueado: " + usuarioLogueado);
//                    }
//                }
                //-------------------------------------------
                
                
    		}else{
				RequestDispatcher rd;
				request.setAttribute("estado", "Vuelva a intentar mas tarde.");
     			request.setAttribute("mensaje", "Usuario o Contrasena incorrecta.");
     			rd = request.getRequestDispatcher("/notificacion.jsp");
     			rd.forward(request, response);
    		}
    		
		} catch (PersistenciaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
