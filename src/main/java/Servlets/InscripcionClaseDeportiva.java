package Servlets;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import servidor.ClaseNoExisteException_Exception;
import servidor.PersistenciaException_Exception;

@WebServlet("/InscripcionClaseDeportiva")
public class InscripcionClaseDeportiva extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, PersistenciaException_Exception, ClaseNoExisteException_Exception {
    	  String BuscaAct  = request.getParameter("buscar");

    	  servidor.PublicadorService service = new servidor.PublicadorService();
          servidor.Publicador port = service.getPublicadorPort();

          String clase = request.getParameter("clase");
          HttpSession session2 = request.getSession();
          if(clase != null){
          	session2.setAttribute("ClaseGuardada", clase);
          }
          
          if(port.actividadExiste(BuscaAct)) { 
          	System.out.println("Entro a actividad existe");
          try {
          	System.out.println(BuscaAct);
          	if  (port.actividadExiste(BuscaAct)) {
          		 List<String> vClases = port.obtenerVectorClasesActividad(BuscaAct);
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
          
          //  AGREGA LA INSCRIPCION
          }
          else{
          	String cupoStr = request.getParameter("cupo");
          	System.out.println("Cupo = " + cupoStr  );
          	if(cupoStr == null ) {

          	    servidor.DtClaseDeportiva tClase = port.obtenerClase(clase);
          		request.setAttribute("nombre", tClase.getNombre());
                  request.setAttribute("fecha", tClase.getFecha());
                  request.setAttribute("hora", tClase.getHora());
                  request.setAttribute("lugar", tClase.getLugar());
                  request.setAttribute("cupo", tClase.getCupo());
                  request.getRequestDispatcher("/inscripcionClaseDeportiva.jsp").forward(request, response);
          		
          	}
          	else {
          		
          	System.out.println("control usuario en clase");
          	//control usuario en clase
          	HttpSession session = request.getSession(false);
   	        String nombre = (String) session.getAttribute("usuarioLogueado");
   	        
          	if (port.deportistaEstaEnClase(nombre,(String) session2.getAttribute("ClaseGuardada"))){
          		RequestDispatcher rd;
      			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
       			request.setAttribute("mensaje", "El Usuario ya esta inscripto a esta clase.");
       			request.setAttribute("pag", "\"inscripcionClaseDeportiva.jsp\"");
       			rd = request.getRequestDispatcher("/notificacion.jsp");
       			rd.forward(request, response);
              }
              else  {
              	System.out.println("CONTROL CANTIDAD DE CUPOS IMPLEMENTAR");
              	//CONTROL CANTIDAD DE CUPOS IMPLEMENTAR
              	int cupo = Integer.parseInt(cupoStr);
              	int cuposdis = port.cuposDisponiblesEnClase((String) session2.getAttribute("ClaseGuardada"));
  		        if (cuposdis < cupo) {
  		        	RequestDispatcher rd;
  	    			request.setAttribute("estado", "Vuelva a intentar mas tarde.");
  	     			request.setAttribute("mensaje", "No hay tantos cupos. Cupos disponibles: " + cuposdis);
  	     			request.setAttribute("pag", "\"inscripcionClaseDeportiva.jsp\"");
  	     			rd = request.getRequestDispatcher("/notificacion.jsp");
  	     			rd.forward(request, response);
  	     		}
  		        else {	
  			        try {
  			        	System.out.println("Inscribe deportista");
  			            LocalDate fechaHoy = LocalDate.now();
  			            port.altainscripcionAClase((String) session2.getAttribute("ClaseGuardada"), nombre, cupo);
  			            RequestDispatcher rd;
  		     			request.setAttribute("pag", "\"inscripcionClaseDeportiva.jsp\"");
  		    			request.setAttribute("estado", "Felicitaciones");
  		     			request.setAttribute("mensaje", "Disfrute la clase");
  		     			rd = request.getRequestDispatcher("/notificacion.jsp");
  		     			rd.forward(request, response);
  			        } catch (NumberFormatException e) {
  			            e.printStackTrace();
  			        }
  			        }
  		        }
          }
          } 	
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
			processRequest(request, response);
		} catch (ServletException | IOException | PersistenciaException_Exception e) {
			e.printStackTrace();
		} catch (ClaseNoExisteException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	try {
			processRequest(request, response);
		} catch (ServletException | IOException | PersistenciaException_Exception e) {
			e.printStackTrace();
		} catch (ClaseNoExisteException_Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
      
    }
        
        
        
   
        
    }
