package co.edu.uniquindio.poo.model;

public class Bus extends Vehiculo{
    private String numeroPasajeros;
    private String numeroPuertas;
    private String capacidadMaletero;
    private String numeroBolsasDeAire;

    public Bus (String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica, String numeroPasajeros, String numeroPuertas, String capacidadMaletero, String numeroBolsasDeAire){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadMaletero=capacidadMaletero;
        this.numeroBolsasDeAire=numeroBolsasDeAire;
        setTipo("Bus");
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

    public String getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(String capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public String getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(String numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }   

}

