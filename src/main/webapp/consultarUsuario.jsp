<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Consultar Usuarios</title>
<link
	href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css"
	rel="stylesheet">
<style>
.hidden {
	display: none;
}
</style>
</head>
<body class="bg-gray-100">

	<nav class="bg-blue-600 p-4 flex justify-between items-center">
		<div class="flex-grow text-center">
			<h1 class="text-white text-2xl">Consulta de Usuarios</h1>
		</div>
		<a href="cerrarSesion.jsp" class="text-white hover:text-blue-200 ml-4">Cerrar Sesión</a>
	</nav>

	<div class="flex">
		<!-- Menú lateral -->
        <div id="menuLateral"></div>


		<!-- Contenedor para el formulario y la imagen -->
		<div class="flex-1 p-5 flex items-start" style="margin-left: 25rem;">
			<!-- Estilo inline para margen -->
			<!-- Formulario con campos bloqueados -->
			<div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full"
				style="margin-right: 2rem;">
				<h2 class="text-center text-2xl font-bold mb-4">Buscar Usuario</h2>

				<!-- Campo de búsqueda -->
				<form id="userForm" action="consultarUsuario" method="POST">
					<div class="mb-4">
            			<label for="clases" class="block text-gray-700">Usuarios:</label>
            			<select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >
                    		<%@ page import="java.util.Vector" %>
							<%@ page import="java.util.Iterator" %>
							<%@ page import="logica.Fabrica" %>
							<%
                    		Fabrica fab = Fabrica.getInstance();
							Vector<String> usus = fab.getIControladorUsuario().obtenerVectorUsuarios();
							if (usus!=null){
								for (String u : usus){ 
									out.print("<option value='"+u+"'>"+u+"</option>");
								}
							}
							%>
            			</select>
            		</div>
					<div class="mb-4 flex">
						<input type="text" id="buscar" name="buscar"
							placeholder="Buscar usuario..."
							class="border border-gray-300 rounded w-full p-2" required>
						<button type="submit"
							class="bg-blue-500 text-white rounded p-2 ml-2 hover:bg-blue-600">Buscar</button>
					</div>
				</form>

				<form id="userForm">
					<div class="mb-4">
						<label for="nombre" class="block text-gray-700" >Nombre:</label> 
						<input
							type="text" id="nombre" name="nombre"
							class="border border-gray-300 rounded w-full p-2" value="${nombre}" disabled>
					</div>

					<div class="mb-4">
						<label for="apellido" class="block text-gray-700" >Apellido:</label>
						<input type="text" id="apellido" name="apellido"
							class="border border-gray-300 rounded w-full p-2" value="${apellido}"disabled>
					</div>

					<div class="mb-4">
						<label for="nickname" class="block text-gray-700" >Nickname:</label>
						<input type="text" id="nickname" name="nickname"
							class="border border-gray-300 rounded w-full p-2" value="${nickname}"disabled>
					</div>

					<div class="mb-4">
						<label for="email" class="block text-gray-700">Correo
							Electrónico:</label> <input type="email" id="email" name="email"
							class="border border-gray-300 rounded w-full p-2"  value="${correo}"disabled>
					</div>

					<div class="mb-4">
						<label for="fecha" class="block text-gray-700" >Fecha de
							Nacimiento:</label> <input type="date" id="fecha" name="fecha"
							class="border border-gray-300 rounded w-full p-2"value="${fnac}" disabled>
					</div>

					<label class="block text-gray-700 mb-2">Rol:</label>
					
					

					<div id="deportistaFields" class="hidden mb-4">
						<button type="button" id = "srol"
							class="bg-blue-500 text-white rounded w-full p-2 mb-2 hover:bg-blue-600"
							onclick="selectRole('Deportista')"  disabled >Deportista</button>
						<label class="block text-gray-700">¿Eres profesional?</label> <input
							type="radio" id="profesional_si" name="profesional" value="si" disabled>
						<label for="profesional_si">Sí</label> <input type="radio"
							id="profesional_no" name="profesional" value="no" disabled> <label
							for="profesional_no">No</label>
					</div>

					<div id="entrenadorFields" class="hidden mb-4">
						<button type="button" id = "srol"
							class="bg-blue-500 text-white rounded w-full p-2 mb-4 hover:bg-blue-600"
							onclick="selectRole('Entrenador')" disabled >Entrenador</button>
						<div>
							<label for="disciplina" class="block text-gray-700">¿Cuál
								es tu disciplina?</label> <input type="text" id="disciplina"
								name="disciplina"
								class="border border-gray-300 rounded w-full p-2" value="${disciplina}"disabled>
						</div>
						<div>
							<label for="sitio_web" class="block text-gray-700">Sitio
								Web:</label> <input type="text" id="sitio_web" name="sitio_web"
								class="border border-gray-300 rounded w-full p-2" value="${web}"disabled>
						</div>
					</div>
					
					<div id="inscrpcionesFieldsOtroDepor" class="hidden mb-4" style="display: none;">
						<label for="inscrp" class="block text-gray-700">Clases Inscripto:</label>
            			<select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >
                    		<%@ page import="java.util.Vector" %>
							<%@ page import="java.util.Iterator" %>
							<%
							Vector<String> clasesIns = (java.util.Vector<String>)request.getAttribute("clasesIns");
							if (clasesIns!=null){
								for (String ci : clasesIns){ 
									out.print("<option value='"+ci+"'>"+ci+"</option>");
								}
							}
							%>
            			</select>
					</div>
					
					<div id="inscrpcionesFieldsMismoDepor" class="hidden mb-4" style="display: none;">
						<label for="inscrp" class="block text-gray-700">Mis Inscripciones:</label>
            			<select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >
                    		<%@ page import="java.util.Vector" %>
							<%@ page import="java.util.Iterator" %>
							<%
							Vector<String> inscrips = (java.util.Vector<String>)request.getAttribute("inscrips");
							if (inscrips!=null){
								for (String in : inscrips){ 
									out.print("<option value='"+in+"'>"+in+"</option>");
								}
							}
							%>
            			</select>
					</div>
					
				</form>
			</div>

			<!-- Cuadro de imagen separado, pero más cerca -->
			<div
				class="bg-white rounded-lg shadow-md w-48 h-48 flex items-center justify-center">
				<!-- Sin margen izquierdo -->
				<img id="userImage" src="${imgen}"
					alt="Imagen de Usuario"
					class="w-full h-full object-cover rounded-lg">
			</div>
		</div>
	</div>

	    <script type="text/javascript" src="js/menu.jsp"></script>
	    <script>
	    function selectRole(role) {
            const deportistaFields = document.getElementById('deportistaFields');
            const entrenadorFields = document.getElementById('entrenadorFields');

            deportistaFields.classList.toggle('hidden', role !== 'Deportista');
            entrenadorFields.classList.toggle('hidden', role !== 'Entrenador');
        }

        document.addEventListener("DOMContentLoaded", function() {
            const profesionalSi = document.getElementById('profesional_si');
            const profesionalNo = document.getElementById('profesional_no');
            const SeleccionRol = document.getElementById('srol');

            SeleccionRol.disabled = true;
            selectRole("${tipoUsuario}"); 

            if("${prof}" == true){
                profesionalSi.checked = false;
                profesionalNo.checked = true;
            }else{
                profesionalNo.checked = false;
                profesionalSi.checked = true;
            }

            const inscrpcionesFieldsOtroDepor = document.getElementById('inscrpcionesFieldsOtroDepor');
            const inscrpcionesFieldsMismoDepor = document.getElementById('inscrpcionesFieldsMismoDepor');
            var nn = '<%= session.getAttribute("usuarioLogueado") %>';
            var tu = '<%= session.getAttribute("tipoUsuario") %>';
            if("${nickname}" == nn && 'Deportista' == tu){
            	inscrpcionesFieldsOtroDepor.style.display = "none";
            	inscrpcionesFieldsMismoDepor.style.display = "inline";
            }else if("${tipoUsuario}" == 'Deportista'){
            	inscrpcionesFieldsOtroDepor.style.display = "inline";
            	inscrpcionesFieldsMismoDepor.style.display = "none";
			}else{
				inscrpcionesFieldsOtroDepor.style.display = "none";
            	inscrpcionesFieldsMismoDepor.style.display = "none";
			}
            
        });</script>
</body>
</html>
