<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Modificar Usuarios</title>
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
			<h1 class="text-white text-2xl">Modifiación de Usuarios</h1>
		</div>
		<a id="acs" href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar
			Sesion</a>
	</nav>

	<div class="flex">
		<!-- Menï¿½ lateral -->
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
                    <label for="correo" class="block text-gray-700">Correo Electronico:</label>
                    <input type="email" id="correo" name="correo" class="border border-gray-300 rounded w-full p-2"
                           value="${correo}" disabled>
                </div>

                <div class="mb-4">
                    <label for="fechaNacimiento" class="block text-gray-700">Fecha de Nacimiento:</label>
                    <input type="date" id="fechaNacimiento" name="fechaNacimiento" class="border border-gray-300 rounded w-full p-2"
                           value="${fnac}" required>
                </div>

                <div class="mb-4">
                    <label for="contrasena" class="block text-gray-700">Contrasena:</label>
                    <input type="password" id="contrasena" name="contrasena" class="border border-gray-300 rounded w-full p-2"
                           value="${con}" required>
                </div>

                <div class="mb-4">
                    <label for="confirmarContrasena" class="block text-gray-700">Confirmar Contrasena:</label>
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

			<!-- Cuadro de imagen separado, pero mï¿½s cerca -->
			<div
				class="bg-white rounded-lg shadow-md w-48 h-48 flex items-center justify-center">
				<!-- Sin margen izquierdo -->
				<img id="userImage" src="${imgen}"
					alt="Imagen de Usuario"
					class="w-full h-full object-cover rounded-lg">
			</div>
		</div>
	</div>

                    <div id="deportistaFields" class="hidden mb-4">
                        <label class="block text-gray-700">¿Eres profesional?</label>
                        <input type="radio" id="profesional_si" name="profesional" value="si">
                        <label for="profesional_si">Si</label>
                        <input type="radio" id="profesional_no" name="profesional" value="no">
                        <label for="profesional_no">No</label>
                    </div>

                    <div id="entrenadorFields" class="hidden mb-4">
                        <div>
                            <label for="disciplina" class="block text-gray-700">¿Cual es tu disciplina?</label>
                            <input type="text" id="disciplina" name="disciplina" class="border border-gray-300 rounded w-full p-2">
                        </div>
                        <div>
                            <label for="sitio_web" class="block text-gray-700">Sitio Web:</label>
                            <input type="text" id="sitio_web" name="sitio_web" class="border border-gray-300 rounded w-full p-2">
                        </div>
                    </div>
                </form>
            </div>

            <!-- Cuadro de imagen separado, pero mï¿½s cerca -->
            <div class="bg-white rounded-lg shadow-md w-48 h-48 flex items-center justify-center">
                <img id="userImage" src="https://via.placeholder.com/150" alt="Imagen de Usuario" class="w-full h-full object-cover rounded-lg">
            </div>
        </div>
    </div>
    
    <script type="text/javascript" src="js/menu.jsp"></script>
    
    <script>
    
        function selectRole(role) {
            const deportistaFields = document.getElementById('deportistaFields');
            const entrenadorFields = document.getElementById('entrenadorFields');
            
            const profesionalSi = document.getElementById('profesional_si');
            const profesionalNo = document.getElementById('profesional_no');
            const disciplina = document.getElementById('disciplina');

            deportistaFields.classList.toggle('hidden', role !== 'Deportista');
            entrenadorFields.classList.toggle('hidden', role !== 'Entrenador');
            
            if (role === 'Deportista') {
                profesionalSi.setAttribute('required', true);
                profesionalNo.setAttribute('required', true);
                disciplina.removeAttribute('required');
            } else {
                profesionalSi.removeAttribute('required');
                profesionalNo.removeAttribute('required');
                disciplina.setAttribute('required', true);
            }
        }

        document.getElementById('userForm').onsubmit = function(event) {
            const password = document.getElementById('contrasena').value;
            const confirmPassword = document.getElementById('confirmar').value;
            if (password !== confirmPassword) {
                alert("Las contrasenas no coinciden.");
                event.preventDefault();
            }

            const imageInput = document.getElementById('imagen');
            const imagePath = imageInput.value;
            const allowedExtensions = /(\.jpg|\.jpeg|\.png)$/i;
            
            if (imagePath && !allowedExtensions.exec(imagePath)) {
                alert('Por favor sube un archivo de imagen valido (JPG, JPEG o PNG).');
                event.preventDefault();
                imageInput.value = '';
            }
        };
    </script>
	    <script type="text/javascript" src="js/menu.jsp"></script>
	    <script>
	    
	   	const tipoUsuario = '<%=session.getAttribute("tipoUsuario")%>'; 
	    if(tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
	    	document.getElementById("acs").innerText = "Cerrar Sesion";
	    	document.getElementById("acs").href = "logout"; 
	    
	    }
	    
        </script>
</body>
</html>
