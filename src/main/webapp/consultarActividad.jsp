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

        @media (max-width: 768px) {
            .menu-lateral {
                display: none;
            }

            .hamburger-menu {
                display: block;
            }

            .menu-lateral.active {
                display: block;
            }
        }
    </style>
</head>

<body class="bg-gray-100">

    <nav class="bg-blue-600 p-4 flex justify-between items-center">
        <div class="flex-grow text-center">
            <h1 class="text-white text-2xl">Consulta de Actividades</h1>
        </div>
        <a id="acs" href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar Sesion</a>

        <!-- Menú hamburguesa -->
        <button id="hamburgerButton" class="hamburger-menu text-white block lg:hidden">
            <svg class="w-6 h-6" fill="none" stroke="currentColor" xmlns="http://www.w3.org/2000/svg" viewBox="0 0 24 24"
                stroke-width="2" stroke-linecap="round" stroke-linejoin="round">
                <path d="M3 12h18M3 6h18M3 18h18"></path>
            </svg>
        </button>
    </nav>

    <div class="flex flex-col lg:flex-row">
        <!-- Menú lateral -->
        <div id="menuLateral" class="menu-lateral w-64 bg-white p-5 border-r border-gray-200 lg:block">
            <!-- Tu menú aquí -->
        </div>

        <!-- Contenedor para el formulario -->
        <div class="flex-1 p-5 lg:ml-64 flex flex-col lg:flex-row">
            <!-- Formulario para consultar actividad -->
            <div class="bg-white rounded-lg shadow-md p-6 max-w-lg w-full" style="margin-right: 2rem;">
                <h2 class="text-center text-2xl font-bold mb-4">Buscar Actividad</h2>

                <!-- Formulario de búsqueda -->
                <form id="userForm" action="consultarActividad" method="POST">
                    <div class="mb-4">
                        <label for="clases" class="block text-gray-700">Actividades:</label>
                        <select id="clases" name="clases" multiple class="border border-gray-300 rounded w-full p-2">
                            <%@ page import="java.util.ArrayList" %>
                            <%@ page import="java.util.Iterator" %>
                            <%
                            ArrayList<String> acts = (ArrayList<String>) request.getAttribute("listAct");
                            if (acts != null) {
                                for (String a : acts) {
                                    out.print("<option value='" + a + "'>" + a + "</option>");
                                }
                            }
                            %>
                        </select>
                    </div>

                    <div class="mb-4 flex">
                        <input type="text" id="buscar" name="buscar" placeholder="Buscar actividad..."
                            class="border border-gray-300 rounded w-full p-2" value="${nom}" required>
                        <button id="btnBuscar" type="submit" class="bg-blue-500 text-white rounded p-2 ml-2 hover:bg-blue-600">
                            Buscar
                        </button>
                    </div>
                </form>

                <!-- Formulario de actividad -->
                <form id="activityForm" action="consultarActividad" method="POST" enctype="multipart/form-data">
                    <div class="mb-4">
                        <label for="nombre" class="block text-gray-700">Nombre:</label>
                        <input type="text" id="nombre" name="nombre" class="border border-gray-300 rounded w-full p-2" value="${nombre}" disabled>
                    </div>

                    <div class="mb-4">
                        <label for="descripcion" class="block text-gray-700">Descripción:</label>
                        <textarea id="descripcion" name="descripcion" class="border border-gray-300 rounded w-full p-2" disabled>${descripcion}</textarea>
                    </div>

                    <div class="mb-4">
                        <label for="duracionHoras" class="block text-gray-700">Duración (Horas):</label>
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
                            <%
                            ArrayList<String> clases = (ArrayList<String>) request.getAttribute("clases");
                            if (clases != null) {
                                for (String clase : clases) {
                                    out.print("<option value='" + clase + "'>" + clase + "</option>");
                                }
                            }
                            %>
                        </select>
                    </div>
                </form>
            </div>

            <!-- Imagen de la actividad (se mueve abajo en pantallas pequeñas) -->
            <div class="bg-white rounded-lg shadow-md w-full lg:w-48 h-48 flex items-center justify-center mt-4 lg:mt-0">
                <img id="imagen" src="${imgen}" alt="Imagen de Actividad" class="w-full h-full object-cover rounded-lg">
            </div>
        </div>
    </div>

    <script type="text/javascript" src="js/menu.jsp"></script>

    <script>
        // Cambiar imagen por defecto si no existe
        window.onload = function cargarImagenDefault() {
            if ("${imgen}" == "" || "${imgen}" == "/airelibre_webnull") {
                document.getElementById("imagen").src = "https://via.placeholder.com/150";
            }
        }

        // Control de envío del formulario si el campo de búsqueda tiene valor
        document.addEventListener("DOMContentLoaded", function () {
            const buscarInput = document.getElementById("buscar");
            if (buscarInput.value !== "") {
                document.getElementById("userForm").submit(); // Envía el formulario
            }
        });

        // Redirigir cuando se selecciona una clase
        function consInscripciones(val) {
            window.location.href = "consultarClaseDeportiva?claseSeleccionada=" + encodeURIComponent(val);
        }

        // Cambiar sesión según tipo de usuario
        const tipoUsuario = '<%= session.getAttribute("tipoUsuario") %>';
        if (tipoUsuario === "Deportista" || tipoUsuario === "Entrenador") {
            document.getElementById("acs").innerText = "Cerrar Sesión";
            document.getElementById("acs").href = "logout";
        }

        // Mostrar el menú lateral en dispositivos móviles
        document.getElementById("hamburgerButton").addEventListener("click", function () {
            const menuLateral = document.getElementById("menuLateral");
            menuLateral.classList.toggle("active");
        });
    </script>

</body>

</html>
