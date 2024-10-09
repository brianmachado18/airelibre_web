<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alta Clase Deportiva</title>
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
            <h1 class="text-white text-2xl">Registro de Clases Deportivas</h1>
        </div>
        <a href="cerrarSesion.jsp" class="text-white hover:text-blue-200 ml-4">Cerrar Sesión</a>
    </nav>

    <div class="flex">
        <!-- Menú lateral -->
		<div id="menuLateral"></div>

        <!-- Contenedor para el formulario -->
        <div class="flex-1 p-5 flex items-start" style="margin-left: 25rem;">
            <!-- Formulario para crear clase deportiva -->
            <div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full" style="margin-right: 2rem;">
                <h2 class="text-center text-2xl font-bold mb-4">Alta Clase Deportiva</h2>

                <form id="activityForm" action="altaClaseDeportiva" method="POST" enctype="multipart/form-data">
                    <div class="mb-4">
                        <label for="nombre" class="block text-gray-700">Nombre:</label>
                        <input type="text" id="nombre" name="nombre" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="fecha" class="block text-gray-700">Fecha:</label>
                        <input type="date" id="fecha" name="fecha" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="hora" class="block text-gray-700">Hora:</label>
                        <input type="time" id="hora" name="hora" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="lugar" class="block text-gray-700">Lugar:</label>
                        <input type="text" id="lugar" name="lugar" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="imagen" class="block text-gray-700">Subir Imagen:</label>
                        <input type="file" id="imagen" name="imagen" accept="image/png, image/jpeg" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="fechaAlta" class="block text-gray-700">Fecha de Alta:</label>
                        <input type="date" id="fechaAlta" name="fechaAlta" class="border border-gray-300 rounded w-full p-2" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="cupo" class="block text-gray-700">Cupo:</label>
                        <input type="number" id="cupo" name="cupo" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="actividad" class="block text-gray-700">Seleccionar Actividad:</label>
                        <select id="actividad" name="actividad" class="border border-gray-300 rounded w-full p-2" required>
                            <option value="Actividad1">Actividad 1</option>
                            <option value="Actividad2">Actividad 2</option>
                            <option value="Actividad3">Actividad 3</option>
                            <option value="Actividad4">Actividad 4</option>
                            <!-- Agrega más opciones según sea necesario -->
                        </select>
                    </div>

                    <div class="text-center">
                        <button type="submit" class="bg-blue-500 text-white rounded p-2 hover:bg-blue-600">Crear Clase Deportiva</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

       <script type="text/javascript" src="js/menu.jsp"></script>
<<<<<<< Updated upstream
<<<<<<< Updated upstream

=======
=======
>>>>>>> Stashed changes
		    <script type="text/javascript">
   	const tipoUsuario = '<%=session.getAttribute("tipoUsuario")%>'; 
    if(tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
    	document.getElementById("acs").innerText = "Cerrar Sesión";
    	document.getElementById("acs").href = "logout"; 
    
    }
</script>
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
</body>
</html>
