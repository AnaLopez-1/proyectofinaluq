package co.edu.uniquindio.poo.model;

public class Pick_Ups extends Vehiculo{
    private String numeroPasajeros;
    private String numeroPuertas;
    private String capacidadCajaDeCarga;
    private String numeroBolsasDeAire;

    public Pick_Ups (String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, TipoCombustible tipoCombustible, String transmision, boolean revisionTecnica, String numeroPasajeros, String numeroPuertas, String capacidadCajaDeCarga, String numeroBolsasDeAire){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, revisionTecnica);
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
}

