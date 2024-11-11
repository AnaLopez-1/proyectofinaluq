package co.edu.uniquindio.poo.controller;

import java.util.Collection;

import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Empleado;
import co.edu.uniquindio.poo.model.Vehiculo;

public class EmpleadoController {

    private Empleado empleado;

        public EmpleadoController(Empleado empleado) {
        this.empleado = empleado;
    }

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        return empleado.agregarVehiculo(vehiculo);
    }

    public Collection<Vehiculo> obtenerListaVehiculos() {
        return empleado.getVehiculosRegistrados();
    }

    public boolean eliminarVehiculo(String marca) {
       return empleado.eliminarVehiculo(marca);
    }

    public boolean actualizarVehiculo(String marca, Vehiculo vehiculo) {
       return empleado.actualizarVehiculo(marca, vehiculo);
    }

    public boolean agregarCliente(Cliente cliente) {
        return empleado.agregarCliente(cliente);
    }

    public Collection<Cliente> obtenerListaClientes() {
        return empleado.getClientesRegistrados();
    }

    public boolean eliminarCliente(String cedula) {
       return empleado.eliminarCliente(cedula);
    }

    public boolean actualizarCliente(String cedula, Cliente cliente) {
       return empleado.actualizarCliente(cedula, cliente);
    }
}

    