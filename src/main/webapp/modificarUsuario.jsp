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
		<a id="acs" href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar
			Sesión</a>
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

  			<form id="modificarForm" action="modificarUsuario" method="POST" >
                <div class="mb-4">
                    <label for="nombre" class="block text-gray-700">Nombre:</label>
                    <input type="text" id="nombre" name="nombre" class="border border-gray-300 rounded w-full p-2"
                           value="${nombre}" required>
                </div>
                
                <div class="mb-4">
                    <label for="apellido" class="block text-gray-700">Apellido:</label>
                    <input type="text" id="apellido" name="apellido" class="border border-gray-300 rounded w-full p-2"
                           value="${apellido}" required>
                </div>

                <div class="mb-4">
                    <label for="nickname" class="block text-gray-700">Nickname:</label>
                    <input type="text" id="nickname" name="nickname" class="border border-gray-300 rounded w-full p-2"
                           value="${nickname}" disabled>
                </div>

                <div class="mb-4">
                    <label for="correo" class="block text-gray-700">Correo Electrónico:</label>
                    <input type="email" id="correo" name="correo" class="border border-gray-300 rounded w-full p-2"
                           value="${correo}" disabled>
                </div>

                <div class="mb-4">
                    <label for="fechaNacimiento" class="block text-gray-700">Fecha de Nacimiento:</label>
                    <input type="date" id="fechaNacimiento" name="fechaNacimiento" class="border border-gray-300 rounded w-full p-2"
                           value="${fnac}" required>
                </div>

                <div class="mb-4">
                    <label for="contrasena" class="block text-gray-700">Contraseña:</label>
                    <input type="password" id="contrasena" name="contrasena" class="border border-gray-300 rounded w-full p-2"
                           value="${con}" required>
                </div>

                <div class="mb-4">
                    <label for="confirmarContrasena" class="block text-gray-700">Confirmar Contraseña:</label>
                    <input type="password" id="confirmarContrasena" name="confirmarContrasena" class="border border-gray-300 rounded w-full p-2"
                           value="${con}" required>
                </div>

                <div class="mb-4">
                    <label for="rol" class="block text-gray-700">Rol:</label>
                    <input type="text" id="rol" name="rol" class="border border-gray-300 rounded w-full p-2"
                           value="${tipoUsuario}" disabled>
                </div>

                <button type="submit" class="bg-blue-500 text-white rounded w-full p-2 hover:bg-blue-600">Guardar Cambios</button>
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
	    
	   	const tipoUsuario = '<%=session.getAttribute("tipoUsuario")%>'; 
	    if(tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
	    	document.getElementById("acs").innerText = "Cerrar Sesión";
	    	document.getElementById("acs").href = "logout"; 
	    
	    }
	    
        </script>
</body>
</html>
