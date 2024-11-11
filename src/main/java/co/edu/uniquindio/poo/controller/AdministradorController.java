package co.edu.uniquindio.poo.controller;

import java.time.LocalDate;
import java.util.List;

import co.edu.uniquindio.poo.model.Empleado;

public class AdministradorController {
    private final Empleado empleado;
    private final Reporte reporte;
    private final AuthUtil authUtil;

    public AdministradorController() {
        this.empleado = new Empleado();
        this.reporte = new Reporte();
        this.authUtil = new AuthUtil();
    }

    // **1. Gestion de Empleados**

    public void registrarEmpleado(Empleado empleado) throws AdminException {
        try {
            empleado.registrarEmpleado(empleado);
        } catch (Exception e) {
            throw new AdminException("Error al registrar empleado", e);
        }
    }

    public void actualizarEmpleado(Empleado empleado) throws AdminException {
        try {
            empleadoService.actualizarEmpleado(empleado);
        } catch (Exception e) {
            throw new AdminException("Error al actualizar los datos del empleado", e);
        }
    }

    public void bloquearEmpleado(String empleadoId) throws AdminException {
        try {
            empleadoService.bloquearEmpleado(empleadoId);
        } catch (Exception e) {
            throw new AdminException("Error al bloquear la cuenta del empleado", e);
        }
    }

    // **2. Generar Reportes**
    
    public List<Reporte> generarReporte(LocalDate fechaInicio, LocalDate fechaFin) throws AdminException {
        try {
            return reporteService.obtenerReportes(fechaInicio, fechaFin);
        } catch (Exception e) {
            throw new AdminException("Error al generar reporte", e);
        }
    }

    // **3. Gestión de Credenciales y Recuperación de Contraseña**
    
    public boolean autenticarAdmin(String username, String password) throws AdminException {
        try {
            return authUtil.autenticar(username, password);
        } catch (Exception e) {
            throw new AdminException("Error de autenticación", e);
        }
    }

    public boolean recuperarClave(String username, String respuestaSeguridad) throws AdminException {
        try {
            return authUtil.verificarRespuestaSeguridad(username, respuestaSeguridad);
        } catch (Exception e) {
            throw new AdminException("Error al recuperar la clave", e);
        }
    }
}
}
