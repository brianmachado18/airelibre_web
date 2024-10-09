<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

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
            <h1 class="text-white text-2xl"></h1>
        </div>
        <a id="acs" href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar Sesión</a>
    </nav>

    <div class="flex">
        <!-- Menú lateral -->
        <div id="menuLateral"></div>

    </div>

    <script type="text/javascript" src="js/menu.jsp"></script>
<<<<<<< Updated upstream
=======
    <script type="text/javascript">
   	const tipoUsuario = '<%=session.getAttribute("tipoUsuario")%>'; 
    if(tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
    	document.getElementById("acs").innerText = "Cerrar Sesión";
    	document.getElementById("acs").href = "logout"; 
    
    }
</script>

>>>>>>> Stashed changes

</body>
</html>
