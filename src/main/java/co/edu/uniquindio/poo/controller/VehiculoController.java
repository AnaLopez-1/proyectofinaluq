import javafx.fxml.FXML;
import javafx.scene.control.*;

public class VehiculoController {

    @FXML
    private ComboBox<String> comboBoxTipoVehiculo;

    @FXML
    private Label labelMarca;
    @FXML
    private TextField textFieldMarcaVehiculo;

    @FXML
    private Label labelEsNuevo;
    @FXML
    private CheckBox checkBoxEsNuevoVehiculo;

    @FXML
    private Label labelVelocidadMaxima;
    @FXML
    private TextField textFieldVelocidadMaximaVehiculo;

    @FXML
    private Label labelCilindraje;
    @FXML
    private TextField textFieldCilindrajeVehiculo;

    @FXML
    private Label labelCombustible;
    @FXML
    private TextField textFieldCombustibleVehiculo;

    @FXML
    private Label labelTransmision;
    @FXML
    private TextField textFieldTransmisionVehiculo;

    @FXML
    private Label labelCambios;
    @FXML
    private TextField textFieldCambiosVehiculo;

    @FXML
    private Button buttonAgregar;

    @FXML
    public void initialize() {
        comboBoxTipoVehiculo.getItems().addAll("Moto", "Bus", "Camioneta");
        
        comboBoxTipoVehiculo.valueProperty().addListener((observable, oldValue, newValue) -> {
            ocultarCamposEspecificosVehiculo();
            onTipoVehiculoSeleccionado();
        });
    }

    private void ocultarCamposEspecificosVehiculo() {
        labelMarca.setVisible(false);
        textFieldMarcaVehiculo.setVisible(false);
        labelEsNuevo.setVisible(false);
        checkBoxEsNuevoVehiculo.setVisible(false);
        labelVelocidadMaxima.setVisible(false);
        textFieldVelocidadMaximaVehiculo.setVisible(false);
        labelCilindraje.setVisible(false);
        textFieldCilindrajeVehiculo.setVisible(false);
        labelCombustible.setVisible(false);
        textFieldCombustibleVehiculo.setVisible(false);
        labelTransmision.setVisible(false);
        textFieldTransmisionVehiculo.setVisible(false);
        labelCambios.setVisible(false);
        textFieldCambiosVehiculo.setVisible(false);
    }

    private void onTipoVehiculoSeleccionado() {
        String tipoVehiculo = comboBoxTipoVehiculo.getValue();

        mostrarCamposGenerales();

        if ("Moto".equals(tipoVehiculo)) {
            mostrarCamposMoto();
        } else if ("Bus".equals(tipoVehiculo)) {
            mostrarCamposBus();
        } else if ("Camioneta".equals(tipoVehiculo)) {
            mostrarCamposCamioneta();
        }
    }

    private void mostrarCamposGenerales() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
    }

    private void mostrarCamposMoto() {
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
    }

    private void mostrarCamposBus() {
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
    }

    private void mostrarCamposCamioneta() {
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
    }

    @FXML
    private void agregarVehiculo() {
        String marca = textFieldMarcaVehiculo.getText().trim();
        boolean esNuevo = checkBoxEsNuevoVehiculo.isSelected();
        String tipoVehiculo = comboBoxTipoVehiculo.getValue();

        if ("Moto".equals(tipoVehiculo)) {
            String velocidadMaxima = textFieldVelocidadMaximaVehiculo.getText().trim();
            String cilindraje = textFieldCilindrajeVehiculo.getText().trim();
            // Lógica para agregar una moto con sus atributos específicos
        } else if ("Bus".equals(tipoVehiculo)) {
            String combustible = textFieldCombustibleVehiculo.getText().trim();
            String transmision = textFieldTransmisionVehiculo.getText().trim();
            // Lógica para agregar un bus con sus atributos específicos
        } else if ("Camioneta".equals(tipoVehiculo)) {
            String transmision = textFieldTransmisionVehiculo.getText().trim();
            String cambios = textFieldCambiosVehiculo.getText().trim();
            // Lógica para agregar una camioneta con sus atributos específicos
        }

        // Aquí va la lógica común para agregar el vehículo a la lista o base de datos
    }
}
