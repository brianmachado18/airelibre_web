
        document.addEventListener("DOMContentLoaded", function() {
            
            let menuUrl; 
            var tipoUsuario = '<%= session.getAttribute("tipoUsuario") %>';
            
            console.log(tipoUsuario);
            
            if (tipoUsuario == "Deportista") {
                menuUrl = "menu/menuDeportista.jsp";  // Men� para usuarios logueados
            }else if (tipoUsuario == "Entrenador"){
            	menuUrl = "menu/menuEntrenador.jsp";
            }else{
                menuUrl = "menu/menuInvitado.jsp"; // Men� para invitados
            } 
            
            fetch(menuUrl)
                .then(response => response.text()) // Convertir la respuesta a texto
                .then(data => {
                    document.getElementById("menuLateral").innerHTML = data; // Insertar el contenido del men� en el div
                    
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
                .catch(error => console.error('Error cargando el men�:', error));
        });
        
