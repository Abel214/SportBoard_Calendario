package com.pentavirato.calendarioModule.modelo;

import java.util.ArrayList;
import java.util.Date;

public class Sorteo {
    private String nombre;
    private Date fechaInicio;
    private Integer nroIntegrantes;
    private ArrayList<Partido> listaPartidos;

    public Sorteo(String nombre, Date fechaInicio, Integer nroIntegrantes) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.nroIntegrantes = nroIntegrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Integer getNroIntegrantes() {
        return nroIntegrantes;
    }

    public void setNroIntegrantes(Integer nroIntegrantes) {
        this.nroIntegrantes = nroIntegrantes;
    }
}
