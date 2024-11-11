package co.edu.uniquindio.poo.model;

public class Cliente extends Persona{
    private String cedula;
    private String direccion;
    
    public Cliente(String nombre, String apellido, String correo, String telefono, String cedula, String direccion){
        super(nombre, apellido, correo, telefono);
        this.cedula=cedula;
        this.direccion=direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente [cedula=" + cedula + ", direccion=" + direccion;
    }
}

