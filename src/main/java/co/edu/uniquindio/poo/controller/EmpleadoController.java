package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;

public class EmpleadoController {

    private Empleado empleado;

    // Constructor que recibe un empleado
    public EmpleadoController(Empleado empleado) {
        this.empleado = empleado;
    }

    // Método para agregar un vehículo
    public boolean agregarVehiculo(Vehiculo vehiculo) {
        return empleado.agregarVehiculo(vehiculo);
    }

    // Método para obtener la lista de vehículos registrados
    public Collection<Vehiculo> obtenerListaVehiculos() {
        return empleado.getVehiculosRegistrados();
    }

    // Método para eliminar un vehículo
    public boolean eliminarVehiculo(String marca) {
        return empleado.eliminarVehiculo(marca);
    }

    // Método para actualizar un vehículo
    public boolean actualizarVehiculo(String marca, Vehiculo vehiculo) {
        return empleado.actualizarVehiculo(marca, vehiculo);
    }

    // Método para agregar un cliente
    public boolean agregarCliente(Cliente cliente) {
        return empleado.agregarCliente(cliente);
    }

    // Método para obtener la lista de clientes registrados
    public Collection<Cliente> obtenerListaClientes() {
        return empleado.getClientesRegistrados();
    }

    // Método para eliminar un cliente
    public boolean eliminarCliente(String cedula) {
        return empleado.eliminarCliente(cedula);
    }

    // Método para actualizar un cliente
    public boolean actualizarCliente(String cedula, Cliente cliente) {
        return empleado.actualizarCliente(cedula, cliente);
    }

    public Collection<Transaccion> obtenerListaTransaccions() {
        return empleado.getTransaccionesRegistradas();
    }

    
}
