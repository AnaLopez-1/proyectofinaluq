package co.edu.uniquindio.poo.model;

import java.util.Scanner;

public abstract class Vehiculo {
    private String marca;
    private boolean esNuevo;
    private int modelo;
    private String cambios;
    private int velocidadMaxima;
    private String cilindraje;
    private String combustible;
    private String transmision;
    private boolean revisionTecnica;
  
    public Vehiculo (String marca, boolean esNuevo, int modelo, String cambios, int velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica){
        this.marca=marca;
        this.esNuevo=esNuevo;
        this.modelo=modelo;
        this.cambios=cambios;
        this.velocidadMaxima=velocidadMaxima;
        this.cilindraje=cilindraje;
        this.combustible=combustible;
        this.transmision=transmision;
        this.revisionTecnica=revisionTecnica;
    }
    
    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }


    public String getTransmision() {
        return transmision;
    }


    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getEsNuevo() {
        return modelo;
    }
    
    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public int getModelo() {
        return modelo;
    }

    public int isModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(String cilindraje) {
        this.cilindraje = cilindraje;
    }

    public boolean isRevisionTecnica() {
        return revisionTecnica;
    }

    public void setRevisionTecnica(boolean revisionTecnica) {
        this.revisionTecnica = revisionTecnica;
    }

    // Método para realizar revisión técnica
    public boolean realizarRevisionTecnica() {
        // Simulamos alguna validación técnica del vehículo
        if (esNuevo) {
            System.out.println("El vehículo " + marca + " " + modelo + " es nuevo y no requiere revisión técnica.");
            revisionTecnica = true;
        } else {
            System.out.println("Revisando el vehículo usado " + marca + " " + modelo + "...");
            // Simulación de revisión: se pasa la revisión técnica
            revisionTecnica = true; // En una aplicación real esto dependería de varias condiciones
        }
        return revisionTecnica;
        }

    public abstract void mostrarAtributosEspecificos();

    @Override
    public String toString() {
        return "marca:" + marca + "\n"+ 
        "esNuevo:" + esNuevo + "\n"+
        "modelo:" + modelo + "\n"+
        "cambios:" + cambios + "\n"+
        "velocidadMaxima:" + velocidadMaxima + "\n"+
        "cilindraje:" + cilindraje + "\n" +
        "combustible:" + combustible + "\n" +
        "transmision" + transmision;
    }

    public static int ingresarEntero(String mensaje){
        Scanner scanner= new Scanner(System.in);
        System.out.println(mensaje);
        return scanner.nextInt();
    }
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}