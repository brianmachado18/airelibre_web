<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesión</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 flex items-center justify-center h-screen">

    <div class="bg-white rounded-lg shadow-md p-8 max-w-md w-full">
        <h2 class="text-center text-2xl font-bold mb-6">Iniciar Sesión</h2>

        <form action="login" method="POST">
            <div class="mb-4">
                <label for="username" class="block text-gray-700">Nombre de Usuario:</label>
                <input type="text" id="username" name="username" class="border border-gray-300 rounded w-full p-2" required>
            </div>

            <div class="mb-4">
                <label for="password" class="block text-gray-700">Contraseña:</label>
                <input type="password" id="password" name="password" class="border border-gray-300 rounded w-full p-2" required>
            </div>

            <div class="text-center">
                <button type="submit" class="bg-blue-500 text-white rounded p-2 hover:bg-blue-600">Iniciar Sesión</button>
            </div>
        </form>

        <div class="mt-4 text-center">
            <button onclick="location.href='index.jsp'" class="bg-gray-300 text-gray-700 rounded p-2 hover:bg-gray-400">Ingresar como Visitante</button>
            <button onclick="location.href='altaUsuario.jsp'" class="bg-green-500 text-white rounded p-2 hover:bg-green-600 ml-2">Registrarse</button>
        </div>
    </div>
    <script>
        
        
    document.addEventListener("DOMContentLoaded", function() {
        // Obtener el atributo de sesión desde el JSP
        var tipoUsuario = '<%= session.getAttribute("tipoUsuario") %>';
        var usuarioLogueado = '<%= session.getAttribute("usuarioLogueado") %>';
        // Almacenar el valor en sessionStorage
        if (tipoUsuario && usuarioLogueado) {
        	localStorage.setItem('tipoUsuario', tipoUsuario);
        	localStorage.setItem('usuarioLogueado', usuarioLogueado);
        } else {
            console.log('No hay valor para almacenar en sessionStorage.');
        }
    });
    </script>
</body>
</html>
