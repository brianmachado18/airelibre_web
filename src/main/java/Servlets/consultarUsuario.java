package Servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import servidor.PersistenciaException_Exception;

@WebServlet("/consultarUsuario")
@MultipartConfig
public class consultarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public consultarUsuario() {
		super();
	}

	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, PersistenciaException_Exception {

		servidor.PublicadorService service = new servidor.PublicadorService();
		servidor.Publicador port = service.getPublicadorPort();

		// Cambia Vector a List
		List<String> vUsuarios = port.obtenerVectorUsuarios(); // Asegúrate de que este método devuelva List<String>
		request.setAttribute("listUsu", vUsuarios);

		String nickname = request.getParameter("buscar");

		if (port.usuarioExiste(nickname)) {
			RequestDispatcher rd;
			if (port.esEntrenador(nickname)) {
				servidor.DtEntrenador traerEntrenador = port.obtenerEntrenador(nickname);
				request.setAttribute("nombre", traerEntrenador.getNombre());
				request.setAttribute("apellido", traerEntrenador.getApellido());
				request.setAttribute("nickname", traerEntrenador.getNickname());
				request.setAttribute("correo", traerEntrenador.getMail());
				request.setAttribute("fnac", traerEntrenador.getFechaNacimientoString());
				request.setAttribute("tipoUsuario", "Entrenador");
				request.setAttribute("web", traerEntrenador.getSitioWeb());
				request.setAttribute("disciplina", traerEntrenador.getDisciplina());
				request.setAttribute("imgen", request.getContextPath() + traerEntrenador.getImagen());
				HttpSession session = request.getSession(false);

				if (nickname.equals((String) session.getAttribute("usuarioLogueado"))) {
					// FUNCIONA --- NO TOCAR
					request.setAttribute("actividades", port.obtenerArrayActividadesEntrenador(nickname));
				} else {
					// FUNCIONA --- NO TOCAR
					request.setAttribute("actividadesAceptadas", port.obtenerArrayActividadesAceptadasEntrenador(nickname));
				}

				rd = request.getRequestDispatcher("/consultarUsuario.jsp");
				rd.forward(request, response);
			} else {
				servidor.DtDeportista traerDeportista = port.obtenerDeportista(nickname);
				request.setAttribute("nombre", traerDeportista.getNombre());
				request.setAttribute("apellido", traerDeportista.getApellido());
				request.setAttribute("nickname", traerDeportista.getNickname());
				request.setAttribute("correo", traerDeportista.getMail());
				request.setAttribute("fnac", traerDeportista.getFechaNacimientoString());
				request.setAttribute("imgen", request.getContextPath() + traerDeportista.getImagen());
				request.setAttribute("tipoUsuario", "Deportista");

				request.setAttribute("prof", traerDeportista.isEsProfesional());

				HttpSession session = request.getSession(false);
				if (nickname.equals((String) session.getAttribute("usuarioLogueado"))) {
					request.setAttribute("inscrips", port.obtenerInscrpcionesDeportista(nickname));
				} else {
					request.setAttribute("clasesIns", port.obtenerClasesDeportista(nickname));
				}

				rd = request.getRequestDispatcher("/consultarUsuario.jsp");
				rd.forward(request, response);
			}
		} else {
			RequestDispatcher rd;
			request.setAttribute("estado", "Vuelva a intentar más tarde.");
			request.setAttribute("mensaje", "El usuario no existe.");
			request.setAttribute("pag", "\"consultarUsuario.jsp\"");
			rd = request.getRequestDispatcher("/notificacion.jsp");
			rd.forward(request, response);
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		servidor.PublicadorService service = new servidor.PublicadorService();
		servidor.Publicador port = service.getPublicadorPort();

		List<String> vUsuarios = new ArrayList<>();
		try {
			vUsuarios = port.obtenerVectorUsuarios();
			request.setAttribute("listUsu", vUsuarios);
		} catch (PersistenciaException_Exception e) {
			e.printStackTrace();
		}

		RequestDispatcher rd = request.getRequestDispatcher("consultarUsuario.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			processRequest(request, response);
		} catch (ServletException | IOException | PersistenciaException_Exception e) {
			e.printStackTrace();
		}
	}
}
