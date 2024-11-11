package co.edu.uniquindio.poo.model;

public class Pick_Ups extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private String capacidadCajaDeCarga;
    private int numeroBolsasDeAire;

    public Pick_Ups (String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica, int numeroPasajeros, int numeroPuertas, String capacidadCajaDeCarga, int numeroBolsasDeAire){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadCajaDeCarga=capacidadCajaDeCarga;
        this.numeroBolsasDeAire=numeroBolsasDeAire;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getCapacidadCajaDeCarga() {
        return capacidadCajaDeCarga;
    }

    public void setCapacidadCajaDeCarga(String capacidadCajaDeCarga) {
        this.capacidadCajaDeCarga = capacidadCajaDeCarga;
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    @Override
    public void mostrarAtributosEspecificos() {
        System.out.println("Número de pasajeros: " + numeroPasajeros);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Capacidad del maletero: " + capacidadCajaDeCarga);
        System.out.println("Numero bolsas de aire: " + numeroBolsasDeAire);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
            "numeroPasajeros:" + numeroPasajeros + "\n" +
            "numeroPuertas:" + numeroPuertas + "\n" +
            "capacidadCajaDeCarga:" + capacidadCajaDeCarga + "\n" +
            "numeroBolsasDeAire:" + numeroBolsasDeAire;
    }

}

