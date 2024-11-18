package co.edu.uniquindio.poo.model;

public class Transaccion {
    private Empleado empleado;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private String tipoTransaccion; // Puede ser "Venta", "Alquiler" o "Compra"
    private String fecha;

    // Constructor
    public Transaccion(Empleado empleado, Cliente cliente, Vehiculo vehiculo, String tipoTransaccion, String fecha){
        this.empleado = empleado;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.tipoTransaccion = tipoTransaccion;
        this.fecha=fecha; // La fecha de la transacción es el momento en que se crea
    }
    
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public String getTipoTransaccion() {
        return tipoTransaccion;
    }

    public void setTipoTransaccion(String tipoTransaccion) {
        this.tipoTransaccion = tipoTransaccion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Transaccion [empleado=" + empleado + ", cliente=" + cliente + ", vehiculo=" + vehiculo
                + ", tipoTransaccion=" + tipoTransaccion + ", fecha=" + fecha + "]";
    }
}

