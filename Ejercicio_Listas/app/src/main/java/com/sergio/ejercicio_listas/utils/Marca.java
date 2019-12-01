package com.sergio.ejercicio_listas.utils;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Marca implements Serializable {

    String modelo;
    int logo;

    @NonNull
    @Override
    public String toString() {
        return getModelo();
    }

    public String getModelo() {
        return modelo;
    }

    public int getLogo() {
        return logo;
    }

    public Marca(String modelo, int logo) {
        this.modelo = modelo;
        this.logo = logo;
    }
}
