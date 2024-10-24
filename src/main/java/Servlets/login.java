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
import servidor.PersistenciaException_Exception;
import excepciones.*;





@WebServlet("/login")
@MultipartConfig
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    public login() {
        super();
        
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    	    throws ServletException, IOException, PersistenciaException_Exception {
    	        
    			
    			String nickname = request.getParameter("username");
    			String password = request.getParameter("password");
    			
    			Boolean consExiste = false;

                // ESTO SE GENERA CON EL WSIMPORT Y SUSTITUYE, OBTENER FABRICA, OBTENER CONTROLADOR E INVOCAR OPERACION
                // consumo el servicio publicado
                servidor.PublicadorService service = new servidor.PublicadorService();
                servidor.Publicador port = service.getPublicadorPort();
                
               
                
            	if(!Pattern.compile("^[a-zA-Z0-9._]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$").matcher(nickname).matches()){
					if(port.usuarioExiste(nickname)) {
						consExiste = port.traerPass(nickname, password);
					}
				}else{
					if(port.usuarioExiste(nickname)) {
						nickname = port.obtenerNickname(nickname);
						consExiste = port.traerPass( nickname, password);
					}
				}
				
				if(consExiste){
				    HttpSession session = request.getSession();
				    session.setAttribute("usuarioLogueado", nickname);
				    if(port.esEntrenador(nickname)){
				    	session.setAttribute("tipoUsuario", "Entrenador");
				    }else {
				    	session.setAttribute("tipoUsuario", "Deportista");
				    }
				    response.sendRedirect("index.jsp");
				}else{
					RequestDispatcher rd;
					request.setAttribute("estado", "Vuelva a intentar mas tarde.");
					request.setAttribute("mensaje", "Usuario o Contrasena incorrecta.");
					request.setAttribute("pag", "\"login.jsp\"");
					rd = request.getRequestDispatcher("/notificacion.jsp");
					rd.forward(request, response);
				}
        
    } 

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	 try {
			processRequest(request, response);
		} catch (ServletException | IOException | PersistenciaException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
