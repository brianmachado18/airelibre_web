document.addEventListener("DOMContentLoaded", function() {
    let menuUrl;
    const tipoUsuario = '<%= session.getAttribute("tipoUsuario") %>';
    console.log(tipoUsuario);
    
    if (tipoUsuario == "Deportista") {
        menuUrl = "menu/menuDeportista.jsp"; // Menú para Deportistas
    } else if (tipoUsuario == "Entrenador") {
        menuUrl = "menu/menuEntrenador.jsp"; // Menú para Entrenadores
    } else {
        menuUrl = "menu/menuInvitado.jsp"; // Menú para Invitados
    }

    fetch(menuUrl)
        .then(response => response.text())
        .then(data => {
            document.getElementById("menuLateral").innerHTML = data; // Insertar contenido del menú

            toggleSubMenu('usuariosToggle', 'submenuUsuarios');
            toggleSubMenu('actividadesToggle', 'submenuActividades');
            toggleSubMenu('clasesToggle', 'submenuClases');
        })
        .catch(error => console.error('Error cargando el menú:', error));

    function toggleSubMenu(toggleId, submenuId) {
        document.getElementById(toggleId).onclick = function() {
            const submenu = document.getElementById(submenuId);
            submenu.classList.toggle('hidden');
        };
    }
});
