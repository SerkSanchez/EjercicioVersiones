package com.sergio.ejercicio_versiones.utils;

import java.io.Serializable;

public class Versiones implements Serializable {

    String nombre,descripcion;
    int logo,logoPrincipal,version,fecha;

    public Versiones(String nombre, String descripcion, int logo, int logoPrincipal, int version, int fecha) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.logo = logo;
        this.logoPrincipal = logoPrincipal;
        this.version = version;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public int getLogoPrincipal() {
        return logoPrincipal;
    }

    public void setLogoPrincipal(int logoPrincipal) {
        this.logoPrincipal = logoPrincipal;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
}