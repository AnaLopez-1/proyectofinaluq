package co.edu.uniquindio.poo.viewcontroller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginController {

    @FXML
    private Button btnIniciarSesion;

    @FXML
    private Text textcontraseña;

    @FXML
    private ChoiceBox<?> ChoiceBoxCargo;

    @FXML
    private Text textcargo;

    @FXML
    private Text textusuario;

    @FXML
    private TextField textFieldUsuario;

    @FXML
    private TextField TextFieldContraseña;

    @FXML
    void iniciarSesion(ActionEvent event) {
    }
}