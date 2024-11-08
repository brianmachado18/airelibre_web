<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consulta Clase Deportiva</title>
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
            <h1 class="text-white text-2xl">Consulta de Clases Deportivas</h1>
        </div>
                <a id="acs" href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar Sesion</a>

    </nav>

    <div class="flex">
        <!-- Men� lateral -->
<div id="menuLateral"></div>

        <!-- Contenedor para el formulario -->
        <div class="flex-1 p-5 flex items-start" style="margin-left: 25rem;">
            <!-- Formulario para crear clase deportiva -->
            <div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full" style="margin-right: 2rem;">
                <h2 class="text-center text-2xl font-bold mb-4">Buscar Clase</h2>

				<!-- Campo de b�squeda -->
				<form id="userForm" action="consultarClaseDeportiva" method="POST">
					<div class="mb-4">
                        <label for="clases" class="block text-gray-700">Clases:</label>
                        <select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >

							<%
							List<String> clas = (List<String>)request.getAttribute("listCla");
							if (clas!=null){
								for (String c : clas){ 
									out.print("<option value='"+c+"'>"+c+"</option>");
								}
							}
							%>
                        </select>
                    </div>
                    
					<div class="mb-4 flex">
						<input type="text" id="buscar" name="buscar"
							placeholder="Buscar clase..."
							class="border border-gray-300 rounded w-full p-2" value= "${nom}" required>
						<button type="submit"
							class="bg-blue-500 text-white rounded p-2 ml-2 hover:bg-blue-600">Buscar</button>
					</div>
				</form>

                <form id="activityForm" action="altaClaseDeportiva" method="POST" enctype="multipart/form-data">
                    
                    <div class="mb-4">
                        <label for="nombre" class="block text-gray-700">Nombre:</label>
                        <input type="text" id="nombre" name="nombre" class="border border-gray-300 rounded w-full p-2" value="${nombre}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="fecha" class="block text-gray-700">Fecha:</label>
                        <input type="date" id="fecha" name="fecha" class="border border-gray-300 rounded w-full p-2" value="${fecha}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="hora" class="block text-gray-700">Hora:</label>
                        <input type="time" id="hora" name="hora" class="border border-gray-300 rounded w-full p-2" value="${hora}" disabled>
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
                        <label for="cupo" class="block text-gray-700">Cupo:</label>
                        <input type="number" id="cupo" name="cupo" class="border border-gray-300 rounded w-full p-2" value="${cupo}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="inscritos" class="block text-gray-700">Inscriptos:</label>
                        <select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >
							<%
							List<String> inscrips = (java.util.List<String>)request.getAttribute("inscrips");
							if (inscrips!=null){
								for (String i : inscrips){ 
									out.print("<option value='"+i+"'>"+i+"</option>");
								}
							}
							%>
                        </select>
                    </div>

                </form>
            </div>
            <div
				class="bg-white rounded-lg shadow-md w-48 h-48 flex items-center justify-center">
				<!-- Sin margen izquierdo -->
				<img id="userImage" src="${imgen}" alt="Imagen Clase Deportiva" class="w-full h-full object-cover rounded-lg">
			</div>
        </div>
    </div>

    <script type="text/javascript" src="js/menu.jsp"></script>
    <script type="text/javascript">
  	//Setear img default
	window.onload = function cargarImagenDefault(){
		if("${imgen}"=="" || "${imgen}"=="/airelibre_webnull"){
			document.getElementById("userImage").src = "https://via.placeholder.com/150";
		}
	}
    
   	const tipoUsuario = '<%=session.getAttribute("tipoUsuario")%>'; 
    if(tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
    	document.getElementById("acs").innerText = "Cerrar Sesion";
    	document.getElementById("acs").href = "logout"; 
    
    }

    document.addEventListener("DOMContentLoaded", function() {
            
            const buscarInput = document.getElementById("buscar");
            if (buscarInput.value !== "") {
                document.getElementById("userForm").submit(); // Env�a el formulario
            }
       
    	});
    </script>
</body>
</html>
