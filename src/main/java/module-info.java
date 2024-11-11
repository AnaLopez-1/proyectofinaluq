module co.edu.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    
    exports co.edu.uniquindio.poo.controller;  // Exporta el paquete controller
    exports co.edu.uniquindio.poo.model;  // Si necesitas exportar otros paquetes
    opens co.edu.uniquindio.poo.controller to javafx.fxml;  // Permite la reflexión
    exports co.edu.uniquindio.poo;  // Exporta el paquete donde está la clase App

}
