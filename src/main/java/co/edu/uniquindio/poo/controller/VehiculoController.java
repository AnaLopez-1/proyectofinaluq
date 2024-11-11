package co.edu.uniquindio.poo.controller;

import java.util.List;
import co.edu.uniquindio.poo.exceptions.VehiculoException;
import co.edu.uniquindio.poo.model.Vehiculo;

public class VehiculoController {

    private final Vehiculo vehiculo;

    public VehiculoController() {
        this.vehiculo = new Vehiculo();
    }

    // **1. Registrar Vehículo**
    public void registrarVehiculo(Vehiculo vehiculo) throws VehiculoException {
        try {
            vehiculo.registrarVehiculo(vehiculo);
        } catch (Exception e) {
            throw new VehiculoException("Error al registrar el vehículo", e);
        }
    }

    // **2. Actualizar Información del Vehículo**
    public void actualizarVehiculo(Vehiculo vehiculo) throws VehiculoException {
        try {
            vehiculo.actualizarVehiculo(vehiculo);
        } catch (Exception e) {
            throw new VehiculoException("Error al actualizar el vehículo", e);
        }
    }

    // **3. Eliminar Vehículo**
    public void eliminarVehiculo(String vehiculoId) throws VehiculoException {
        try {
            vehiculo.eliminarVehiculo(vehiculoId);
        } catch (Exception e) {
            throw new VehiculoException("Error al eliminar el vehículo", e);
        }
    }

    // **4. Obtener Vehículos Disponibles para Venta o Alquiler**
    public List<Vehiculo> obtenerVehiculosDisponibles() throws VehiculoException {
        try {
            return vehiculo.obtenerVehiculosDisponibles();
        } catch (Exception e) {
            throw new VehiculoException("Error al obtener la lista de vehículos disponibles", e);
        }
    }

    // **5. Realizar Revisión Técnica del Vehículo**
    public boolean pasarRevisionTecnica(String vehiculoId) throws VehiculoException {
        try {
            return vehiculo.pasarRevisionTecnica(vehiculoId);
        } catch (Exception e) {
            throw new VehiculoException("Error al realizar la revisión técnica del vehículo", e);
        }
    }

    // **6. Buscar Vehículo por ID**
    public Vehiculo buscarVehiculoPorId(String vehiculoId) throws VehiculoException {
        try {
            return vehiculo.buscarVehiculoPorId(vehiculoId);
        } catch (Exception e) {
            throw new VehiculoException("Error al buscar el vehículo", e);
        }
    }
}
