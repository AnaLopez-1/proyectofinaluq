package co.edu.uniquindio.poo.viewcontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Pick_Ups;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.Vans;
import co.edu.uniquindio.poo.model.Transaccion;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import co.edu.uniquindio.poo.controller.EmpleadoController;

public class EmpleadoViewController {

    private EmpleadoController empleadoController;
    private Vehiculo vehiculoSeleccionado;
    private Cliente clienteSeleccionado;
    private List<Transaccion> transacciones = new ArrayList<>();  // Lista de transacciones


    //----------------------------------------------FXML VEHÍCULOS--------------------------------------

    @FXML
    private TableView<Vehiculo> tableViewVehiculos;
    @FXML
    private ObservableList<Vehiculo> listaVehiculos = FXCollections.observableArrayList();  // Lista completa de vehículos
    @FXML
    private TableView<Cliente> tableViewClientes;
    @FXML
    private TextField textFieldMarcaVehiculo;
    @FXML
    private TextField textFieldModeloVehiculo;
    @FXML
    private TextField textFieldVelocidadMaximaVehiculo;
    @FXML
    private TextField textFieldCilindrajeVehiculo;
    @FXML
    private TextField textFieldCombustibleVehiculo;
    @FXML
    private TextField textFieldTransmisionVehiculo;
    @FXML
    private TextField textFieldCambiosVehiculo;
    @FXML
    private CheckBox checkBoxEsNuevoVehiculo;
    @FXML
    private CheckBox checkBoxRevisionTecnicaVehiculo;
    @FXML
    private CheckBox checkBoxtieneONoAireAcondicionadoVehiculo;
    @FXML
    private CheckBox checkBoxtieneONoCamaraReversaVehiculo;
    @FXML
    private CheckBox checkBoxtieneONoVelocidadCruceroVehiculo;
    @FXML
    private CheckBox checkBoxtieneONoAbsVehiculo;
    @FXML
    private CheckBox checkBoxtieneONoSensoresDeColisionVehiculo;
    @FXML
    private CheckBox checkBoxtieneONoSensorDeTraficoVehiculo;
    @FXML
    private CheckBox checkBoxtieneONoAsistenteDePermanenciaVehiculo;
    @FXML
    private ComboBox<String> comboBoxTipoVehiculo;
    @FXML
    private TableColumn<Vehiculo, String> columnaMarca;
    @FXML
    private TableColumn<Vehiculo, String> columnaModelo;
    @FXML
    private TableColumn<Vehiculo, String> columnaCambios;
    @FXML
    private TableColumn<Vehiculo, String> columnaVelocidadMaxima;
    @FXML
    private TableColumn<Vehiculo, String> columnaCilindraje;
    @FXML
    private TableColumn<Vehiculo, String> columnaCombustible;
    @FXML
    private TableColumn<Vehiculo, String> columnaTransmision;
    @FXML
    private TableColumn<Vehiculo, String> columnaRevisionTecnica;
    @FXML
    private TableColumn<Vehiculo, Boolean> columnaEsNuevo;
    @FXML
    private TableColumn<Vehiculo, String> columnaMaletero;
    @FXML
    private TableColumn<Vehiculo, String> columnaBolsasAire;
    @FXML
    private TableColumn<Vehiculo, String> columnaPasajeros;
    @FXML
    private TableColumn<Vehiculo, String> columnaPuertas;
    @FXML
    private TableColumn<Vehiculo, Boolean> columnaAcondicionado;
    @FXML
    private TableColumn<Vehiculo, Boolean> columnaCamaraReversa;
    @FXML
    private TableColumn<Vehiculo, Boolean> columnaVelocidadCrucero;
    @FXML
    private TableColumn<Vehiculo, Boolean> columnaAbs;
    @FXML
    private TableColumn<Vehiculo, Boolean> columnaSensoresColision;
    @FXML
    private TableColumn<Vehiculo, Boolean> columnaSensoresTrafico;
    @FXML
    private TableColumn<Vehiculo, Boolean> columnaAsistentePermanencia;
    @FXML
    private TableColumn<Vehiculo, String> columnaEjes;
    @FXML
    private TextField textFieldNumeroPasajerosVehiculo;
    @FXML
    private TextField textFieldNumeroPuertasVehiculo;
    @FXML
    private TextField textFieldCapacidadMaleteroVehiculo;
    @FXML
    private TextField textFieldNumeroBolsasDeAireVehiculo;
    @FXML
    private TextField textFieldCapacidadCajaDeCargaVehiculo;
    @FXML
    private TextField textFieldNumeroEjesVehiculo;
    @FXML
    private Label labelVelocidadMaxima;
    @FXML
    private Label labelCilindraje;
    @FXML
    private Label labelCombustible;
    @FXML
    private Label labelTransmision;
    @FXML
    private Label labelMarca;
    @FXML
    private Label labelModelo;
    @FXML
    private Label labelCambios;
    @FXML
    private Label labelRevisionTecnica;
    @FXML
    private Label labelEsNuevo;
    @FXML
    private Label labelNumeroPuertas;
    @FXML
    private Label labelNumeroPasajeros;
    @FXML
    private Label labelCapacidadMaletero;
    @FXML
    private Label labelNumeroBolsasDeAire;
    @FXML
    private Label labelCapacidadCajaDeCarga;
    @FXML
    private Label labelNumeroEjes;
    @FXML
    private Label labeltieneONoAireAcondicionado;
    @FXML
    private Label labeltieneONoCamaraReversa;
    @FXML
    private Label labeltieneONoVelocidadCrucero;
    @FXML
    private Label labeltieneONoAbs;
    @FXML
    private Label labeltieneONoSensoresDeColision;
    @FXML
    private Label labeltieneONoSensorDeTrafico;
    @FXML
    private Label labeltieneONoAsistenteDePermanencia;


    //----------------------------------------------------FXML CLIENTES--------------------------------------------------

    @FXML
    private TextField textFieldNombreCliente;
    @FXML
    private TextField textFieldApellidoCliente;
    @FXML
    private TextField textFieldCorreoCliente;
    @FXML
    private TextField textFieldTelefonoCliente;
    @FXML
    private TextField textFieldCedulaCliente;
    @FXML
    private TextField textFieldDireccionCliente;
    @FXML
    private Button btnAgregarVehiculo;
    @FXML
    private Button btnAgregarCliente;
    @FXML
    private TableColumn<Cliente, String> columnaNombre;
    @FXML
    private TableColumn<Cliente, String> columnaApellido;
    @FXML
    private TableColumn<Cliente, String> columnaCedula;
    @FXML
    private TableColumn<Cliente, String> columnaCorreo;
    @FXML
    private TableColumn<Cliente, String> columnaTelefono;
    @FXML
    private TableColumn<Cliente, String> columnaDireccion;
    @FXML
    private TextField nombre;
    @FXML
    private TextField apellido;
    @FXML
    private TextField correo;
    @FXML
    private TextField telefono;
    @FXML
    private TextField cedula;
    @FXML
    private TextField direccion;
    @FXML
    private ImageView imageViewVehiculo;

    public void initialize() {

        ocultarCamposEspecificosVehiculo();
        comboBoxTipoVehiculo.getValue();
        onTipoVehiculoSeleccionado();

        Empleado empleado = new Empleado("Juan", "Perez", "juan@example.com", "123456789", "E001", "3000", "password123", false);
        empleadoController = new EmpleadoController(empleado);
    
        // Inicializar ComboBox con los tipos de vehículos
        ObservableList<String> tipoVehiculo = FXCollections.observableArrayList("Moto", "Bus", "Camion", "Camioneta", "Deportivo", "Pick Ups", "Sedan", "Vans");
        comboBoxTipoVehiculo.setItems(tipoVehiculo); 

        // Cargar datos iniciales en las tablas
        tableViewVehiculos.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaVehiculos()));
        tableViewClientes.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaClientes()));
        
        // Agregar listeners para seleccionar vehículo y cliente
        tableViewVehiculos.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            vehiculoSeleccionado = newValue;
        });

        comboBoxTipoVehiculo.setOnAction(event -> {
            String tipoSeleccionado = comboBoxTipoVehiculo.getValue();
            mostrarImagenVehiculo(tipoSeleccionado);
            onTipoVehiculoSeleccionado();
        });

        columnaMarca.setCellValueFactory(new PropertyValueFactory<>("Marca"));
        columnaModelo.setCellValueFactory(new PropertyValueFactory<>("Modelo"));
        columnaCambios.setCellValueFactory(new PropertyValueFactory<>("Cambios"));
        columnaVelocidadMaxima.setCellValueFactory(new PropertyValueFactory<>("VelocidadMaxima"));
        columnaCilindraje.setCellValueFactory(new PropertyValueFactory<>("Cilindraje"));
        columnaCombustible.setCellValueFactory(new PropertyValueFactory<>("Combustible"));
        columnaTransmision.setCellValueFactory(new PropertyValueFactory<>("Transmision"));

        columnaRevisionTecnica.setCellValueFactory(new PropertyValueFactory<>("revisionTecnica"));
        columnaEsNuevo.setCellValueFactory(new PropertyValueFactory<>("esNuevo"));
        columnaMaletero.setCellValueFactory(new PropertyValueFactory<>("capacidadMaletero"));
        columnaBolsasAire.setCellValueFactory(new PropertyValueFactory<>("numeroBolsasDeAire"));
        columnaPasajeros.setCellValueFactory(new PropertyValueFactory<>("numeroPasajeros"));
        columnaPuertas.setCellValueFactory(new PropertyValueFactory<>("numeroPuertas"));
        columnaAcondicionado.setCellValueFactory(new PropertyValueFactory<>("tieneONoAireAcondicionado"));
        columnaCamaraReversa.setCellValueFactory(new PropertyValueFactory<>("tieneONoCamaraReversa"));
        columnaVelocidadCrucero.setCellValueFactory(new PropertyValueFactory<>("tieneONoVelocidadCrucero"));
        columnaAbs.setCellValueFactory(new PropertyValueFactory<>("tieneONoCamaraReversa"));
        columnaSensoresColision.setCellValueFactory(new PropertyValueFactory<>("tieneONoSensoresColision"));
        columnaSensoresTrafico.setCellValueFactory(new PropertyValueFactory<>("tieneONoSensorDeTrafico"));
        columnaAsistentePermanencia.setCellValueFactory(new PropertyValueFactory<>("tieneONoAsistenteDePermanencia"));
        columnaEjes.setCellValueFactory(new PropertyValueFactory<>("numeroEjes"));


        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        columnaApellido.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
        columnaCedula.setCellValueFactory(new PropertyValueFactory<>("Cedula"));
        columnaCorreo.setCellValueFactory(new PropertyValueFactory<>("Correo"));
        columnaTelefono.setCellValueFactory(new PropertyValueFactory<>("Telefono"));
        columnaDireccion.setCellValueFactory(new PropertyValueFactory<>("Direccion"));
    

        // Listener para actualizar campos cuando se selecciona un cliente
        tableViewClientes.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
        clienteSeleccionado = newValue;
        if (clienteSeleccionado != null) {
            mostrarDatosCliente(clienteSeleccionado);
        }
    });
    }


    //--------------------------------------------VEHÍCULOS----------------------------------------

    private void ocultarCamposEspecificosVehiculo() {

        labelMarca.setVisible(false);
        textFieldMarcaVehiculo.setVisible(false);

        labelEsNuevo.setVisible(false);
        checkBoxEsNuevoVehiculo.setVisible(false);

        labelModelo.setVisible(false);
        textFieldModeloVehiculo.setVisible(false);

        labelCambios.setVisible(false);
        textFieldCambiosVehiculo.setVisible(false);

        labelVelocidadMaxima.setVisible(false);
        textFieldVelocidadMaximaVehiculo.setVisible(false);

        labelCilindraje.setVisible(false);
        textFieldCilindrajeVehiculo.setVisible(false);

        labelCombustible.setVisible(false);
        textFieldCombustibleVehiculo.setVisible(false);

        labelTransmision.setVisible(false);
        textFieldTransmisionVehiculo.setVisible(false);

        labelRevisionTecnica.setVisible(false);
        checkBoxRevisionTecnicaVehiculo.setVisible(false);

        labeltieneONoAireAcondicionado.setVisible(false);
        checkBoxtieneONoAireAcondicionadoVehiculo.setVisible(false);

        labeltieneONoCamaraReversa.setVisible(false);
        checkBoxtieneONoCamaraReversaVehiculo.setVisible(false);

        labeltieneONoVelocidadCrucero.setVisible(false);
        checkBoxtieneONoVelocidadCruceroVehiculo.setVisible(false);

        labeltieneONoAbs.setVisible(false);
        checkBoxtieneONoAbsVehiculo.setVisible(false);

        labeltieneONoSensoresDeColision.setVisible(false);
        checkBoxtieneONoSensoresDeColisionVehiculo.setVisible(false);

        labeltieneONoSensorDeTrafico.setVisible(false);
        checkBoxtieneONoSensorDeTraficoVehiculo.setVisible(false);

        labeltieneONoAsistenteDePermanencia.setVisible(false);
        checkBoxtieneONoAsistenteDePermanenciaVehiculo.setVisible(false);

        labelNumeroPuertas.setVisible(false);
        textFieldNumeroPuertasVehiculo.setVisible(false);

        labelNumeroPasajeros.setVisible(false);
        textFieldNumeroPasajerosVehiculo.setVisible(false);

        labelNumeroEjes.setVisible(false);
        textFieldNumeroEjesVehiculo.setVisible(false);

        labelCapacidadCajaDeCarga.setVisible(false);
        textFieldCapacidadCajaDeCargaVehiculo.setVisible(false);

        labelCapacidadMaletero.setVisible(false);
        textFieldCapacidadMaleteroVehiculo.setVisible(false);

        labelNumeroBolsasDeAire.setVisible(false);
        textFieldNumeroBolsasDeAireVehiculo.setVisible(false);
    }

    @FXML
    public void onTipoVehiculoSeleccionado() {
        ocultarCamposEspecificosVehiculo();
        // Dependiendo del tipo de vehículo seleccionado, mostramos los atributos específicos
        String tipoVehiculo = comboBoxTipoVehiculo.getValue();

        if ("Moto".equals(tipoVehiculo)) {
            mostrarCamposMoto();
        } else if ("Bus".equals(tipoVehiculo)) {
            mostrarCamposBus();
        } else if ("Camion".equals(tipoVehiculo)) {
            mostrarCamposCamion();
        } else if ("Camioneta".equals(tipoVehiculo)) {
            mostrarCamposCamioneta();
        } else if ("Deportivo".equals(tipoVehiculo)) {
            mostrarCamposDeportivo();
        } else if ("Pick Ups".equals(tipoVehiculo)) {
            mostrarCamposPickUps();
        } else if ("Sedan".equals(tipoVehiculo)) {
            mostrarCamposSedan();
        } else if ("Vans".equals(tipoVehiculo)) {
            mostrarCamposVans();
        }
    }

    private void mostrarCamposMoto() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
        labelModelo.setVisible(true);
        textFieldModeloVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelRevisionTecnica.setVisible(true);
        checkBoxRevisionTecnicaVehiculo.setVisible(true);
    }

    private void mostrarCamposBus() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
        labelModelo.setVisible(true);
        textFieldModeloVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelRevisionTecnica.setVisible(true);
        checkBoxRevisionTecnicaVehiculo.setVisible(true);
        labelNumeroPuertas.setVisible(true);
        textFieldNumeroPuertasVehiculo.setVisible(true);
        labelNumeroPasajeros.setVisible(true);
        textFieldNumeroPasajerosVehiculo.setVisible(true);
        labelCapacidadMaletero.setVisible(true);
        textFieldCapacidadMaleteroVehiculo.setVisible(true);
        labelNumeroBolsasDeAire.setVisible(true);
        textFieldNumeroBolsasDeAireVehiculo.setVisible(true);
    }
    
    private void mostrarCamposCamioneta() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
        labelModelo.setVisible(true);
        textFieldModeloVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelRevisionTecnica.setVisible(true);
        checkBoxRevisionTecnicaVehiculo.setVisible(true);
        labelNumeroPuertas.setVisible(true);
        textFieldNumeroPuertasVehiculo.setVisible(true);
        labelNumeroPasajeros.setVisible(true);
        textFieldNumeroPasajerosVehiculo.setVisible(true);
        labelCapacidadMaletero.setVisible(true);
        textFieldCapacidadMaleteroVehiculo.setVisible(true);
        labelNumeroBolsasDeAire.setVisible(true);
        textFieldNumeroBolsasDeAireVehiculo.setVisible(true);
    }
    
    private void mostrarCamposCamion() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
        labelModelo.setVisible(true);
        textFieldModeloVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelRevisionTecnica.setVisible(true);
        checkBoxRevisionTecnicaVehiculo.setVisible(true);
        labelCapacidadCajaDeCarga.setVisible(true);
        textFieldCapacidadCajaDeCargaVehiculo.setVisible(true);
        labelNumeroEjes.setVisible(true);
        textFieldNumeroEjesVehiculo.setVisible(true);
    }

    private void mostrarCamposDeportivo() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
        labelModelo.setVisible(true);
        textFieldModeloVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelRevisionTecnica.setVisible(true);
        checkBoxRevisionTecnicaVehiculo.setVisible(true);
        labelNumeroPuertas.setVisible(true);
        textFieldNumeroPuertasVehiculo.setVisible(true);
        labelNumeroPasajeros.setVisible(true);
        textFieldNumeroPasajerosVehiculo.setVisible(true);
        labelNumeroBolsasDeAire.setVisible(true);
        textFieldNumeroBolsasDeAireVehiculo.setVisible(true);
    }

    private void mostrarCamposPickUps() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
        labelModelo.setVisible(true);
        textFieldModeloVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelRevisionTecnica.setVisible(true);
        checkBoxRevisionTecnicaVehiculo.setVisible(true);
        labelNumeroPuertas.setVisible(true);
        textFieldNumeroPuertasVehiculo.setVisible(true);
        labelNumeroPasajeros.setVisible(true);
        textFieldNumeroPasajerosVehiculo.setVisible(true);
        labelNumeroBolsasDeAire.setVisible(true);
        textFieldNumeroBolsasDeAireVehiculo.setVisible(true);
        labelCapacidadCajaDeCarga.setVisible(true);
        textFieldCapacidadCajaDeCargaVehiculo.setVisible(true);
    }

    private void mostrarCamposSedan() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
        labelModelo.setVisible(true);
        textFieldModeloVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelRevisionTecnica.setVisible(true);
        checkBoxRevisionTecnicaVehiculo.setVisible(true);
        labelNumeroPuertas.setVisible(true);
        textFieldNumeroPuertasVehiculo.setVisible(true);
        labelNumeroPasajeros.setVisible(true);
        textFieldNumeroPasajerosVehiculo.setVisible(true);
        labelCapacidadMaletero.setVisible(true);
        textFieldCapacidadMaleteroVehiculo.setVisible(true);
        labeltieneONoAireAcondicionado.setVisible(true);
        checkBoxtieneONoAireAcondicionadoVehiculo.setVisible(true);
        labeltieneONoCamaraReversa.setVisible(true);
        checkBoxtieneONoCamaraReversaVehiculo.setVisible(true);
        labeltieneONoVelocidadCrucero.setVisible(true);
        checkBoxtieneONoVelocidadCruceroVehiculo.setVisible(true);
        labelNumeroBolsasDeAire.setVisible(true);
        textFieldNumeroBolsasDeAireVehiculo.setVisible(true);
        labeltieneONoAbs.setVisible(true);
        checkBoxtieneONoAbsVehiculo.setVisible(true);
        labeltieneONoSensoresDeColision.setVisible(true);
        checkBoxtieneONoSensoresDeColisionVehiculo.setVisible(true);
        labeltieneONoSensorDeTrafico.setVisible(true);
        checkBoxtieneONoSensorDeTraficoVehiculo.setVisible(true);
        labeltieneONoAsistenteDePermanencia.setVisible(true);
        checkBoxtieneONoAsistenteDePermanenciaVehiculo.setVisible(true);
    }

    private void mostrarCamposVans() {
        labelMarca.setVisible(true);
        textFieldMarcaVehiculo.setVisible(true);
        labelEsNuevo.setVisible(true);
        checkBoxEsNuevoVehiculo.setVisible(true);
        labelModelo.setVisible(true);
        textFieldModeloVehiculo.setVisible(true);
        labelCambios.setVisible(true);
        textFieldCambiosVehiculo.setVisible(true);
        labelVelocidadMaxima.setVisible(true);
        textFieldVelocidadMaximaVehiculo.setVisible(true);
        labelCilindraje.setVisible(true);
        textFieldCilindrajeVehiculo.setVisible(true);
        labelCombustible.setVisible(true);
        textFieldCombustibleVehiculo.setVisible(true);
        labelTransmision.setVisible(true);
        textFieldTransmisionVehiculo.setVisible(true);
        labelRevisionTecnica.setVisible(true);
        checkBoxRevisionTecnicaVehiculo.setVisible(true);
        labelNumeroPuertas.setVisible(true);
        textFieldNumeroPuertasVehiculo.setVisible(true);
        labelNumeroPasajeros.setVisible(true);
        textFieldNumeroPasajerosVehiculo.setVisible(true);
        labelCapacidadMaletero.setVisible(true);
        textFieldCapacidadMaleteroVehiculo.setVisible(true);
        labelNumeroBolsasDeAire.setVisible(true);
        textFieldNumeroBolsasDeAireVehiculo.setVisible(true);
    }

    @FXML
    public void agregarVehiculo(ActionEvent event) {

        try {
            String marca = textFieldMarcaVehiculo.getText().trim();
            String modelo = textFieldModeloVehiculo.getText().trim();
            String cambios = textFieldCambiosVehiculo.getText().trim();
            String velocidadMaxima = textFieldVelocidadMaximaVehiculo.getText().trim();
            String cilindraje = textFieldCilindrajeVehiculo.getText().trim();
            String combustible = textFieldCombustibleVehiculo.getText().trim();
            String transmision = textFieldTransmisionVehiculo.getText().trim();
            boolean esNuevo = checkBoxEsNuevoVehiculo.isSelected();
            boolean revisionTecnica = checkBoxRevisionTecnicaVehiculo.isSelected();
            String tipoSeleccionado = comboBoxTipoVehiculo.getValue();
            String numeroPasajeros = textFieldNumeroPasajerosVehiculo.getText().trim();
            String numeroPuertas = textFieldNumeroPuertasVehiculo.getText().trim();
            String capacidadMaletero = textFieldCapacidadMaleteroVehiculo.getText().trim();
            String numeroBolsasDeAire = textFieldNumeroBolsasDeAireVehiculo.getText().trim();
            String capacidadCajaDeCarga = textFieldCapacidadCajaDeCargaVehiculo.getText().trim();
            String numeroEjes = textFieldNumeroEjesVehiculo.getText().trim();
            boolean tieneONoAireAcondicionado = checkBoxtieneONoAireAcondicionadoVehiculo.isSelected();
            boolean tieneONoCamaraReversa = checkBoxtieneONoCamaraReversaVehiculo.isSelected();
            boolean tieneONoVelocidadCrucero = checkBoxtieneONoVelocidadCruceroVehiculo.isSelected();
            boolean tieneONoAbs = checkBoxtieneONoAbsVehiculo.isSelected();
            boolean tieneONoSensoresColision = checkBoxtieneONoSensoresDeColisionVehiculo.isSelected();
            boolean tieneONoSensorDeTrafico = checkBoxtieneONoSensorDeTraficoVehiculo.isSelected();
            boolean tieneONoAsistenteDePermanencia = checkBoxtieneONoAsistenteDePermanenciaVehiculo.isSelected();


            Vehiculo nuevoVehiculo;
            switch (tipoSeleccionado) {
                case "Moto":
                    nuevoVehiculo = new Moto(marca, esNuevo, modelo, cambios , velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
                    break;
                case "Bus":
                    nuevoVehiculo = new Bus(marca, esNuevo, modelo, cambios , velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire);
                    break;
                case "Camion":
                    nuevoVehiculo = new Camion(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, capacidadCajaDeCarga, numeroEjes);
                    break;
                case "Camioneta":
                    nuevoVehiculo = new Camioneta(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire);
                    break;
                case "Deportivo":
                    nuevoVehiculo = new Deportivo(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, numeroBolsasDeAire);
                    break;
                case "Pick Ups":
                    nuevoVehiculo = new Pick_Ups(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadCajaDeCarga, numeroBolsasDeAire);
                    break;
                case "Sedan":
                    nuevoVehiculo = new Sedan(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, tieneONoAireAcondicionado, tieneONoCamaraReversa, tieneONoVelocidadCrucero, numeroBolsasDeAire, tieneONoAbs, tieneONoSensoresColision, tieneONoSensorDeTrafico, tieneONoAsistenteDePermanencia);
                    break;
                case "Vans":
                    nuevoVehiculo = new Vans(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire);
                    break;
                    default:
                    showAlert("Error", "Seleccione un tipo de vehículo.");
                    return;
            }

            if (empleadoController.agregarVehiculo(nuevoVehiculo)) {
                tableViewVehiculos.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaVehiculos()));
                showAlert("Vehículo agregado", "El vehículo ha sido agregado correctamente.");
            } else {
                showAlert("Error", "No se pudo agregar el vehículo.");
            }
        } catch (NumberFormatException e) {
            showAlert("Error", "Por favor, verifique los valores numéricos ingresados.");
        }
    }

    @FXML
    public void eliminarVehiculo() {
        try {
            String marca = textFieldMarcaVehiculo.getText().trim();
            String modelo = textFieldModeloVehiculo.getText().trim();
            String cambios = textFieldCambiosVehiculo.getText().trim();
            String velocidadMaxima = textFieldVelocidadMaximaVehiculo.getText().trim();
            String cilindraje = textFieldCilindrajeVehiculo.getText().trim();
            String combustible = textFieldCombustibleVehiculo.getText().trim();
            String transmision = textFieldTransmisionVehiculo.getText().trim();
            boolean esNuevo = checkBoxEsNuevoVehiculo.isSelected();
            boolean revisionTecnica = checkBoxRevisionTecnicaVehiculo.isSelected();
            String tipoSeleccionado = comboBoxTipoVehiculo.getValue();
            String numeroPasajeros = textFieldNumeroPasajerosVehiculo.getText().trim();
            String numeroPuertas = textFieldNumeroPuertasVehiculo.getText().trim();
            String capacidadMaletero = textFieldCapacidadMaleteroVehiculo.getText().trim();
            String numeroBolsasDeAire = textFieldNumeroBolsasDeAireVehiculo.getText().trim();
            String capacidadCajaDeCarga = textFieldCapacidadCajaDeCargaVehiculo.getText().trim();
            String numeroEjes = textFieldNumeroEjesVehiculo.getText().trim();
            boolean tieneONoAireAcondicionado = checkBoxtieneONoAireAcondicionadoVehiculo.isSelected();
            boolean tieneONoCamaraReversa = checkBoxtieneONoCamaraReversaVehiculo.isSelected();
            boolean tieneONoVelocidadCrucero = checkBoxtieneONoVelocidadCruceroVehiculo.isSelected();
            boolean tieneONoAbs = checkBoxtieneONoAbsVehiculo.isSelected();
            boolean tieneONoSensoresColision = checkBoxtieneONoSensoresDeColisionVehiculo.isSelected();
            boolean tieneONoSensorDeTrafico = checkBoxtieneONoSensorDeTraficoVehiculo.isSelected();
            boolean tieneONoAsistenteDePermanencia = checkBoxtieneONoAsistenteDePermanenciaVehiculo.isSelected();


            Vehiculo nuevoVehiculo;
            switch (tipoSeleccionado) {
                case "Moto":
                    nuevoVehiculo = new Moto(marca, esNuevo, modelo, cambios , velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
                    break;
                case "Bus":
                    nuevoVehiculo = new Bus(marca, esNuevo, modelo, cambios , velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire);
                    break;
                case "Camion":
                    nuevoVehiculo = new Camion(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, capacidadCajaDeCarga, numeroEjes);
                    break;
                case "Camioneta":
                    nuevoVehiculo = new Camioneta(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire);
                    break;
                case "Deportivo":
                    nuevoVehiculo = new Deportivo(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, numeroBolsasDeAire);
                    break;
                case "Pick Ups":
                    nuevoVehiculo = new Pick_Ups(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadCajaDeCarga, numeroBolsasDeAire);
                    break;
                case "Sedan":
                    nuevoVehiculo = new Sedan(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, tieneONoAireAcondicionado, tieneONoCamaraReversa, tieneONoVelocidadCrucero, numeroBolsasDeAire, tieneONoAbs, tieneONoSensoresColision, tieneONoSensorDeTrafico, tieneONoAsistenteDePermanencia);
                    break;
                case "Vans":
                    nuevoVehiculo = new Vans(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire);
                    break;
                    default:
                    showAlert("Error", "Seleccione un tipo de vehículo.");
                    return;
            }

            if (empleadoController.eliminarVehiculo(marca)){
                tableViewVehiculos.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaVehiculos()));
                showAlert("Vehículo actualizado", "El vehículo ha sido actualizado correctamente.");
            } else {
                showAlert("Error", "No se pudo actualizar el vehículo.");
            }
        } catch (NumberFormatException e) {
            showAlert("Error", "Por favor, verifique los valores numéricos ingresados.");
        }
    }

    // Aquí debajo, puedes poner el método para mostrar la imagen
    
    private void mostrarImagenVehiculo(String tipoSeleccionado) {
        try {
            String rutaImagen = "";

            // Determinar la ruta de la imagen según el tipo de vehículo
            switch (tipoSeleccionado) {
                case "Moto":
                    rutaImagen = "/imagen/moto.jpg";
                    break;
                case "Camion":
                    rutaImagen = "/imagen/camion.jpg";
                    break;
                case "Camioneta":
                    rutaImagen = "/imagen/camioneta.jpg";
                    break;
                case "Deportivo":
                    rutaImagen = "/imagen/Deportivo.jpg";
                    break;
                case "Bus":
                    rutaImagen = "/imagen/Bus.jpg";
                    break;
                case "Sedan":
                    rutaImagen = "/imagen/Sedan.jpg";
                    break;
                case "Vans":
                    rutaImagen = "/imagen/Van.jpg";
                    break;
                case "Pick Ups":
                    rutaImagen = "/imagen/pickUps.jpg";
                    break;
                default:
                    rutaImagen = "/imagen/default.png";  // Imagen por defecto
                    break;
            }

            // Cargar la imagen desde el archivo de recursos
            Image image = new Image(getClass().getResourceAsStream(rutaImagen));

            // Establecer la imagen en el ImageView
            imageViewVehiculo.setImage(image);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //-----------------------------------------CLIENTES--------------------------------------------

    // Método para mostrar los datos del cliente en los campos de texto
    private void mostrarDatosCliente(Cliente cliente) {
        textFieldNombreCliente.setText(cliente.getNombre());
        textFieldApellidoCliente.setText(cliente.getApellido());
        textFieldCorreoCliente.setText(cliente.getCorreo());
        textFieldTelefonoCliente.setText(cliente.getTelefono());
        textFieldCedulaCliente.setText(cliente.getCedula());
        textFieldDireccionCliente.setText(cliente.getDireccion());
    }
    
    @FXML
    public void agregarCliente() {
        String nombre = textFieldNombreCliente.getText().trim();
        String apellido = textFieldApellidoCliente.getText().trim();
        String correo = textFieldCorreoCliente.getText().trim();
        String telefono = textFieldTelefonoCliente.getText().trim();
        String cedula = textFieldCedulaCliente.getText().trim();
        String direccion = textFieldDireccionCliente.getText().trim();

        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || correo.isEmpty() || direccion.isEmpty()) {
            showAlert("Error", "Todos los campos deben estar completos");
            return;
        }

        Cliente cliente = new Cliente(nombre, apellido, correo, telefono, cedula, direccion);
        if (empleadoController.agregarCliente(cliente)) {
            tableViewClientes.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaClientes()));
            showAlert("Cliente agregado", "El cliente ha sido agregado correctamente.");
        } else {
            showAlert("Error", "No se pudo agregar el cliente.");
        }
    }

    @FXML
    public void actualizarCliente() {
        String nombre = textFieldNombreCliente.getText().trim();
        String apellido = textFieldApellidoCliente.getText().trim();
        String correo = textFieldCorreoCliente.getText().trim();
        String telefono = textFieldTelefonoCliente.getText().trim();
        String cedula = textFieldCedulaCliente.getText().trim();
        String direccion = textFieldDireccionCliente.getText().trim();

        if (cedula.isEmpty()) {
            showAlert("Error", "La cédula no puede estar vacía.");
            return;
        }

        // Buscar el cliente en la lista
        Cliente clienteExistente = null;
        for (Cliente cliente : empleadoController.obtenerListaClientes()) {
            if (cliente.getCedula().equals(cedula)) {
                clienteExistente = cliente;
                break;
            }
        }

        if (clienteExistente != null) {
            // Actualizar atributos del cliente
            clienteExistente.setNombre(nombre);
            clienteExistente.setApellido(apellido);
            clienteExistente.setCorreo(correo);
            clienteExistente.setTelefono(telefono);
            clienteExistente.setDireccion(direccion);

            // Llamar al método para actualizar el cliente en empleadoController
            if (empleadoController.actualizarCliente(cedula, clienteExistente)) {
                actualizarTablaClientes();
                                showAlert("Cliente actualizado", "El cliente ha sido actualizado correctamente.");
                            } else {
                                showAlert("Error", "No se pudo actualizar el cliente.");
                            }
                        } else {
                            showAlert("Error", "No se encontró un cliente con esa cédula.");
                        }
                    }
                
                
                    private void actualizarTablaClientes() {
                        // Limpia la tabla actual
                        tableViewClientes.getItems().clear();
                        // Vuelve a cargar la lista de clientes en la tabla desde el empleadoController
                        tableViewClientes.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaClientes()));
                        // Refresca la vista de la tabla
                        tableViewClientes.refresh();
                    }
                    

                
    @FXML
    public void eliminarCliente() {
        String nombre = textFieldNombreCliente.getText().trim();
        String apellido = textFieldApellidoCliente.getText().trim();
        String correo = textFieldCorreoCliente.getText().trim();
        String telefono = textFieldTelefonoCliente.getText().trim();
        String cedula = textFieldCedulaCliente.getText().trim();
        String direccion = textFieldDireccionCliente.getText().trim();

        if (cedula.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || correo.isEmpty() || direccion.isEmpty()) {
            showAlert("Error", "La cédula del cliente no puede estar vacía.");
            return;
        }

        // Verificar si el cliente existe en la lista
        boolean clienteEliminado = empleadoController.eliminarCliente(cedula);
        
        if (clienteEliminado) {
            // Actualizar la tabla de clientes
            tableViewClientes.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaClientes()));
            showAlert("Cliente eliminado", "El cliente ha sido eliminado correctamente.");
        } else {
            showAlert("Error", "No se pudo eliminar el cliente. Verifique la cédula.");
        }
    }

    //TRANSACCIONES--------------------------------------------------------------------------------------

    @FXML
    public void realizarTransaccion() {
        try {
            if (clienteSeleccionado == null) {
                mostrarError("Debe seleccionar un cliente.");
                return;
            }
            
            if (vehiculoSeleccionado == null) {
                mostrarError("Debe seleccionar un vehículo.");
                return;
            }
            
            // Ejemplo de registro de transacción
            Transaccion transaccion = new Transaccion(null, clienteSeleccionado, vehiculoSeleccionado, null, null);
            transacciones.add(transaccion);
            
            // Confirmar la transacción
            mostrarExito("Transacción realizada con éxito.");
            
        } catch (Exception e) {
            // Manejo de excepciones
            mostrarError("Ocurrió un error al realizar la transacción: " + e.getMessage());
        }
    }

    // Métodos auxiliares para mostrar mensajes al usuario
    private void mostrarExito(String mensaje) {
        // Código para mostrar un mensaje de éxito (puede ser un alert de JavaFX, por ejemplo)
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Éxito");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    private void mostrarError(String mensaje) {
        // Código para mostrar un mensaje de error (puede ser un alert de JavaFX, por ejemplo)
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    @FXML
    private void limpiarCampos() {
        textFieldNombreCliente.setText("");
        textFieldApellidoCliente.setText("");
        textFieldCorreoCliente.setText("");
        textFieldTelefonoCliente.setText("");
        textFieldCedulaCliente.setText("");
        textFieldDireccionCliente.setText("");
        textFieldMarcaVehiculo.setText("");
        textFieldModeloVehiculo.setText("");
        textFieldCambiosVehiculo.setText("");
        textFieldVelocidadMaximaVehiculo.setText("");
        textFieldCilindrajeVehiculo.setText("");
        textFieldCombustibleVehiculo.setText("");
        textFieldTransmisionVehiculo.setText("");
        checkBoxEsNuevoVehiculo.setText("");
        checkBoxRevisionTecnicaVehiculo.setText("");
        textFieldNumeroPasajerosVehiculo.setText("");
        textFieldNumeroPuertasVehiculo.setText("");
        textFieldCapacidadMaleteroVehiculo.setText("");
        textFieldNumeroBolsasDeAireVehiculo.setText("");
        textFieldCapacidadCajaDeCargaVehiculo.setText("");
        textFieldNumeroEjesVehiculo.setText("");
        checkBoxtieneONoAireAcondicionadoVehiculo.setText("");
        checkBoxtieneONoCamaraReversaVehiculo.setText("");
        checkBoxtieneONoVelocidadCruceroVehiculo.setText("");
        checkBoxtieneONoAbsVehiculo.setText("");
        checkBoxtieneONoSensoresDeColisionVehiculo.setText("");
        checkBoxtieneONoSensorDeTraficoVehiculo.setText("");
        checkBoxtieneONoAsistenteDePermanenciaVehiculo.setText("");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}