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
        <a href="login.jsp" class="text-white hover:text-blue-200 ml-4">Iniciar Sesión</a>
    </nav>

    <div class="flex">
        <!-- Menú lateral -->
        <div id="menuLateral"></div>

    </div>

    <script>
        
        document.addEventListener("DOMContentLoaded", function() {
            
            let menuUrl; 
            console.log(localStorage.getItem('tipoUsuario'));
            if (localStorage.getItem('tipoUsuario') === "Depotista") {
                menuUrl = "menu/menuDeportista.jsp";  // Menú para usuarios logueados
            }else{
                menuUrl = "menu/menuInvitado.jsp"; // Menú para invitados
            } 
            
            fetch(menuUrl)
                .then(response => response.text()) // Convertir la respuesta a texto
                .then(data => {
                    document.getElementById("menuLateral").innerHTML = data; // Insertar el contenido del menú en el div
                    
                    document.getElementById('usuariosToggle').onclick = function() {
                        const submenuUsuarios = document.getElementById('submenuUsuarios');
                        submenuUsuarios.classList.toggle('hidden');
                    };

                    document.getElementById('actividadesToggle').onclick = function() {
                        const submenuActividades = document.getElementById('submenuActividades');
                        submenuActividades.classList.toggle('hidden');
                    };

                    document.getElementById('clasesToggle').onclick = function() {
                        const submenuClases = document.getElementById('submenuClases');
                        submenuClases.classList.toggle('hidden');
                    };
                })
                .catch(error => console.error('Error cargando el menú:', error));
        });
        
        
    </script>
</body>
</html>
