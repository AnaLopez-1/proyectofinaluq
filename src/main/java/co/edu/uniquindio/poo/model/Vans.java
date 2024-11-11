package co.edu.uniquindio.poo.model;

public class Vans extends Vehiculo{
    private int numeroPasajeros;
    private int numeroPuertas;
    private String capacidadMaletero;
    private int numeroBolsasDeAire;

    public Vans (String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica, int numeroPasajeros, int numeroPuertas, String capacidadMaletero, int numeroBolsasDeAire){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadMaletero=capacidadMaletero;
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

    public String getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(String capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    public int getNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(int numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
    }

    @Override
    public void mostrarAtributosEspecificos() {
        // Aquí defines cómo mostrar los atributos específicos de un Auto
        System.out.println("Número de pasajeros: " + numeroPasajeros);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Capacidad del maletero: " + capacidadMaletero);
        System.out.println("Numero bolsas de aire: " + numeroBolsasDeAire);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
                "numeroPasajeros:" + numeroPasajeros + "\n" +
                "numeroPuertas:" + numeroPuertas + "\n" +
                "capacidadMaletero:"+ capacidadMaletero + "\n" +
                "numeroBolsasDeAire:" + numeroBolsasDeAire;
    } 
}
