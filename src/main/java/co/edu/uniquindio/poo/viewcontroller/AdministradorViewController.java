package co.edu.uniquindio.poo.viewcontroller;

    
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.event.ActionEvent;  

public class AdministradorViewController {
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="textFieldIdEmpleado"
    private TextField textFieldIdEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="columnaTelefono"
    private TableColumn<?, ?> columnaTelefono; // Value injected by FXMLLoader

    @FXML // fx:id="columnaCorreo"
    private TableColumn<?, ?> columnaCorreo; // Value injected by FXMLLoader

    @FXML // fx:id="tableViewEmpleado"
    private TableView<?> tableViewEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="textFieldPeriodoDeTiempoEmpleado"
    private DatePicker textFieldPeriodoDeTiempoEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="columnaApellidos"
    private TableColumn<?, ?> columnaApellidos; // Value injected by FXMLLoader

    @FXML // fx:id="textFieldTelefonoEmpleado"
    private TextField textFieldTelefonoEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="textFieldApellidosEmpleado"
    private TextField textFieldApellidosEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="textFieldCorreoEmpleado"
    private TextField textFieldCorreoEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="btnLimparCampos"
    private Button btnLimparCampos; // Value injected by FXMLLoader

    @FXML // fx:id="columnaId"
    private TableColumn<?, ?> columnaId; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizarEmpleado"
    private Button btnActualizarEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="textFieldNombreEmpleado"
    private TextField textFieldNombreEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="btnGeneracionDeReporte"
    private Button btnGeneracionDeReporte; // Value injected by FXMLLoader

    @FXML // fx:id="btnRegistrarEmpleado"
    private Button btnRegistrarEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="btnBloquearEmpleado"
    private Button btnBloquearEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="columnaNombre"
    private TableColumn<?, ?> columnaNombre; // Value injected by FXMLLoader

    @FXML
    void RegistrarEmpleado(ActionEvent event) {

    }

    @FXML
    void ActualizarEmpleado(ActionEvent event) {

    }

    @FXML
    void BloquearEmpleado(ActionEvent event) {

    }

    @FXML
    void LImpiarCampos(ActionEvent event) {

    }

    @FXML
    void GeneracionDeReporte(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert textFieldIdEmpleado != null : "fx:id=\"textFieldIdEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert columnaTelefono != null : "fx:id=\"columnaTelefono\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert columnaCorreo != null : "fx:id=\"columnaCorreo\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert tableViewEmpleado != null : "fx:id=\"tableViewEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert textFieldPeriodoDeTiempoEmpleado != null : "fx:id=\"textFieldPeriodoDeTiempoEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert columnaApellidos != null : "fx:id=\"columnaApellidos\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert textFieldTelefonoEmpleado != null : "fx:id=\"textFieldTelefonoEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert textFieldApellidosEmpleado != null : "fx:id=\"textFieldApellidosEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert textFieldCorreoEmpleado != null : "fx:id=\"textFieldCorreoEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert btnLimparCampos != null : "fx:id=\"btnLimparCampos\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert columnaId != null : "fx:id=\"columnaId\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert btnActualizarEmpleado != null : "fx:id=\"btnActualizarEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert textFieldNombreEmpleado != null : "fx:id=\"textFieldNombreEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert btnGeneracionDeReporte != null : "fx:id=\"btnGeneracionDeReporte\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert btnRegistrarEmpleado != null : "fx:id=\"btnRegistrarEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert btnBloquearEmpleado != null : "fx:id=\"btnBloquearEmpleado\" was not injected: check your FXML file 'vistaadministrador.fxml'.";
        assert columnaNombre != null : "fx:id=\"columnaNombre\" was not injected: check your FXML file 'vistaadministrador.fxml'.";

    }
    private void mostrarDatosEmpleado(Empleado empleado) {
      this.textFieldNombreEmpleado.setText(empleado.getNombre());
      this.textFieldApellidosEmpleado.setText(empleado.getApellido());
      this.textFieldCorreoEmpleado.setText(empleado.getCorreo());
      this.textFieldTelefonoEmpleado.setText(empleado.getTelefono());
      this.textFieldIdEmpleado.setText(empleado.getIdEmpleado());
    }
}
  
   

