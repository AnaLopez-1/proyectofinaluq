package co.edu.uniquindio.poo.model;

public abstract class Vehiculo {
    private String marca;
    private boolean esNuevo;
    private String modelo;
    private String cambios;
    private String velocidadMaxima;
    private String cilindraje;
    private String combustible;
    private String transmision;
    private boolean revisionTecnica;
    private String tipo;
  
    public Vehiculo (String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica){
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

    public String getEsNuevo() {
        return modelo;
    }
    
    public boolean isEsNuevo() {
        return esNuevo;
    }

    public void setEsNuevo(boolean esNuevo) {
        this.esNuevo = esNuevo;
    }

    public String getModelo() {
        return modelo;
    }

    public String isModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    public String getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(String velocidadMaxima) {
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
    
    public static void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
}