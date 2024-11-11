package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;
import java.util.List;
import co.edu.uniquindio.poo.exceptions.TransaccionException;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.TipoTransaccion;
import co.edu.uniquindio.poo.service.TransaccionService;

public class TransaccionController {

    private final Transaccion transaccion;

    public TransaccionController() {
        this.transaccion = new Transaccion();
    }

    // **1. Registrar Nueva Transacción**
    public void registrarTransaccion(Transaccion transaccion) throws TransaccionException {
        try {
            transaccion.registrarTransaccion(transaccion);
        } catch (Exception e) {
            throw new TransaccionException("Error al registrar la transacción", e);
        }
    }

    // **2. Obtener Transacciones por Cliente**
    public List<Transaccion> obtenerTransaccionesPorCliente(String clienteId) throws TransaccionException {
        try {
            return transaccion.obtenerTransaccionesPorCliente(clienteId);
        } catch (Exception e) {
            throw new TransaccionException("Error al obtener las transacciones del cliente", e);
        }
    }

    // **3. Obtener Transacciones por Empleado**
    public List<Transaccion> obtenerTransaccionesPorEmpleado(String empleadoId) throws TransaccionException {
        try {
            return transaccion.obtenerTransaccionesPorEmpleado(empleadoId);
        } catch (Exception e) {
            throw new TransaccionException("Error al obtener las transacciones del empleado", e);
        }
    }

    // **4. Obtener Detalle de una Transacción Específica**
    public Transaccion obtenerDetalleTransaccion(String transaccionId) throws TransaccionException {
        try {
            return transaccion.obtenerDetalleTransaccion(transaccionId);
        } catch (Exception e) {
            throw new TransaccionException("Error al obtener el detalle de la transacción", e);
        }
    }

    // **5. Obtener Transacciones por Tipo y Fecha**
    public List<Transaccion> obtenerTransaccionesPorTipoYFecha(TipoTransaccion tipo, LocalDate fechaInicio, LocalDate fechaFin) throws TransaccionException {
        try {
            return transaccion.obtenerTransaccionesPorTipoYFecha(tipo, fechaInicio, fechaFin);
        } catch (Exception e) {
            throw new TransaccionException("Error al obtener las transacciones por tipo y fecha", e);
        }
    }
}