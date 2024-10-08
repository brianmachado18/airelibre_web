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
			<h1 class="text-white text-2xl">Registro de Usuarios</h1>
		</div>
		<a href="cerrarSesion.jsp" class="text-white hover:text-blue-200 ml-4">Cerrar
			Sesión</a>
	</nav>

	<div class="flex">
		<!-- Menú lateral -->
		<nav class="bg-white w-64 h-screen p-5 border-r border-gray-200">
			<h5 class="font-semibold mb-4">Menú</h5>
			<ul>
                <li>
                    <a id="usuariosToggle" class="block text-gray-700 hover:bg-gray-200 p-2 rounded cursor-pointer">Usuarios</a>
                    <ul id="submenuUsuarios" class="ml-4 mt-2 hidden">
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="altaUsuario.jsp">Alta Usuario</a></li>
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="consultarUsuario.jsp">Consultar Usuario</a></li>
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="modificarUsuario.jsp">Modificar Usuario</a></li>
                    </ul>
                </li>
                 <li>
                    <a id="actividadesToggle" class="block text-gray-700 hover:bg-gray-200 p-2 rounded cursor-pointer">Actividades</a>
                    <ul id="submenuActividades" class="ml-4 mt-2 hidden">
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="altaActividad.jsp">Alta Actividad</a></li>
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="consultarActividad.jsp">Consultar Actividad</a></li>
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="altaClase.jsp">Alta Clase Deportiva</a></li>
                    </ul>
                </li>
                <li><a class="block text-gray-700 hover:bg-gray-200 p-2 rounded" href="#">Ayuda</a></li>
            </ul>
		</nav>

		<!-- Contenedor para el formulario y la imagen -->
		<div class="flex-1 p-5 flex items-start" style="margin-left: 25rem;">
			<!-- Estilo inline para margen -->
			<!-- Formulario con campos bloqueados -->
			<div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full"
				style="margin-right: 2rem;">
				<h2 class="text-center text-2xl font-bold mb-4">Buscar Usuario</h2>

				<!-- Campo de búsqueda -->
				<form id="userForm" action="consultarUsuario" method="POST">
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

					<div class="mb-4">
						<label for="contrasena" class="block text-gray-700" >Contraseña:</label>
						<input type="password" id="contrasena" name="contrasena"
							class="border border-gray-300 rounded w-full p-2" value="${con}"disabled>
					</div>

					<div class="mb-4">
						<label for="confirmar" class="block text-gray-700">Confirmar
							Contraseña:</label> <input type="password" id="confirmar"
							name="confirmar"
							class="border border-gray-300 rounded w-full p-2"  value="${con}"disabled>
					</div>

					<label class="block text-gray-700 mb-2">Selecciona tu rol:</label>
					<button type="button" id = "srol"
						class="bg-blue-500 text-white rounded w-full p-2 mb-2 hover:bg-blue-600"
						onclick="selectRole('Deportista')"  disabled >Deportista</button>
					<button type="button" id = "srol"
						class="bg-blue-500 text-white rounded w-full p-2 mb-4 hover:bg-blue-600"
						onclick="selectRole('Entrenador')" disabled >Entrenador</button>

					<div id="deportistaFields" class="hidden mb-4">
						<label class="block text-gray-700">¿Eres profesional?</label> <input
							type="radio" id="profesional_si" name="profesional" value="si" disabled>
						<label for="profesional_si">Sí</label> <input type="radio"
							id="profesional_no" name="profesional" value="no" disabled> <label
							for="profesional_no">No</label>
					</div>

					<div id="entrenadorFields" class="hidden mb-4">
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

	<script>
		// Script para mostrar/ocultar el submenú de usuarios
		 document.getElementById('usuariosToggle').onclick = function() {
            const submenuUsuarios = document.getElementById('submenuUsuarios');
            submenuUsuarios.classList.toggle('hidden');
        };

        document.getElementById('actividadesToggle').onclick = function() {
            const submenuActividades = document.getElementById('submenuActividades');
            submenuActividades.classList.toggle('hidden');
        };
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
           
	        
	    });

	</script>
</body>
</html>
