package co.edu.uniquindio.poo.model;

public class Sedan extends Vehiculo {
    private String numeroPasajeros;
    private String numeroPuertas;
    private String capacidadMaletero;
    private boolean tieneONoAireAcondicionado;
    private boolean tieneONoCamaraReversa;
    private boolean tieneONoVelocidadCrucero;
    private String numeroBolsasDeAire;
    private boolean tieneONoAbs;
    private boolean tieneONoSensoresColision;
    private boolean tieneONoSensorDeTrafico;
    private boolean tieneONoAsistenteDePermanencia;

    public Sedan (String marca, boolean esNuevo, String modelo, String cambios, String velocidadMaxima, String cilindraje, TipoCombustible tipoCombustible, String transmision, boolean revisionTecnica, String numeroPasajeros, String numeroPuertas, String capacidadMaletero, boolean tieneONoAireAcondicionado, boolean tieneONoCamaraReversa, boolean tieneONoVelocidadCrucero, String numeroBolsasDeAire, boolean tieneONoAbs, boolean tieneONoSensoresColision, boolean tieneONoSensorDeTrafico, boolean tieneONoAsistenteDePermanencia){
        super(marca, esNuevo, modelo, cambios, velocidadMaxima, cilindraje, tipoCombustible, transmision, revisionTecnica);
        this.numeroPasajeros=numeroPasajeros;
        this.numeroPuertas=numeroPuertas;
        this.capacidadMaletero=capacidadMaletero;
        this.tieneONoAireAcondicionado=tieneONoAireAcondicionado;
        this.tieneONoCamaraReversa=tieneONoCamaraReversa;
        this.tieneONoVelocidadCrucero=tieneONoVelocidadCrucero;
        this.numeroBolsasDeAire=numeroBolsasDeAire;
        this.tieneONoAbs=tieneONoAbs;
        this.tieneONoSensoresColision=tieneONoSensoresColision;
        this.tieneONoSensorDeTrafico=tieneONoSensorDeTrafico;
        this.tieneONoAsistenteDePermanencia=tieneONoAsistenteDePermanencia;
        setTipo("Sedan");
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

    public String isNumeroBolsasDeAire() {
        return numeroBolsasDeAire;
    }

    public void setNumeroBolsasDeAire(String numeroBolsasDeAire) {
        this.numeroBolsasDeAire = numeroBolsasDeAire;
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
}

