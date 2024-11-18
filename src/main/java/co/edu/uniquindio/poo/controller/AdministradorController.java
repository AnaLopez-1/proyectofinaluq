package co.edu.uniquindio.poo.controller;

import java.util.ArrayList;
import java.util.Collection;
import java.time.LocalDate;
import java.util.List;

import co.edu.uniquindio.poo.Exceptions.EmpleadoNoEncontradoException;
import co.edu.uniquindio.poo.Exceptions.RangoFechaInvalidoException;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Empleado;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;


public class AdministradorController {

    private ObservableList<Empleado> obtenerListaEmpleados;
        private Administrador administrador;

    public AdministradorController(Administrador administrador){
        this.administrador=administrador;
        this.obtenerListaEmpleados = FXCollections.observableArrayList();
    }

    // Método para registrar un empleado
    public boolean registrarEmpleado(Empleado empleado) {
        return obtenerListaEmpleados.add(empleado);
    }

    // Método para obtener la lista de empleados
    public Collection<Empleado> obtenerListaEmpleados() {
        return obtenerListaEmpleados;
    }

    // Método para eliminar un empleado
    public boolean bloquearEmpleado(String idEmpleado) {
        return administrador.bloquearEmpleado(idEmpleado);
    }

    // Método para actualizar un empleado
    public boolean actualizarEmpleado(String idEmpleado, Empleado empleado) {
        return administrador.actualizarEmpleado(idEmpleado, empleado);
    }

    // Método para validar rango de fechas
    private void validarRangoFechas(LocalDate fechaInicio, LocalDate fechaFin) throws RangoFechaInvalidoException {
        if (fechaInicio.isAfter(fechaFin)) {
            throw new RangoFechaInvalidoException("La fecha de inicio no puede ser posterior a la fecha de fin.");
        }
    }

    // Método para buscar un empleado
    private Empleado buscarEmpleado(String idEmpleado) throws EmpleadoNoEncontradoException {
        for (Empleado empleado : obtenerListaEmpleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                return empleado;
            }
        }
        throw new EmpleadoNoEncontradoException("Empleado con ID " + idEmpleado + " no encontrado.");
    }

        // Método para generar reporte 
        public boolean generarReporte(Empleado empleado) {
            return obtenerListaEmpleados.add(empleado);
        
        }
}
