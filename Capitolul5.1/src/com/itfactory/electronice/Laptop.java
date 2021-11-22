package com.itfactory.electronice;


import com.itfactory.componente.MemorieSSD;
import com.itfactory.componente.Ram;

public class Laptop {
    private String marca;
    private String culoare;
    private double dimensiuneEcran;
    private Ram memorieRam;
    private MemorieSSD memorieSSD;

    public Laptop(String marca, String culoare, double dimensiuneEcran) {
        this.marca = marca;
        this.culoare = culoare;
        this.dimensiuneEcran = dimensiuneEcran;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getDimensiuneEcran() {
        return dimensiuneEcran;
    }

    public void setDimensiuneEcran(double dimensiuneEcran) {
        this.dimensiuneEcran = dimensiuneEcran;
    }
}
