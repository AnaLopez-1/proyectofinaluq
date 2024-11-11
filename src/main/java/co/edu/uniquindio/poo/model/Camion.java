package co.edu.uniquindio.poo.model;

public class Camion extends Vehiculo{
    private String capacidadDeCarga;
    private int numeroEjes;

    public Camion(String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica, String capacidadDeCarga, int numeroEjes){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        this.capacidadDeCarga=capacidadDeCarga;
        this.numeroEjes=numeroEjes;
    }

    public String getCapacidadDeCarga() {
        return capacidadDeCarga;
    }

    public void setCapacidadDeCarga(String capacidadDeCarga) {
        this.capacidadDeCarga = capacidadDeCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
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

