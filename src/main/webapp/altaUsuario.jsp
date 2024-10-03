<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario de Alta de Usuario</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100">

    <nav class="bg-blue-600 p-4">
        <h1 class="text-white text-2xl text-center">Registro de Usuarios</h1>
    </nav>

    <div class="flex">
        <nav class="bg-white w-64 h-screen p-5 border-r border-gray-200">
            <h5 class="font-semibold mb-4">Men�</h5>
            <ul>
                <li><a class="block text-gray-700 hover:bg-gray-200 p-2 rounded" href="#">Inicio</a></li>
                <li><a class="block text-gray-700 hover:bg-gray-200 p-2 rounded" href="#">Perfil</a></li>
                <li><a class="block text-gray-700 hover:bg-gray-200 p-2 rounded" href="#">Configuraciones</a></li>
                <li><a class="block text-gray-700 hover:bg-gray-200 p-2 rounded" href="#">Ayuda</a></li>
            </ul>
        </nav>

        <main class="flex-1 p-5">
            <div class="bg-white rounded-lg shadow-md p-6 max-w-lg mx-auto">
                <h2 class="text-center text-2xl font-bold mb-4">Formulario de Alta de Usuario</h2>
                <form id="userForm" action="altaUsuario" method="POST">
                    <div class="mb-4">
                        <label for="nombre" class="block text-gray-700">Nombre:</label>
                        <input type="text" id="nombre" name="nombre" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="apellido" class="block text-gray-700">Apellido:</label>
                        <input type="text" id="apellido" name="apellido" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="nickname" class="block text-gray-700">Nickname:</label>
                        <input type="text" id="nickname" name="nickname" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="email" class="block text-gray-700">Correo Electr�nico:</label>
                        <input type="email" id="email" name="email" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="fecha" class="block text-gray-700">Fecha de Nacimiento:</label>
                        <input type="date" id="fecha" name="fecha" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="contrasena" class="block text-gray-700">Contrase�a:</label>
                        <input type="password" id="contrasena" name="contrasena" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <div class="mb-4">
                        <label for="confirmar" class="block text-gray-700">Confirmar Contrase�a:</label>
                        <input type="password" id="confirmar" name="confirmar" class="border border-gray-300 rounded w-full p-2" required>
                    </div>

                    <label class="block text-gray-700 mb-2">Selecciona tu rol:</label>
                    <button type="button" class="bg-blue-500 text-white rounded w-full p-2 mb-2 hover:bg-blue-600" onclick="selectRole('deportista')">Deportista</button>
                    <button type="button" class="bg-blue-500 text-white rounded w-full p-2 mb-4 hover:bg-blue-600" onclick="selectRole('entrenador')">Entrenador</button>

                    <div id="deportistaFields" class="hidden mb-4">
                        <label class="block text-gray-700">�Eres profesional?</label>
                        <input type="radio" id="profesional_si" name="profesional" value="si">
                        <label for="profesional_si">S�</label>
                        <input type="radio" id="profesional_no" name="profesional" value="no">
                        <label for="profesional_no">No</label>
                    </div>

                    <div id="entrenadorFields" class="hidden mb-4">
                        <div>
                            <label for="disciplina" class="block text-gray-700">�Cu�l es tu disciplina?</label>
                            <input type="text" id="disciplina" name="disciplina" class="border border-gray-300 rounded w-full p-2">
                        </div>
                        <div>
                            <label for="sitio_web" class="block text-gray-700">Sitio Web:</label>
                            <input type="text" id="sitio_web" name="sitio_web" class="border border-gray-300 rounded w-full p-2">
                        </div>
                    </div>
                    <button type="submit" id= "CargaUsuario" class="bg-blue-500 text-white rounded w-full p-2 hover:bg-blue-600">Enviar</button>
                </form>
            </div>
        </main>
    </div>

    <script>
     	
        function selectRole(role) {
            const deportistaFields = document.getElementById('deportistaFields');
            const entrenadorFields = document.getElementById('entrenadorFields');

            deportistaFields.classList.toggle('hidden', role !== 'deportista');
            entrenadorFields.classList.toggle('hidden', role !== 'entrenador');
        }

        document.getElementById('userForm').onsubmit = function(event) {
            const password = document.getElementById('contrasena').value;
            const confirmPassword = document.getElementById('confirmar').value;
            if (password !== confirmPassword) {
                alert("Las contrase�as no coinciden.");
                event.preventDefault();
            }
        };
    </script>

</body>
</html>