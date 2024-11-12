package co.edu.uniquindio.poo.model;

public class Sedan extends Vehiculo {
    private String numeroPasajeros;
    private String numeroPuertas;
    private String capacidadMaletero;
    private boolean tieneONoAireAcondicionado;
    private boolean tieneONoCamaraReversa;
    private boolean tieneONoVelocidadCrucero;
    private boolean numeroBolsasAire;
    private boolean tieneONoAbs;
    private boolean tieneONoSensoresColision;
    private boolean tieneONoSensorDeTrafico;
    private boolean tieneONoAsistenteDePermanencia;

    public Sedan (String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, String combustible, String transmision, boolean revisionTecnica, String numeroPasajeros, String numeroPuertas, String capacidadMaletero, boolean tieneONoAireAcondicionado, boolean tieneONoCamaraReversa, boolean tieneONoVelocidadCrucero, boolean numeroBolsasAire, boolean tieneONoAbs, boolean tieneONoSensoresColision, boolean tieneONoSensorDeTrafico, boolean tieneONoAsistenteDePermanencia){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, combustible, transmision, revisionTecnica);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadMaletero=capacidadMaletero;
        this.tieneONoAireAcondicionado=tieneONoAireAcondicionado;
        this.tieneONoCamaraReversa=tieneONoCamaraReversa;
        this.tieneONoVelocidadCrucero=tieneONoVelocidadCrucero;
        this.numeroBolsasAire=numeroBolsasAire;
        this.tieneONoAbs=tieneONoAbs;
        this.tieneONoSensoresColision=tieneONoSensoresColision;
        this.tieneONoSensorDeTrafico=tieneONoSensorDeTrafico;
        this.tieneONoAsistenteDePermanencia=tieneONoAsistenteDePermanencia;
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

    public boolean isTieneONoAireAcondicionado() {
        return tieneONoAireAcondicionado;
    }

    public void setTieneONoAireAcondicionado(boolean tieneONoAireAcondicionado) {
        this.tieneONoAireAcondicionado = tieneONoAireAcondicionado;
    }

    public boolean isTieneONoCamaraReversa() {
        return tieneONoCamaraReversa;
    }

    public void setTieneONoCamaraReversa(boolean tieneONoCamaraReversa) {
        this.tieneONoCamaraReversa = tieneONoCamaraReversa;
    }

    public boolean isTieneONoVelocidadCrucero() {
        return tieneONoVelocidadCrucero;
    }

    public void setTieneONoVelocidadCrucero(boolean tieneONoVelocidadCrucero) {
        this.tieneONoVelocidadCrucero = tieneONoVelocidadCrucero;
    }

    public boolean isNumeroBolsasAire() {
        return numeroBolsasAire;
    }

    public void setNumeroBolsasAire(boolean numeroBolsasAire) {
        this.numeroBolsasAire = numeroBolsasAire;
    }

    public boolean isTieneONoAbs() {
        return tieneONoAbs;
    }

    public void setTieneONoAbs(boolean tieneONoAbs) {
        this.tieneONoAbs = tieneONoAbs;
    }

    public boolean isTieneONoSensoresColision() {
        return tieneONoSensoresColision;
    }

    public void setTieneONoSensoresColision(boolean tieneONoSensoresColision) {
        this.tieneONoSensoresColision = tieneONoSensoresColision;
    }

    public boolean isTieneONoSensorDeTrafico() {
        return tieneONoSensorDeTrafico;
    }

    public void setTieneONoSensorDeTrafico(boolean tieneONoSensorDeTrafico) {
        this.tieneONoSensorDeTrafico = tieneONoSensorDeTrafico;
    }

    public boolean isTieneONoAsistenteDePermanencia() {
        return tieneONoAsistenteDePermanencia;
    }

    public void setTieneONoAsistenteDePermanencia(boolean tieneONoAsistenteDePermanencia) {
        this.tieneONoAsistenteDePermanencia = tieneONoAsistenteDePermanencia;
    }

    @Override
    public void mostrarAtributosEspecificos() {
        // Aquí defines cómo mostrar los atributos específicos de un Auto
        System.out.println("Número de pasajeros: " + numeroPasajeros);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Capacidad del maletero: " + capacidadMaletero);
        System.out.println("Numero bolsas de aire: " + tieneONoAireAcondicionado);
        System.out.println("Numero bolsas de aire: " + tieneONoCamaraReversa);
        System.out.println("Numero bolsas de aire: " + tieneONoVelocidadCrucero);
        System.out.println("Numero bolsas de aire: " + numeroBolsasAire);
        System.out.println("Numero bolsas de aire: " + tieneONoAbs);
        System.out.println("Numero bolsas de aire: " + tieneONoSensoresColision);
        System.out.println("Numero bolsas de aire: " + tieneONoSensorDeTrafico);
        System.out.println("Numero bolsas de aire: " + tieneONoAsistenteDePermanencia);
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + 
            "numeroPasajeros:" + numeroPasajeros + "\n" +
            "numeroPuertas:" + numeroPuertas + "\n" +
            "capacidadMaletero:" + capacidadMaletero + "\n" +
            "tieneONoAireAcondicionado:" + tieneONoAireAcondicionado + "\n" +
            "tieneONoCamaraReversa:" + tieneONoCamaraReversa + "\n" +
            "tieneONoVelocidadCrucero:" + tieneONoVelocidadCrucero + "\n" +
            "numeroBolsasAire:" + numeroBolsasAire + "\n" +
            "tieneONoAbs=" + tieneONoAbs + "\n" +
            "tieneONoSensoresColision:" + tieneONoSensoresColision + "\n" +
            "tieneONoSensorDeTrafico:" + tieneONoSensorDeTrafico + "\n" +
            "tieneONoAsistenteDePermanencia:" + tieneONoAsistenteDePermanencia;
    }
}

