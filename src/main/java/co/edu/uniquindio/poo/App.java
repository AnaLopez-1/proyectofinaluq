package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // Cargar el archivo FXML para el login
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/login.fxml"));
            AnchorPane root = loader.load(); 

            // Configurar la escena
            Scene scene = new Scene(root, 700, 380);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Tu carro UQ");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Método para cargar la vista de empleado
    private void cargarVistaEmpleado(Stage primaryStage) {
        try {
            // Cargar la vista de empleado
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/co/edu/uniquindio/poo/vistaEmpleado.fxml"));
            AnchorPane root = loader.load(); 

            // Configurar la escena para la vista de empleado
            Scene scene = new Scene(root, 800, 700);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Gestión de Empleado");
            primaryStage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

    public static void main(String[] args) {
        launch(args);
    }
}
