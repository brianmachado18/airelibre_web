<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Notificación</title>
    <link href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css" rel="stylesheet">
</head>
<body class="bg-gray-100">

    <nav class="bg-blue-600 p-4">
        <h1 class="text-white text-2xl text-center"></h1>
    </nav>

    <div class="flex">
        <nav class="w-64 h-screen p-5 ">
        </nav>

        <main class="flex-1 p-5">
            <div class="bg-white rounded-lg shadow-md p-6 max-w-lg mx-auto text-center">
                <h2 class="text-2xl font-bold mb-4">${estado}</h2>
                <p class="text-gray-700 mb-4">${mensaje}</p>
            </div>
        </main>
    </div>

</body>
</html>
