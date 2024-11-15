package co.edu.uniquindio.poo.model;

public class Moto extends Vehiculo{
    public Moto (String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        setTipo("Moto");
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +  
            "marca=" + getMarca() + "\n" +
            "esNuevo=" + getEsNuevo() + "\n" +
            "modelo=" + getModelo() + "\n" +
            "cambios=" + getCambios() + "\n" +
            "velocidadMaxima=" + getVelocidadMaxima() + "\n" +
            "cilindraje=" + getCilindraje();
    }
}
