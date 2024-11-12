package co.edu.uniquindio.poo.controller;

import co.edu.uniquindio.poo.model.Login;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private TextField textFieldUsuario;

    @FXML
    private TextField textFieldContraseña;

    @FXML
    private ChoiceBox<String> ChoiceBoxCargo; // ChoiceBox para seleccionar el cargo
    
    @FXML
    private Button btnIniciarSesion;

    // Usuarios de prueba
    private final Login administrador = new Login("Ana", "123", "Administrador");
    private final Login empleado = new Login("Maritza", "1234", "Empleado");

    // Inicialización del controlador
    @FXML
    private void initialize() {
        // Configura el ChoiceBox con los roles disponibles
        ChoiceBoxCargo.getItems().addAll("Administrador", "Empleado");
        ChoiceBoxCargo.setValue("Empleado"); // Selección predeterminada
    }

    // Método que se llama al hacer clic en el botón Iniciar Sesión
    @FXML
    private void iniciarSesion(ActionEvent event) {
        String usuario = textFieldUsuario.getText();
        String contraseña = textFieldContraseña.getText();
        String cargoSeleccionado = ChoiceBoxCargo.getValue();

        // Validación de las credenciales y carga de la vista correspondiente
        if (validarCredenciales(usuario, contraseña, administrador) && "Administrador".equals(cargoSeleccionado)) {
            cargarVista("/co/edu/uniquindio/poo/vistaAdministrador.fxml");
        } else if (validarCredenciales(usuario, contraseña, empleado) && "Empleado".equals(cargoSeleccionado)) {
            cargarVista("/co/edu/uniquindio/poo/vistaEmpleado.fxml");
        } else {
            mostrarMensaje("Login fallido", "Usuario, contraseña o cargo incorrectos");
        }
    }

    // Método que valida las credenciales del usuario
    private boolean validarCredenciales(String usuario, String contraseña, Login login) {
        return login.getUsuario().equals(usuario) && login.getContraseña().equals(contraseña);
    }

    // Método para cargar la vista correspondiente según el cargo
    private void cargarVista(String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();

            // Obtener el Stage actual y cambiar la escena
            Stage stage = (Stage) btnIniciarSesion.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            mostrarMensaje("Error", "No se pudo cargar la vista.");
        }
    }

    // Método para mostrar un mensaje de alerta
    private void mostrarMensaje(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
