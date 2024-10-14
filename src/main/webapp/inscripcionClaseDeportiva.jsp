<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Inscripcion Clase Deportiva</title>
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
            <h1 class="text-white text-2xl">Inscripcion a Clase Deportiva</h1>
        </div>
                <a id="acs" href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar Sesion</a>

    </nav>

    <div class="flex">
        <!-- Men� lateral -->
               <div id="menuLateral"></div>


        <!-- Contenedor para el formulario -->
        <div class="flex-1 p-5 flex items-start" style="margin-left: 25rem;">
            <!-- Formulario para inscripci�n -->
            <div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full" style="margin-right: 2rem;">
                <h2 class="text-center text-2xl font-bold mb-4">Inscripcion a Clase Deportiva</h2>
				<form id="userForm" action="InscripcionClaseDeportiva" method="POST" enctype="multipart/form-data">
					<div class="mb-4">
            			<label for="clases" class="block text-gray-700">Usuarios:</label>
            			<select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >
                    		<%@ page import="java.util.Vector" %>
							<%@ page import="java.util.Iterator" %>
							<%@ page import="logica.Fabrica" %>
							<%
                    		Fabrica fab = Fabrica.getInstance();
							Vector<String> acts = fab.getIControladorActividad().obtenerVectorActividadesAceptadas();
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
							placeholder="Buscar usuario..."
							class="border border-gray-300 rounded w-full p-2" required>
						<button type="submit"
							class="bg-blue-500 text-white rounded p-2 ml-2 hover:bg-blue-600">Buscar</button>
					</div>
				</form>
                <form id="inscripcionForm" action="inscribirClaseDeportiva" method="POST">
                   

                    <div class="mb-4">
                        <label for="clase" class="block text-gray-700">Seleccionar Clase:</label>
                        <select id="clase" name="clase" class="border border-gray-300 rounded w-full p-2" required>

                        	<%
							Vector<String> clas = (java.util.Vector<String>)request.getAttribute("listCla");
							if (clas!=null){
								for (String c : clas){ 
									out.print("<option value='"+c+"'>"+c+"</option>");
								}
							}
							%>
                            <!-- Agrega m�s opciones seg�n sea necesario -->
                        </select>
                    </div>
					<div class="mb-4">
					    <label for="cupo" class="block text-gray-700">Cantidad de Deportistas:</label>
					    <input type="number" id="cupo" name="cupo" class="border border-gray-300 rounded w-full p-2">
					</div>
                    
                    	<button type="submit" id="GuardaIns" class="bg-blue-500 text-white rounded w-full p-2 hover:bg-blue-600">Guardar</button>
                </form>
            </div>
        </div>
    </div>

    <script type="text/javascript" src="js/menu.jsp"></script>
        <script type="text/javascript">
   	const tipoUsuario = '<%=session.getAttribute("tipoUsuario")%>'; 
    if(tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
    	document.getElementById("acs").innerText = "Cerrar Sesion";
    	document.getElementById("acs").href = "logout"; 
    
    }
</script>
</body>
</html>
