package com.pentavirato.calendarioModule.modelo;

public class Estadio {
    private String nombre;
    private String direccion;
    private Boolean pagado;

    public Estadio(String nombre, String direccion, Boolean pagado) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pagado = pagado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Boolean getPagado() {
        return pagado;
    }

    public void setPagado(Boolean pagado) {
        this.pagado = pagado;
    }
}
