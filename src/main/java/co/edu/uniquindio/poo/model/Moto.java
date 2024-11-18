package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo{
    public Moto (String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        setTipo("Moto");
    }
}
