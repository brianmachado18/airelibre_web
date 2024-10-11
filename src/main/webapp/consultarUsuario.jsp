<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Consultar Usuarios</title>
<link
	href="https://cdn.jsdelivr.net/npm/tailwindcss@2.2.19/dist/tailwind.min.css"
	rel="stylesheet">
<style>
.hidden {
	display: none;
}
</style>
</head>
<body class="bg-gray-100">

	<nav class="bg-blue-600 p-4 flex justify-between items-center">
		<div class="flex-grow text-center">
			<h1 class="text-white text-2xl">Consulta de Usuarios</h1>
		</div>
		<a id="acs" href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar
			Sesion</a>
	</nav>

	<div class="flex">
		<!-- Menï¿½ lateral -->
        <div id="menuLateral"></div>


		<!-- Contenedor para el formulario y la imagen -->
		<div class="flex-1 p-5 flex items-start" style="margin-left: 25rem;">
			<!-- Estilo inline para margen -->
			<!-- Formulario con campos bloqueados -->
			<div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full"
				style="margin-right: 2rem;">
				<h2 class="text-center text-2xl font-bold mb-4">Buscar Usuario</h2>

				<!-- Campo de bï¿½squeda -->
				<form id="userForm" action="consultarUsuario" method="POST" enctype="multipart/form-data">
					<div class="mb-4">
            			<label for="clases" class="block text-gray-700">Usuarios:</label>
            			<select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" >
                    		<%@ page import="java.util.Vector" %>
							<%@ page import="java.util.Iterator" %>
							<%@ page import="logica.Fabrica" %>
							<%
                    		Fabrica fab = Fabrica.getInstance();
							Vector<String> usus = fab.getIControladorUsuario().obtenerVectorUsuarios();
							if (usus!=null){
								for (String u : usus){ 
									out.print("<option value='"+u+"'>"+u+"</option>");
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

				<form id="userForm">
					<div class="mb-4">
						<label for="nombre" class="block text-gray-700" >Nombre:</label> 
						<input
							type="text" id="nombre" name="nombre"
							class="border border-gray-300 rounded w-full p-2" value="${nombre}" disabled>
					</div>

					<div class="mb-4">
						<label for="apellido" class="block text-gray-700" >Apellido:</label>
						<input type="text" id="apellido" name="apellido"
							class="border border-gray-300 rounded w-full p-2" value="${apellido}"disabled>
					</div>

					<div class="mb-4">
						<label for="nickname" class="block text-gray-700" >Nickname:</label>
						<input type="text" id="nickname" name="nickname"
							class="border border-gray-300 rounded w-full p-2" value="${nickname}"disabled>
					</div>

					<div class="mb-4">
						<label for="email" class="block text-gray-700">Correo
							Electronico:</label> <input type="email" id="email" name="email"
							class="border border-gray-300 rounded w-full p-2"  value="${correo}"disabled>
					</div>

					<div class="mb-4">
						<label for="fecha" class="block text-gray-700" >Fecha de
							Nacimiento:</label> <input type="date" id="fecha" name="fecha"
							class="border border-gray-300 rounded w-full p-2"value="${fnac}" disabled>
					</div>

					<div id="deportistaFields" class="hidden mb-4" style="display: none;">
						<label class="block text-gray-700 mb-2">Rol:</label>
						<button type="button" id = "srol"
							class="bg-blue-500 text-white rounded w-full p-2 mb-2 hover:bg-blue-600" disabled>Deportista</button>
						<label class="block text-gray-700">¿Eres profesional?</label> <input
							type="radio" id="profesional_si" name="profesional" value="si" disabled>
						<label for="profesional_si">Si</label> <input type="radio"
							id="profesional_no" name="profesional" value="no" disabled> <label
							for="profesional_no">No</label>
							
							<div id="inscrpcionesFieldsOtroDepor" class="hidden mb-4" style="display: none;">
								<label for="inscrp" class="block text-gray-700">Clases Inscripto:</label>
		            			<select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2" onchange="consInscripciones(this.value);">
		                    		<%@ page import="java.util.Vector" %>
									<%@ page import="java.util.Iterator" %>
									<%
									Vector<String> clasesIns = (java.util.Vector<String>)request.getAttribute("clasesIns");
									if (clasesIns!=null){
										for (String ci : clasesIns){ 
											out.print("<option value=\"" + ci + "\">" + ci + "</option>"); 
										}
									}
									%>
		            			</select>
							</div>
							
							<div id="inscrpcionesFieldsMismoDepor" class="hidden mb-4" style="display: none;">
							    <label for="inscrp" class="block text-gray-700">Mis Inscripciones:</label>
							    <table id="tablaInscripciones" class="min-w-full bg-white border border-gray-300 rounded-lg">
							        <thead class="bg-gray-200">
							            <tr>
							                <th class="py-2 px-4 border-b text-left text-gray-700">Clase</th>
							                <th class="py-2 px-4 border-b text-left text-gray-700">Costo</th>
							                <th class="py-2 px-4 border-b text-left text-gray-700">Cantidad de deportistas</th>
							                <th class="py-2 px-4 border-b text-left text-gray-700"></th>
							            </tr>
							        </thead>
							        <tbody>
							            <% String[][] inscrips = (String[][])request.getAttribute("inscrips");
							            if (inscrips != null) {
							                for (int i = 0; i < inscrips.length; i++) { %>
							                    <tr>
							                        <td class="py-2 px-4 border-b"><%= inscrips[i][0] %></td>
							                        <td class="py-2 px-4 border-b"><%= inscrips[i][1] %></td>
							                        <td class="py-2 px-4 border-b"><%= inscrips[i][2] %></td>
							                        <td class="py-2 px-4 border-b">
							                            <button id="btnC<%= i %>" type="button" class="bg-blue-500 text-white rounded p-2 hover:bg-blue-600" value="<%= inscrips[i][0] %>" onclick="consInscripciones(this.value)">Buscar</button>
							                        </td>
							                    </tr>
							                <% }
							            } %>
							        </tbody>
							    </table>
							</div>
					</div>

					<div id="entrenadorFields" class="hidden mb-4" style="display: none;"> 
						<label class="block text-gray-700 mb-2">Rol:</label>
						<button type="button" id = "srol"
							class="bg-blue-500 text-white rounded w-full p-2 mb-4 hover:bg-blue-600" disabled>Entrenador</button>
						<div>
							<label for="disciplina" class="block text-gray-700">¿Cual
								es tu disciplina?</label> <input type="text" id="disciplina"
								name="disciplina"
								class="border border-gray-300 rounded w-full p-2" value="${disciplina}"disabled>
						</div>
						<div>
							<label for="sitio_web" class="block text-gray-700">Sitio
								Web:</label> <input type="text" id="sitio_web" name="sitio_web"
								class="border border-gray-300 rounded w-full p-2" value="${web}"disabled>
						</div>
						
						<div id="actividadesEntrenador" class="hidden mb-4" style="display: none;">
						    <label for="inscrp" class="block text-gray-700">Actividades vinculadas:</label>
						    <table id="tablaActividadesAceptadas" class="min-w-full bg-white border border-gray-300 rounded-lg">
						        <thead class="bg-gray-200">
						            <tr>
						                <th class="py-2 px-4 border-b text-left text-gray-700">Actividad</th>
						                <th class="py-2 px-4 border-b text-left text-gray-700">Lugar</th>
						                <th class="py-2 px-4 border-b text-left text-gray-700">Duración</th>
						                <th class="py-2 px-4 border-b text-left text-gray-700"></th>
						            </tr>
						        </thead>
						        <tbody>
						            <% String[][] actividadesAceptadas = (String[][])request.getAttribute("actividadesAceptadas");
						            if (actividadesAceptadas != null) {
						                for (int i = 0; i < actividadesAceptadas.length; i++) { %>
						                    <tr>
						                        <td class="py-2 px-4 border-b"><%= actividadesAceptadas[i][0] %></td>
						                        <td class="py-2 px-4 border-b"><%= actividadesAceptadas[i][1] %></td>
						                        <td class="py-2 px-4 border-b"><%= actividadesAceptadas[i][2] %></td>
						                        <td class="py-2 px-4 border-b">
						                            <button id="btnA<%= i %>" type="button" class="bg-blue-500 text-white rounded p-2 hover:bg-blue-600" value="<%= actividadesAceptadas[i][0] %>" onclick="consActividadAceptada(this.value)">Buscar</button>
						                        </td>
						                    </tr>
						                <% }
						            } %>
						        </tbody>
						    </table>
						</div>
						
						<div id="actividadesMismoEntrenador" class="hidden mb-4" style="display: none;">
						    <label for="inscrp" class="block text-gray-700">Mis Actividades:</label>
						    <table id="tablaActividades" class="min-w-full bg-white border border-gray-300 rounded-lg">
						        <thead class="bg-gray-200">
						            <tr>
						                <th class="py-2 px-4 border-b text-left text-gray-700">Actividad</th>
						                <th class="py-2 px-4 border-b text-left text-gray-700">Estado</th>
						                <th class="py-2 px-4 border-b text-left text-gray-700">Lugar</th>
						                <th class="py-2 px-4 border-b text-left text-gray-700">Duración</th>
						                <th class="py-2 px-4 border-b text-left text-gray-700"></th>
						            </tr>
						        </thead>
						        <tbody>
						            <% String[][] actividades = (String[][])request.getAttribute("actividades");
						            if (actividades != null) {
						                for (int i = 0; i < actividades.length; i++) { %>
						                    <tr>
						                        <td class="py-2 px-4 border-b"><%= actividades[i][0] %></td>
						                        <td class="py-2 px-4 border-b"><%= actividades[i][1] %></td>
						                        <td class="py-2 px-4 border-b"><%= actividades[i][2] %></td>
						                        <td class="py-2 px-4 border-b"><%= actividades[i][3] %></td>
						                        <td class="py-2 px-4 border-b">
						                            <button id="btnB<%= i %>" type="button" class="bg-blue-500 text-white rounded p-2 hover:bg-blue-600" value="<%= actividades[i][0] %>" onclick="consActividad(this.value)">Buscar</button>
						                        </td>
						                    </tr>
						                <% }
						            } %>
						        </tbody>
						    </table>
						</div>
					</div>
				</form>
			</div>

			<!-- Cuadro de imagen separado, pero mï¿½s cerca -->
			<div
				class="bg-white rounded-lg shadow-md w-48 h-48 flex items-center justify-center">
				<!-- Sin margen izquierdo -->
				<img id="userImage" src="${imgen}"
					alt="Imagen de Usuario"
					class="w-full h-full object-cover rounded-lg">
			</div>
			
		</div>
		
	</div>

	<script type="text/javascript" src="js/menu.jsp"></script>
	<script>
		//Setear img default
		window.onload = function cargarImagenDefault(){
			if("${imgen}"=="" || "${imgen}"=="/airelibre_webnull"){
				document.getElementById("userImage").src = "https://via.placeholder.com/150";
			}
		}
	
	    //=== actividadesAaceptadas ==================================================================================
	    const actividadesAaceptadas = [
	        <% 
	        String[][] arrayAA = (String[][]) request.getAttribute("actividadesAceptadas");
	        if (arrayAA != null) {  // Comprobar si 'aa' no es null
	            for (int i = 0; i < arrayAA.length; i++) { %>
	                ["<%= arrayAA[i][0] %>", "<%= arrayAA[i][1] %>"]<% if (i < arrayAA.length - 1) { %>,<% } %>
	            <% } 
	        }
	        %>
	    ];

	    function consActividadAceptada(val) {
	        console.log("Val: "+val);
	        
	        if (actividadesAaceptadas.length > 0) {
	            for (let i = 0; i < actividadesAaceptadas.length; i++) {
	                document.v("btnA" + i).onclick = function() {
	                    window.location.href = "consultarActividad?actividadSeleccionada=" + encodeURIComponent(val);
	                }
	            }
	        } else {
	            console.log("No hay actividades aceptadas.");
	        }
	    }
	    
	  //=== actividades ==============================================================================================
	  const actividades = [
	        <% 
	        String[][] arrayA = (String[][]) request.getAttribute("actividades");
	        if (arrayA != null) {  // Comprobar si 'aa' no es null
	            for (int i = 0; i < arrayA.length; i++) { %>
	                ["<%= arrayA[i][0] %>", "<%= arrayA[i][1] %>"]<% if (i < arrayA.length - 1) { %>,<% } %>
	            <% } 
	        }
	        %>
	   ];
	    
	   function consActividad(val) {
	        console.log("Val: "+val);
	        
	        if (actividades.length > 0) {
	            for (let i = 0; i < actividades.length; i++) {
	                document.getElementById("btnB" + i).onclick = function() {
	                    window.location.href = "consultarActividad?actividadSeleccionada=" + encodeURIComponent(val);
	                }
	            }
	        } else {
	            console.log("No hay actividades.");
	        }
	   }
	    
	    
	  //=== inscripcionesTabla ============================================================================================
		const inscripciones = [
	        <% 
	        String[][] arrayI = (String[][]) request.getAttribute("inscrips");
	        if (arrayI != null) {  // Comprobar si 'aa' no es null
	            for (int i = 0; i < arrayI.length; i++) { %>
	                ["<%= arrayI[i][0] %>", "<%= arrayI[i][1] %>"]<% if (i < arrayI.length - 1) { %>,<% } %>
	            <% } 
	        }
	        %>
	    ];
	  
	    function consInscripciones(val){
			console.log("Val: "+val);
	        
	        if (inscripciones.length > 0) {
	            for (let i = 0; i < inscripciones.length; i++) {
	                document.getElementById("btnC" + i).onclick = function() {
	                    window.location.href = "consultarClaseDeportiva?claseSeleccionada=" + encodeURIComponent(val); //MODIFICAR PARA CONSULTAR CLASE
	                }
	            }
	        } else {
	            console.log("No hay inscripciones.");
	        }
		}
	    
	  //=== inscripcionesLista ============================================================================================
	    function consInscripciones(val){
			console.log("Val: "+val);

			window.location.href = "consultarClaseDeportiva?claseSeleccionada=" + encodeURIComponent(val); //MODIFICAR PARA CONSULTAR CLASE
		}
	  
	  //===================================================================================================================
	    
	   	const tipoUsuario = '<%=session.getAttribute("tipoUsuario")%>'; 
	    if(tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
	    	document.getElementById("acs").innerText = "Cerrar Sesion";
	    	document.getElementById("acs").href = "logout"; 
	    }

        document.addEventListener("DOMContentLoaded", function() {
            const profesionalSi = document.getElementById('profesional_si');
            const profesionalNo = document.getElementById('profesional_no');
            const SeleccionRol = document.getElementById('srol');

            SeleccionRol.disabled = true;
            if ("${nickname}"!=""){
            	const deportistaFields = document.getElementById('deportistaFields');
               	const entrenadorFields = document.getElementById('entrenadorFields');
               	if("${tipoUsuario}" !== 'Deportista'){
               		deportistaFields.style.display = "none";
                   	entrenadorFields.style.display = "inline";
               	}else{
                   	entrenadorFields.style.display = "none";
               		deportistaFields.style.display = "inline";
				}
			}else{
				deportistaFields.style.display = "none";
               	entrenadorFields.style.display = "none";
			}

            if("${prof}" == true){
                profesionalSi.checked = false;
                profesionalNo.checked = true;
            }else{
                profesionalNo.checked = false;
                profesionalSi.checked = true;
            }

            const inscrpcionesFieldsOtroDepor = document.getElementById('inscrpcionesFieldsOtroDepor');
            const inscrpcionesFieldsMismoDepor = document.getElementById('inscrpcionesFieldsMismoDepor');
            const actividadesEntrenador = document.getElementById('actividadesEntrenador');
            const actividadesMismoEntrenador = document.getElementById('actividadesMismoEntrenador');
            
            var nn = '<%= session.getAttribute("usuarioLogueado") %>';
            var tu = '<%= session.getAttribute("tipoUsuario") %>';

            if("${nickname}" == nn){
				
            	if('Deportista' == tu){
					//Un deportista consulta SU perfil
            		inscrpcionesFieldsOtroDepor.style.display = "none";
                	inscrpcionesFieldsMismoDepor.style.display = "inline";
                	actividadesEntrenador.style.display = "none";
                	actividadesMismoEntrenador.style.display = "none";
				}else{
					//Un entrenador consulta SU perfil
            		inscrpcionesFieldsOtroDepor.style.display = "none";
                	inscrpcionesFieldsMismoDepor.style.display = "none";
                	actividadesEntrenador.style.display = "none";
                	actividadesMismoEntrenador.style.display = "inline";
				}
			}else{
				if("${tipoUsuario}" == 'Deportista'){
					//Un usuario consulta un perfil de deportista
					inscrpcionesFieldsOtroDepor.style.display = "inline";
	            	inscrpcionesFieldsMismoDepor.style.display = "none";
                	actividadesEntrenador.style.display = "none";
                	actividadesMismoEntrenador.style.display = "none";
				}else{
					//Un usuario consulta un perfil de entrenador
            		inscrpcionesFieldsOtroDepor.style.display = "none";
                	inscrpcionesFieldsMismoDepor.style.display = "none";
                	actividadesEntrenador.style.display = "inline";
                	actividadesMismoEntrenador.style.display = "none";
				}
			}    
        });
	</script>
	
</body>
</html>
