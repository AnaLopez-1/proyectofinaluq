module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires javafx.graphics;
    
    exports co.edu.uniquindio.poo.controller;  // Exporta el paquete controller
    exports co.edu.uniquindio.poo.model;  // Si necesitas exportar otros paquetes
    opens co.edu.uniquindio.poo.controller to javafx.fxml;  // Permite la reflexión para controller
    exports co.edu.uniquindio.poo;  // Exporta el paquete donde está la clase App
    
    // Abre el paquete viewcontroller para que javafx.fxml pueda acceder a los miembros
    opens co.edu.uniquindio.poo.viewcontroller to javafx.fxml;  // Asegúrate de agregar esta línea
}