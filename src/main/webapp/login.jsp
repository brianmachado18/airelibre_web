<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inicio de Sesión</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100 flex items-center justify-center min-h-screen">

    <div class="bg-white rounded-lg shadow-md p-6 sm:p-8 w-full max-w-xs sm:max-w-md">
        <h2 class="text-center text-xl sm:text-2xl font-bold mb-4 sm:mb-6">Iniciar Sesión</h2>

        <form action="login" method="POST">
            <div class="mb-4">
                <label for="username" class="block text-gray-700 text-sm sm:text-base">Nombre de Usuario:</label>
                <input 
                    type="text" 
                    id="username" 
                    name="username" 
                    class="border border-gray-300 rounded w-full p-2 text-sm sm:text-base focus:outline-none focus:ring-2 focus:ring-blue-400" 
                    required>
            </div>

            <div class="mb-4">
                <label for="password" class="block text-gray-700 text-sm sm:text-base">Contraseña:</label>
                <input 
                    type="password" 
                    id="password" 
                    name="password" 
                    class="border border-gray-300 rounded w-full p-2 text-sm sm:text-base focus:outline-none focus:ring-2 focus:ring-blue-400" 
                    required>
            </div>

            <div class="text-center">
                <button 
                    type="submit" 
                    class="bg-blue-500 text-white rounded w-full sm:w-auto px-4 py-2 hover:bg-blue-600 transition">
                    Iniciar Sesión
                </button>
            </div>
        </form>

        <div class="mt-4 text-center flex flex-col sm:flex-row sm:justify-center sm:gap-2">
            <button 
                onclick="location.href='index.jsp'" 
                class="bg-gray-300 text-gray-700 rounded px-4 py-2 mb-2 sm:mb-0 hover:bg-gray-400 transition">
                Ingresar como Visitante
            </button>
            <button 
                onclick="location.href='altaUsuario.jsp'" 
                class="bg-green-500 text-white rounded px-4 py-2 hover:bg-green-600 transition">
                Registrarse
            </button>
        </div>
    </div>

</body>
</html>
