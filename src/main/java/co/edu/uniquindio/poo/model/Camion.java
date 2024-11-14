package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo{
    private String capacidadDeCarga;
    private String numeroEjes;

    public Camion(String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica, String capacidadDeCarga, String numeroEjes){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        this.capacidadDeCarga=capacidadDeCarga;
        this.numeroEjes=numeroEjes;
        setTipo("Camion");
    }

    public String getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(String capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public String getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(String numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public void mostrarAtributosEspecificos() {
        System.out.println("Capacidad del maletero: " + capacidadDeCarga);
        System.out.println("Numero bolsas de aire: " + numeroEjes);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
            "capacidadDeCarga:" + capacidadDeCarga + "\n" +
            "numeroEjes:" + numeroEjes;
    }
}

