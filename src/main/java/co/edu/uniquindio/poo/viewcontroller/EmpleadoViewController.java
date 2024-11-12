package co.edu.uniquindio.poo.viewcontroller;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.collections.FXCollections;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Moto;
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


    @FXML
    private TableView<Vehiculo> tableViewVehiculos;
    @FXML
    private TableView<Cliente> tableViewClientes;
    @FXML
    private TextField textFieldMarcaVehiculo;
    @FXML
    private TextField textFieldModeloVehiculo;
    @FXML
    private TextField textFieldVelocidadVehiculo;
    @FXML
    private TextField textFieldCilindrajeVehiculo;
    @FXML
    private TextField textFieldCombustibleVehiculo;
    @FXML
    private TextField textFieldTransmisionVehiculo;
    @FXML
    private CheckBox checkBoxEsNuevo;
    @FXML
    private CheckBox checkBoxRevisionTecnica;
    @FXML
    private ComboBox<String> comboBoxTipoVehiculo;
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
    // Campos adicionales específicos para el tipo Bus
    @FXML
    private TextField textFieldNumeroPasajeros;
    @FXML
    private TextField textFieldNumeroPuertas;
    @FXML
    private TextField textFieldCapacidadMaletero;
    @FXML
    private TextField textFieldBolsasAire;

    public void initialize() {
        Empleado empleado = new Empleado("Juan", "Perez", "juan@example.com", "123456789", "E001", "3000", "password123");
        empleadoController = new EmpleadoController(empleado);
    
        // Inicializar ComboBox con los tipos de vehículos
        comboBoxTipoVehiculo.setItems(FXCollections.observableArrayList("Moto", "Bus"));
    
        // Cargar datos iniciales en las tablas
        tableViewVehiculos.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaVehiculos()));
        tableViewClientes.setItems(FXCollections.observableArrayList(empleadoController.obtenerListaClientes()));

        // Agregar listeners para seleccionar vehículo y cliente
        tableViewVehiculos.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
            vehiculoSeleccionado = newValue;
        });

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
    public void agregarVehiculo() {
        try {
            String marca = textFieldMarcaVehiculo.getText().trim();
            String modelo = textFieldModeloVehiculo.getText().trim();
            String velocidadMaxima = textFieldVelocidadVehiculo.getText().trim();
            String cilindraje = textFieldCilindrajeVehiculo.getText().trim();
            String combustible = textFieldCombustibleVehiculo.getText().trim();
            String transmision = textFieldTransmisionVehiculo.getText().trim();
            boolean esNuevo = checkBoxEsNuevo.isSelected();
            boolean revisionTecnica = checkBoxRevisionTecnica.isSelected();
            String tipoSeleccionado = comboBoxTipoVehiculo.getValue();

            Vehiculo nuevoVehiculo;
            switch (tipoSeleccionado) {
                case "Moto":
                    nuevoVehiculo = new Moto(marca, esNuevo, modelo, "Manual", velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
                    break;
                case "Bus":
                    String numeroPasajeros = textFieldNumeroPasajeros.getText().trim();
                    String numeroPuertas = textFieldNumeroPuertas.getText().trim();
                    String capacidadMaletero = textFieldCapacidadMaletero.getText().trim();
                    String numeroBolsasDeAire = textFieldBolsasAire.getText().trim();
                    nuevoVehiculo = new Bus(marca, esNuevo, modelo, "Manual", velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica, numeroPasajeros, numeroPuertas, capacidadMaletero, numeroBolsasDeAire);
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
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setContentText(message);
        alert.showAndWait();
    }
}