package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Empleado extends Persona {
    private String idEmpleado;
    private String salario;
    private String contraseña;
    private List<Vehiculo> vehiculosRegistrados;
    private List<Cliente> clientesRegistrados;
    private List<Transaccion> transaccionesRegistradas;

    public Empleado(String nombre, String apellido, String correo, String telefono, String idEmpleado, String salario, String contraseña){
        super(nombre, apellido, correo, telefono);
        this.idEmpleado=idEmpleado;
        this.salario=salario;
        this.contraseña=contraseña;
        this.vehiculosRegistrados= new ArrayList<>();
        this.clientesRegistrados= new ArrayList<>();
        this.transaccionesRegistradas= new ArrayList<>();
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public List<Vehiculo> getVehiculosRegistrados() {
        return vehiculosRegistrados;
    }

    public void setVehiculosRegistrados(List<Vehiculo> vehiculosRegistrados) {
        this.vehiculosRegistrados = vehiculosRegistrados;
    }

    public List<Cliente> getClientesRegistrados() {
        return clientesRegistrados;
    }

    public void setClientesRegistrados(List<Cliente> clientesRegistrados) {
        this.clientesRegistrados = clientesRegistrados;
    }

    public List<Transaccion> getTransaccionesRegistradas() {
        return transaccionesRegistradas;
    }

    public void setTransaccionesRegistradas(List<Transaccion> transaccionesRegistradas) {
        this.transaccionesRegistradas = transaccionesRegistradas;
    }

    

    //Método Clientes

    public boolean agregarCliente(Cliente cliente) {
        boolean centinela = false;
        if (!verificarCliente(cliente.getCedula())) {
            clientesRegistrados.add(cliente);
            centinela = true;
        }
        return centinela;
    }

    public boolean verificarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientesRegistrados) {
            if (cliente.getCedula().equals(cedula)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarCliente(String cedula) {
        boolean centinela = false;
        for (Cliente cliente : clientesRegistrados) {
            if (cliente.getCedula().equals(cedula)) {
                clientesRegistrados.remove(cliente);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarCliente(String cedula, Cliente actualizado) {
        boolean centinela = false;
        for (Cliente cliente : clientesRegistrados) {
            if (cliente.getCedula().equals(cedula)) {
                cliente.setCedula(actualizado.getCedula());
                cliente.setNombre(actualizado.getNombre());
                cliente.setApellido(actualizado.getApellido());
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    //Método Vehículos 

    public boolean agregarVehiculo(Vehiculo vehiculo) {
        boolean centinela = false;
        if (!verificarVehiculo(vehiculo.getMarca())) {
            vehiculosRegistrados.add(vehiculo);
            centinela = true;
        }
        return centinela;
    }

    public boolean verificarVehiculo(String marca) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculosRegistrados) {
            if (vehiculo.getMarca().equals(marca)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public boolean eliminarVehiculo(String marca) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculosRegistrados) {
            if (vehiculo.getMarca().equals(marca)) {
                vehiculosRegistrados.remove(vehiculo);
                centinela = true;
                break;
            }
        }
        return centinela;
    }

    public boolean actualizarVehiculo(String marca, Vehiculo actualizado) {
        boolean centinela = false;
        for (Vehiculo vehiculo : vehiculosRegistrados) {
            if (vehiculo.getMarca().equals(marca)) {
                vehiculo.setMarca(actualizado.getMarca());
                vehiculo.setModelo(actualizado.getModelo());
                centinela = true;
                break;
            }
        }
        return centinela;
    }
    

    //Método alquilar Vehículo 

    public void alquilarVehiculo(Cliente cliente, Vehiculo vehiculo, Transaccion transaccion){
        transaccionesRegistradas.add(transaccion);
        System.out.println("Vehiculo: " +vehiculo.getMarca() + " alquilado al cliente " + cliente.getNombre() + " por el empleado " + this.getNombre());
    }

    //Método vender Vehículo 

    public void venderVehiculo(Cliente cliente, Vehiculo vehiculo, Transaccion transaccion){
        transaccionesRegistradas.add(transaccion);
        System.out.println("Vehiculo: " +vehiculo.getMarca() + " vendido al cliente " + cliente.getNombre() + " por el empleado " + this.getNombre());
    }

    //Método comprar Vehículo 
    public void comprarVehiculo(Cliente cliente, Vehiculo vehiculo) {
        if (vehiculo.realizarRevisionTecnica()) {
            Transaccion transaccion = new Transaccion(null, cliente, vehiculo, idEmpleado, contraseña);
            transaccionesRegistradas.add(transaccion);
            System.out.println("Vehículo comprado: " + vehiculo.getModelo() + " a " + cliente.getNombre());
        } else {
            System.out.println("El vehículo " + vehiculo.getModelo() + " no pasó la revisión técnica y no puede ser comprado.");
        }
    }

    @Override
    public String toString(){
        return  super.toString() + "\n" + 
            "idEmpleado:" + idEmpleado + "\n" +
            "salario:" + salario + "\n" +
            "contraseña:" + contraseña;
    }

    public boolean regirstrarEmpleado(Empleado empleado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'regirstrarEmpleado'");
    }

    
}

