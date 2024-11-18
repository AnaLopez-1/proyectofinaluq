package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Administrador extends Persona {
    private String idAdministrador;
    private String salario;
    private String contraseña;
    private List<Empleado> obtenerListaEmpleados;

    public Administrador(String nombre, String apellido, String correo, String telefono, String idAdministrador, String salario, String contraseña){
        super(nombre, apellido, correo, telefono);
        this.idAdministrador = idAdministrador;
        this.salario = salario;
        this.contraseña = contraseña;
        this.obtenerListaEmpleados = new ArrayList<>();
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<Empleado> getObtenerListaEmpleados() {
        return obtenerListaEmpleados;
    }

    public void setObtenerListaEmpleados(List<Empleado> obtenerListaEmpleados) {
        this.obtenerListaEmpleados = obtenerListaEmpleados;
    }

    // Método para registrar un empleado
    public boolean registrarEmpleado(Empleado empleado) {
        boolean centinela = false;
        if (!verificarEmpleado(empleado.getIdEmpleado())) {
            obtenerListaEmpleados.add(empleado);
            centinela = true;
        }
        return centinela;
    }

    // Método para verificar si un empleado ya existe
    public boolean verificarEmpleado(String idEmpleado) {
        for (Empleado empleado : obtenerListaEmpleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                return true;
            }
        }
        return false;
    }

    // Método para actualizar un empleado
    public boolean actualizarEmpleado(String idEmpleado, Empleado actualizado) {
        for (Empleado empleado : obtenerListaEmpleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                empleado.setIdEmpleado(actualizado.getIdEmpleado());
                empleado.setNombre(actualizado.getNombre());
                empleado.setApellido(actualizado.getApellido());
                empleado.setCorreo(actualizado.getCorreo());
                empleado.setTelefono(actualizado.getTelefono());
                empleado.setSalario(actualizado.getSalario());
                empleado.setContraseña(actualizado.getContraseña());
                return true;
            }
        }
        return false;
    }

    public boolean bloquearEmpleado(String idEmpleado) {
        boolean centinela = false;
        for (Empleado empleado : obtenerListaEmpleados) {
            if (empleado.getIdEmpleado().equals(idEmpleado)) {
                if (!empleado.isBlocked()) {
                    empleado.setBlocked(true);  // Bloquea al empleado
                    centinela = true;
                }
                break;
            }
        }
        return centinela;
    }
}



