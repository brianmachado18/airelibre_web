<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alta Actividad</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
    <style>
        .hidden {
            display: none;
        }
    </style>
</head>
<body class="bg-gray-100">

    <nav class="bg-blue-600 p-4 flex justify-between items-center">
        <div class="flex-grow text-center">
            <h1 class="text-white text-2xl">Consulta de Actividades</h1>
        </div>
        <a href="login.jsp" class="text-white hover:text-blue-200 ml-4">Cerrar Sesión</a>
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
                    </ul>
                </li>
                                 <li>
                    <a id="clasesToggle" class="block text-gray-700 hover:bg-gray-200 p-2 rounded cursor-pointer">Clases Deportivas</a>
                    <ul id="submenuClases" class="ml-4 mt-2 hidden">
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="altaClaseDeportiva.jsp">Alta Clase Deportiva</a></li>
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="consultarClaseDeportiva.jsp">Consultar Clase Deportiva</a></li>
                        <li><a class="block text-gray-600 hover:bg-gray-200 p-2 rounded" href="inscripcionClaseDeportiva.jsp">Inscripción Clase Deportiva</a></li>
                    </ul>
                </li>
                <li><a class="block text-gray-700 hover:bg-gray-200 p-2 rounded" href="https://chatgpt.com/">Ayuda</a></li>
            </ul>
		</nav>

        <!-- Contenedor para el formulario -->
        <div class="flex-1 p-5 flex items-start" style="margin-left: 25rem;">
            <!-- Formulario para crear actividad -->
            <div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full" style="margin-right: 2rem;">
                <h2 class="text-center text-2xl font-bold mb-4">Buscar Actividad</h2>

				<!-- Campo de búsqueda -->
				<form id="userForm" action="consultarActividad" method="POST">
					<div class="mb-4 flex">
						<input type="text" id="buscar" name="buscar"
							placeholder="Buscar actividad..."
							class="border border-gray-300 rounded w-full p-2" required>
						<button type="submit"
							class="bg-blue-500 text-white rounded p-2 ml-2 hover:bg-blue-600">Buscar</button>
					</div>
				</form>

                <form id="activityForm" action="consultarActividad" method="POST" enctype="multipart/form-data">
                    <div class="mb-4">
                        <label for="nombre" class="block text-gray-700">Nombre:</label>
                        <input type="text" id="nombre" name="nombre" class="border border-gray-300 rounded w-full p-2" value="${nombre}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="descripcion" class="block text-gray-700">Descripción:</label>
                        <textarea id="descripcion" name="descripcion" class="border border-gray-300 rounded w-full p-2" disabled> ${descripcion}</textarea>
                    </div>

                    <div class="mb-4">
                        <label for="duracionHoras" class="block text-gray-700">Duración (Horas):</label>
                        <input type="number" id="duracionHoras" name="duracionHoras" class="border border-gray-300 rounded w-full p-2" value="${duracionHoras}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="costo" class="block text-gray-700">Costo:</label>
                        <input type="number" id="costo" name="costo" class="border border-gray-300 rounded w-full p-2" value="${costo}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="lugar" class="block text-gray-700">Lugar:</label>
                        <input type="text" id="lugar" name="lugar" class="border border-gray-300 rounded w-full p-2" value="${lugar}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="fechaAlta" class="block text-gray-700">Fecha de Alta:</label>
                        <input type="date" id="fechaAlta" name="fechaAlta" class="border border-gray-300 rounded w-full p-2" value="${fechaAlta}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="estado" class="block text-gray-700">Estado:</label>
                        <input type="text" id="estado" name="Estado" class="border border-gray-300 rounded w-full p-2" value="${estado}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="clases" class="block text-gray-700">Seleccionar Clases Asociadas:</label>
                        <select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >
                            <option value="Clase1">Clase 1</option>
                            <option value="Clase2">Clase 2</option>
                            <option value="Clase3">Clase 3</option>
                            <option value="Clase4">Clase 4</option>
                            <!-- Agrega más opciones según sea necesario -->
                        </select>
                    </div>
                </form>
            </div>
            <div class="bg-white rounded-lg shadow-md w-48 h-48 flex items-center justify-center">
				<!-- Sin margen izquierdo -->
				<img id="imagen" src="${imgen}" alt="Imagen de Actividad" class="w-full h-full object-cover rounded-lg">
			</div>
        </div>
    </div>

    <script>
        // Script para mostrar/ocultar los submenús
		 document.getElementById('usuariosToggle').onclick = function() {
            const submenuUsuarios = document.getElementById('submenuUsuarios');
            submenuUsuarios.classList.toggle('hidden');
        };

        document.getElementById('actividadesToggle').onclick = function() {
            const submenuActividades = document.getElementById('submenuActividades');
            submenuActividades.classList.toggle('hidden');
        };
        
        document.getElementById('clasesToggle').onclick = function() {
            const submenuActividades = document.getElementById('submenuClases');
            submenuActividades.classList.toggle('hidden');
        };
    </script>
</body>
</html>
