package com.itfactory;

import com.itfactory.componente.MemorieSSD;
import com.itfactory.componente.Ram;
import com.itfactory.electronice.Laptop;

public class Main {

    public static void main(String[] args) {
        Laptop laptopAsus = new Laptop("Asus", "Negru", 15.6);
        Ram memorieRam = new Ram("DDR3", "GB", 16);
        MemorieSSD spatiuDeStocare = new MemorieSSD(256, "GB");

        System.out.println("Detalii laptop:");
        System.out.println("\tMarca: "+ laptopAsus.getMarca());
        System.out.println("\tCuloare: "+ laptopAsus.getCuloare());
        System.out.println("\tDimensiune ecran: : "+ laptopAsus.getDimensiuneEcran()+ "\n");

        System.out.println("Memorie RAM:");
        System.out.println("\tTip memorie RAM: "+ memorieRam.getTipMemorie());
        System.out.println("\tUnitate de Masura Memorie RAM: "+ memorieRam.getUnitateMasura());
        System.out.println("\tCapacitate memorie RAM: "+ memorieRam.getCapacitateMemorie()+ "\n");

        System.out.println("Spatiu de stocare SSD:");
        System.out.println("\tCapacitate stocare SSD: "+ spatiuDeStocare.getCapacitateStocare());
        System.out.println("\tUnitate de masura stocare SSD: "+ spatiuDeStocare.getUnitateMasura());

    }
}
