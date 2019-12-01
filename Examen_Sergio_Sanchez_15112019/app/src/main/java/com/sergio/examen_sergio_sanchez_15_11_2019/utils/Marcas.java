package com.sergio.examen_sergio_sanchez_15_11_2019.utils;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Marcas implements Serializable {
    String marca, modelo;
    int cv;

    public Marcas(String marca, String modelo, int cv) {
        this.marca = marca;
        this.modelo = modelo;
        this.cv = cv;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCv() {
        return cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @NonNull
    @Override
    public String toString() {
        return getMarca();
    }
}
