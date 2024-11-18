package co.edu.uniquindio.poo.viewcontroller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.time.LocalDate;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.controller.AdministradorController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Reporte;
import javafx.event.ActionEvent;


public class AdministradorViewController {

    private Empleado empleadoSeleccionado;
    private AdministradorController administradorController;

    @FXML 
    private TextField textFieldIdEmpleado; 
    @FXML
    private ObservableList<Empleado> listaEmpleados = FXCollections.observableArrayList(); 
    @FXML 
    private TableColumn<Empleado, String> columnaTelefono; 
    @FXML 
    private TableColumn<Empleado, String> columnaCorreo; 

    @FXML 
    private TableView<Empleado> tableViewEmpleado; 

    @FXML 
    private DatePicker textFieldPeriodoDeTiempoEmpleado; 

    @FXML 
    private TableColumn<Empleado, String> columnaApellido; 
    
    @FXML 
    private TableColumn<Empleado, String> columnaEstado; 

    @FXML 
    private TextField textFieldTelefonoEmpleado; 

    @FXML 
    private TextField textFieldIsBlocked;

    @FXML 
    private TextField textFieldApellidoEmpleado; 

    @FXML 
    private TextField textFieldCorreoEmpleado; 

    @FXML 
    private Button btnlimparCampos; 

    @FXML 
    private TableColumn<Empleado, String> columnaId; 

    @FXML 
    private Button btnactualizarEmpleado; 

    @FXML 
    private TextField textFieldNombreEmpleado; 

    @FXML 
    private Button btnGeneracionDeReporte; 
    @FXML 
    private Button btnregistrarEmpleado; 

    @FXML 
    private Button btnbloquearEmpleado; 

    @FXML 
    private TableColumn<Empleado, String> columnaNombre; 
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
    private TextField idEmpleado;
    @FXML
    private TextField salario;
    @FXML
    private TextField contraseña;
    @FXML
    private TextField isBlocked;
    //---------------------------------------------------------------REPORTE-------------------------------------------------------------------------------------------------//
     @FXML
    private ResourceBundle resources;
    @FXML
    private TextField textFieldEmpleado;
    @FXML
    private Text labelNegocio;
    @FXML
    private Text labelEmpleado;
    @FXML
    private Text labelFecha;
    @FXML
    private Text labelMonto;
    @FXML
    private TableView<Reporte> tableViewReporte;
    @FXML
    private ComboBox<String> comboBoxNegocio;
    @FXML
    private ComboBox<String> comboBoxMonto;
    @FXML
    private TableColumn<Reporte, String> columnaEmpleado;
    @FXML
    private TableColumn<Reporte, String> columnaNegocio;
    @FXML
    private TableColumn<Reporte, LocalDate> columnaFecha;
    @FXML
    private TableColumn<Reporte, String> columnaMonto;
     @FXML
    private Button btngenerarReporte;
    @FXML
    private DatePicker datePickerFecha;
    @FXML
    void generarReporte(ActionEvent event) {
    }
    @FXML
    void onNegocio(ActionEvent event) {
    }
    @FXML
    void onMonto(ActionEvent event) {
    }
    @FXML
    private ObservableList<Reporte> listaReportes;
    
    @FXML
    void initialize() {
        // Configurar las columnas de la tabla
    columnaEmpleado.setCellValueFactory(new PropertyValueFactory<>("Empleado"));
    columnaNegocio.setCellValueFactory(new PropertyValueFactory<>("Negocio"));
    columnaFecha.setCellValueFactory(new PropertyValueFactory<>("Fecha"));
    columnaMonto.setCellValueFactory(new PropertyValueFactory<>("Monto"));
    tableViewReporte.setItems(FXCollections.observableArrayList());
    ObservableList<String> negocio = FXCollections.observableArrayList(
            "Venta Vehiculo",
            "Alquiler Vehiculo",
            "Compra Vehiculo"
        );
        // Asignar las opciones al ComboBox
        comboBoxNegocio.setItems(negocio);

        // Asociar un evento al seleccionar un negocio
        comboBoxNegocio.setOnAction(e -> onNegocio());
        iniciales();
    
    ObservableList<String> monto = FXCollections.observableArrayList("$10,000,000 (vehículo usado económico para reventa)", "$90,000,000 (vehículo nuevo para flota empresarial)","$200,000,000 (vehículo de alta gama para concesionario)","$100,000 (1 día, auto económico)",
    "$250,000 (1 día, auto de gama media)","$1,200,000 (semana completa, SUV estándar)","$4,500,000 (mes completo, vehículo de alta gama)","$20,000,000 (vehículo usado económico)",
     "$35,000,000 (vehículo usado en buen estado)",
    "$70,000,000 (vehículo nuevo estándar)",
    "$150,000,000 (vehículo de alta gama)"
    );

        // Asignar las opciones al ComboBox
        comboBoxMonto.setItems(monto);

        // Asociar un evento al seleccionar un negocio
        comboBoxMonto.setOnAction(e -> onMonto());
        iniciales();
    }
    
    @FXML
    public void onMonto() {
        // Obtener el negocio seleccionado
        String montoSeleccionado = comboBoxMonto.getValue();
        // Verificar el monto seleccionado y realizar las acciones correspondientes
    if ("$10,000,000 (vehículo usado económico para reventa)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Vehículo usado económico para reventa seleccionado.");
    } else if ("$90,000,000 (vehículo nuevo para flota empresarial)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Vehículo nuevo para flota empresarial seleccionado.");
    } else if ("$200,000,000 (vehículo de alta gama para concesionario)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Vehículo de alta gama para concesionario seleccionado.");
    } else if ("$100,000 (1 día, auto económico)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("1 día, auto económico seleccionado.");
    } else if ("$250,000 (1 día, auto de gama media)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("1 día, auto de gama media seleccionado.");
    } else if ("$1,200,000 (semana completa, SUV estándar)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Semana completa, SUV estándar seleccionado.");
    } else if ("$4,500,000 (mes completo, vehículo de alta gama)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Mes completo, vehículo de alta gama seleccionado.");
    } else if ("$20,000,000 (vehículo usado económico)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Vehículo usado económico seleccionado.");
    } else if ("$35,000,000 (vehículo usado en buen estado)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Vehículo usado en buen estado seleccionado.");
    } else if ("$70,000,000 (vehículo nuevo estándar)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Vehículo nuevo estándar seleccionado.");
    } else if ("$150,000,000 (vehículo de alta gama)".equals(montoSeleccionado)) {
        // Acción para este monto
        System.out.println("Vehículo de alta gama seleccionado.");
    } else {
        // Acción por defecto si el monto seleccionado no coincide con ninguno
        System.out.println("Monto no reconocido.");
    }
    }
    
    @FXML
    public void onNegocio() {
        // Obtener el negocio seleccionado
        String negocioSeleccionado = comboBoxNegocio.getValue();
        // Verificar el negocio y mostrar los campos correspondientes
        if ("Venta Vehiculo".equals(negocioSeleccionado)) {
        } else if ("Alquiler Vehiculo".equals(negocioSeleccionado)) {
        } else if ("Compra Vehiculo".equals(negocioSeleccionado)) {
        }
    }
    @FXML
    public void generarReporte() {
    System.out.println("Botón Generar Reporte presionado");

    // Obtener los valores ingresados en los campos
    String empleado = textFieldEmpleado.getText();
    LocalDate fechaSeleccionada = datePickerFecha.getValue();
    String negocioSeleccionado = comboBoxNegocio.getValue();
    String montoSeleccionado = comboBoxMonto.getValue();

    // Validar que todos los campos estén llenos
    if (empleado.isEmpty() || fechaSeleccionada == null || negocioSeleccionado == null || montoSeleccionado.isEmpty()) {
        showAlert("Error", "Todos los campos son obligatorios.");
        return;
    }

    // Crear un nuevo registro con los datos ingresados
    Reporte reporte = new Reporte(empleado, fechaSeleccionada, negocioSeleccionado, montoSeleccionado);

    // Agregar el nuevo registro a la tabla
    tableViewReporte.getItems().add(reporte);

    // Limpiar los campos después de agregar
    limpiarCampos();

    // Mostrar mensaje de éxito
    showAlert("Generar Reporte", "El reporte ha sido agregado a la tabla.");
    }
    @FXML
    private void mostrarDatosReporte(Reporte reporte) {
        // Asignar valores a los controles de la interfaz
        textFieldEmpleado.setText(reporte.getEmpledo()); // Asigna el empleado al TextField
        datePickerFecha.setValue(reporte.getFecha()); // Asigna la fecha al DatePicker (debe ser LocalDate)
        comboBoxNegocio.setValue(reporte.getNegocio()); // Asigna el negocio al ComboBox
        comboBoxMonto.setValue(reporte.getMonto()); // Asigna el monto al TextFieldSystem.out.println("Empleado: " + reporte.getEmpledo());
        System.out.println("Fecha: " + reporte.getFecha());
        System.out.println("Negocio: " + reporte.getNegocio());
        System.out.println("Monto: " + reporte.getMonto());
}    
    @FXML
    public void iniciales(){
        Administrador administrador = new Administrador("Juan", "Perez", "juan@example.com", "123456789", "E001", "3000", "password123");
        administradorController = new AdministradorController(administrador);
        
        tableViewEmpleado.setItems(FXCollections.observableArrayList(administradorController.obtenerListaEmpleados()));

        // Configuración de las columnas de la tabla
        columnaNombre.setCellValueFactory(new PropertyValueFactory<>("Nombre"));
        columnaApellido.setCellValueFactory(new PropertyValueFactory<>("Apellido"));
        columnaTelefono.setCellValueFactory(new PropertyValueFactory<>("Telefono"));
        columnaCorreo.setCellValueFactory(new PropertyValueFactory<>("Correo"));
        columnaId.setCellValueFactory(new PropertyValueFactory<>("idEmpleado"));
        columnaEstado.setCellValueFactory(cellData -> {
            return new SimpleStringProperty(cellData.getValue().isBlocked() ? "Bloqueado" : "Activo");
    });

        tableViewEmpleado.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            empleadoSeleccionado = newValue;
            if (empleadoSeleccionado != null) {
                mostrarDatosEmpleado(empleadoSeleccionado);
            }
        });
    }

    private void mostrarDatosEmpleado(Empleado empleado) {
        textFieldNombreEmpleado.setText(empleado.getNombre());
        textFieldApellidoEmpleado.setText(empleado.getApellido());
        textFieldCorreoEmpleado.setText(empleado.getCorreo());
        textFieldTelefonoEmpleado.setText(empleado.getTelefono());
        textFieldIdEmpleado.setText(empleado.getIdEmpleado());
        textFieldIsBlocked.setText(empleado.isBlocked() ? "Bloqueado" : "Activo");
    }

    // Método para registrar empleado
    @FXML
    public void registrarEmpleado() {
        String nombre = textFieldNombreEmpleado.getText();
        String apellido = textFieldApellidoEmpleado.getText();
        String telefono = textFieldTelefonoEmpleado.getText();
        String correo = textFieldCorreoEmpleado.getText();
        String idEmpleado = textFieldIdEmpleado.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || telefono.isEmpty() || correo.isEmpty() || idEmpleado.isEmpty()) {
            showAlert("Error", "Todos los campos son obligatorios.");
            return;
        }
        Empleado empleado = new Empleado(nombre, apellido, correo, telefono, idEmpleado, correo, idEmpleado, false);
        if (administradorController.registrarEmpleado(empleado)) {
            tableViewEmpleado.setItems(FXCollections.observableArrayList(administradorController.obtenerListaEmpleados()));
            showAlert("Empleado Registrado", "El empleado ha sido registrado correctamente");
        } else {
            showAlert("Error", "No se pudo registrar el empleado");
        }
    }

    // Método para actualizar empleado

    @FXML
    public void actualizarEmpleado() {
        String nombre = textFieldNombreEmpleado.getText();
        String apellido = textFieldApellidoEmpleado.getText();
        String telefono = textFieldTelefonoEmpleado.getText();
        String correo = textFieldCorreoEmpleado.getText();
        String idEmpleado = textFieldIdEmpleado.getText();

        if (idEmpleado.isEmpty()) {
            showAlert("Error", "El id está vacío");
            return;
        }

        Empleado empleadoExistente = null;
        for (Empleado empleado : administradorController.obtenerListaEmpleados()) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                empleadoExistente = empleado;
                break;
            }
        }

        if (empleadoExistente != null) {
            empleadoExistente.setNombre(nombre);
            empleadoExistente.setApellido(apellido);
            empleadoExistente.setTelefono(telefono);
            empleadoExistente.setCorreo(correo);

            showAlert("Empleado actualizado", "El empleado ha sido actualizado correctamente");
            tableViewEmpleado.refresh(); // Refresca para asegurar la visualización
        } else {
            showAlert("Error", "No se encontró un empleado con ese id");
        }
    }

    // Método para bloquear o desbloquear al empleado
    @FXML
    public void bloquearEmpleado() {
        String idEmpleado = textFieldIdEmpleado.getText(); // Obtener el id del campo de texto

        if (idEmpleado.isEmpty()) {
            showAlert("Error", "El ID del empleado no puede estar vacío.");
            return;
        }

        boolean encontrado = false;
        for (Empleado empleado : administradorController.obtenerListaEmpleados()) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                encontrado = true;
                if (empleado.isBlocked()) {
                    showAlert("Error", "El empleado ya está bloqueado.");
                } else {
                    // Bloquear al empleado
                    empleado.setBlocked(true);
                    showAlert("Empleado Bloqueado", "El empleado ha sido bloqueado exitosamente.");
                    // Actualizar la interfaz de usuario (ej. la tabla)
                    tableViewEmpleado.setItems(FXCollections.observableArrayList(administradorController.obtenerListaEmpleados()));
                    tableViewEmpleado.refresh();
                }
                break;
            }
        }

        if (!encontrado) {
            showAlert("Error", "Empleado no encontrado.");
        }
    }

    // Método para limpiar campos
    @FXML
    private void limpiarCampos() {
        textFieldNombreEmpleado.clear();
        textFieldApellidoEmpleado.clear();
        textFieldTelefonoEmpleado.clear();
        textFieldCorreoEmpleado.clear();
        textFieldIdEmpleado.clear();
    }

    // Método para mostrar alertas
    private void showAlert(String titulo, String contenido) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle(titulo);
        alerta.setContentText(contenido);
        alerta.showAndWait();
    }
}