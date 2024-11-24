package com.pentavirato.calendarioModule.modelo;

import java.util.Date;

public class Partido {
    private ESTADO_PARTIDO estado;
    private Date fecha;
    private Integer marcadorLocal;
    private Integer marcadorVisitante;

    public Partido (ESTADO_PARTIDO estado, Date fecha, Integer marcadorLocal, Integer marcadorVisitante) {
        this.estado = estado;
        this.fecha = fecha;
        this.marcadorLocal = marcadorLocal;
        this.marcadorVisitante = marcadorVisitante;
    }

    public Integer getMarcadorVisitante() {
        return marcadorVisitante;
    }

    public void setMarcadorVisitante(Integer marcadorVisitante) {
        this.marcadorVisitante = marcadorVisitante;
    }

    public Integer getMarcadorLocal() {
        return marcadorLocal;
    }

    public void setMarcadorLocal(Integer marcadorLocal) {
        this.marcadorLocal = marcadorLocal;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ESTADO_PARTIDO getEstado() {
        return estado;
    }

    public void setEstado(ESTADO_PARTIDO estado) {
        this.estado = estado;
    }
}
