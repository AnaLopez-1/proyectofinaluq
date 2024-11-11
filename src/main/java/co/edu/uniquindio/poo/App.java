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
            // Cargar el archivo FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
            AnchorPane root = loader.load(); 

            // Configurar la escena
            Scene scene = new Scene(root, 300, 200);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Tu carro UQ");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}