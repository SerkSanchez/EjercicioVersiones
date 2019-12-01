package com.sergio.t3_spinner.utils;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Persona implements Serializable {
    String nombre, apellido;
    int edad;
    boolean dispo;

    public Persona(String nombre, String apellido, int edad, boolean dispo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dispo = dispo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    @NonNull
    @Override
    public String toString() {
        return getNombre();
    }
}
