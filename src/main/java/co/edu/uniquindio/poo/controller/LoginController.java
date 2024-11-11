package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Login;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField textFieldUsuario;

    @FXML
    private PasswordField textFieldContraseña;

    @FXML
    private ChoiceBox<String> ChoiceBoxCargo; // Esto es para obtener el cargo seleccionado
    
    @FXML
    private Button btnIniciarSesion;

    // Usuarios de prueba
    private final Login administrador = new Login("Ana", "123", "Administrador");
    private final Login empleado = new Login("Maritza", "1234", "Empleado");

    @FXML
    private void iniciarSesion() {
        String usuario = textFieldUsuario.getText();
        String contraseña = textFieldContraseña.getText();

        if (validarCredenciales(administrador, usuario, contraseña)) {
            mostrarMensaje("Login exitoso", "Bienvenido Administrador " + usuario);
            // Redirigir a la vista de administrador
        } else if (validarCredenciales(empleado, usuario, contraseña)) {
            mostrarMensaje("Login exitoso", "Bienvenido Empleado " + usuario);
            // Redirigir a la vista de empleado
        } else {
            mostrarMensaje("Login fallido", "Usuario o contraseña incorrectos");
        }
    }

    private boolean validarCredenciales(Login login, String usuario, String contraseña) {
        return login.getUsuario().equals(usuario) && login.getContraseña().equals(contraseña);
    }

    private void mostrarMensaje(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
