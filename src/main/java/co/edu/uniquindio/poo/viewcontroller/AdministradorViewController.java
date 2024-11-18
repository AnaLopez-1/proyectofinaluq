package co.edu.uniquindio.poo.viewcontroller;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import co.edu.uniquindio.poo.controller.AdministradorController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Empleado;
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

    @FXML
    void initialize() {

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