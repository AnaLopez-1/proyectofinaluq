package co.edu.uniquindio.poo.model;

public class Pick_Ups extends Vehiculo{
    private String numeroPasajeros;
    private String numeroPuertas;
    private String capacidadCajaDeCarga;
    private String numeroBolsasDeAire;

    public Pick_Ups (String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica, String numeroPasajeros, String numeroPuertas, String capacidadCajaDeCarga, String numeroBolsasDeAire){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadCajaDeCarga=capacidadCajaDeCarga;
        this.numeroBolsasDeAire=numeroBolsasDeAire;
        setTipo("Pick Ups");
    }

    public String getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(String numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public String getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(String numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public String getCapacidadCajaDeCarga() {
        return capacidadCajaDeCarga;
    }

    public void setCapacidadCajaDeCarga(String capacidadCajaDeCarga) {
        this.capacidadCajaDeCarga = capacidadCajaDeCarga;
    }

    public String getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(String numeroBolsasDeAire) {
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

