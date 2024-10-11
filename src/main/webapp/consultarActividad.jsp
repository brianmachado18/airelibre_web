<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consultar Actividad</title>
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
                <a id="acs" href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar Sesion</a>

    </nav>

    <div class="flex">
        <!-- Men� lateral -->
       		<div id="menuLateral"></div>

        <!-- Contenedor para el formulario -->
        <div class="flex-1 p-5 flex items-start" style="margin-left: 25rem;">
            <!-- Formulario para crear actividad -->
            <div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full" style="margin-right: 2rem;">
                <h2 class="text-center text-2xl font-bold mb-4">Buscar Actividad</h2>

				<!-- Campo de b�squeda -->
				<form id="userForm" action="consultarActividad" method="POST">
				<div class="mb-4">
                        <label for="clases" class="block text-gray-700">Actividades:</label>
                        <select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >
                            <%@ page import="java.util.Vector" %>
							<%@ page import="java.util.Iterator" %>
							<%
							Vector<String> acts = (java.util.Vector<String>)request.getAttribute("listAct");
							if (acts!=null){
								for (String a : acts){ 
									out.print("<option value='"+a+"'>"+a+"</option>");
								}
							}
							%>
                        </select>
                    </div>
					<div class="mb-4 flex">
						<input type="text" id="buscar" name="buscar"
							placeholder="Buscar actividad..."
							class="border border-gray-300 rounded w-full p-2" value= "${nom}" required>
						<button id="btnBuscar" type="submit"
							class="bg-blue-500 text-white rounded p-2 ml-2 hover:bg-blue-600">Buscar</button>
					</div>
				</form>

                <form id="activityForm" action="consultarActividad" method="POST" enctype="multipart/form-data">
                    <div class="mb-4">
                        <label for="nombre" class="block text-gray-700">Nombre:</label>
                        <input type="text" id="nombre" name="nombre" class="border border-gray-300 rounded w-full p-2" value="${nombre}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="descripcion" class="block text-gray-700">Descripcion:</label>
                        <textarea id="descripcion" name="descripcion" class="border border-gray-300 rounded w-full p-2" disabled> ${descripcion}</textarea>
                    </div>

                    <div class="mb-4">
                        <label for="duracionHoras" class="block text-gray-700">Duracion (Horas):</label>
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
                        <label for="clases" class="block text-gray-700">Clases Asociadas:</label>
                        <select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" onchange="consInscripciones(this.value);">
                            <%@ page import="java.util.Vector" %>
							<%@ page import="java.util.Iterator" %>
							<%
                            Vector<String> clases = (java.util.Vector<String>)request.getAttribute("clases");
							if (clases!=null){
								for (String clase : clases){ 
									out.print("<option value='"+clase+"'>"+clase+"</option>");
								}
							}
							%>
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

    <script type="text/javascript" src="js/menu.jsp"></script>
    
	<script >
		//Setear img default
		window.onload = function cargarImagenDefault(){
			if("${imgen}"=="" || "${imgen}"=="/airelibre_webnull"){
				document.getElementById("imagen").src = "https://via.placeholder.com/150";
			}
		}
	
		document.addEventListener("DOMContentLoaded", function() {        
	    	const buscarInput = document.getElementById("buscar");
	    	if (buscarInput.value !== "") {
	    		document.getElementById("userForm").submit(); // Env�a el formulario
	    	}
	    });
		
		function consInscripciones(val){
			window.location.href = "consultarClaseDeportiva?claseSeleccionada=" + encodeURIComponent(val); 
		}
	</script>
	
    <script type="text/javascript">
   		const tipoUsuario = '<%=session.getAttribute("tipoUsuario")%>'; 
    	if(tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
    		document.getElementById("acs").innerText = "Cerrar Sesion";
    		document.getElementById("acs").href = "logout"; 
    	}
	</script>

</body>
</html>
