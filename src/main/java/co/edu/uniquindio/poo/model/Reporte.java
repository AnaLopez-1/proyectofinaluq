package co.edu.uniquindio.poo.model;

import java.time.LocalDate;

public class Reporte {
      private String empledo;
    private LocalDate fecha;
    private String negocio;
    private String monto;

    public Reporte(String empleado, LocalDate fecha, String negocio, String monto) {
        this.empledo = empleado;
        this.fecha = fecha;
        this.negocio = negocio;
        this.monto = monto;
    }

    public String getNegocio() {
        return negocio;
    }

    public void setNegocio(String negocio) {
        this.negocio = negocio;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEmpledo() {
        return empledo;
    }

    public void setEmpledo(String empledo) {
        this.empledo = empledo;
    }
}