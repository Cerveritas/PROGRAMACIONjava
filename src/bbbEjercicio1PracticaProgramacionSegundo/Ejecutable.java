package bbbEjercicio1PracticaProgramacionSegundo;

import CosasCasaSerias.Taxi;

import java.util.Random;

public class Ejecutable{
    public static void main(String[] args) {

        Electrodomestico[] listaElectrodomesticos = new Electrodomestico[5];

        listaElectrodomesticos[0] = new Lavadora(12,4,Colores.blanco,ConsumoEnergetico.A,123,34);
        listaElectrodomesticos[1] = new Lavadora(12, 4, Colores.blanco, ConsumoEnergetico.C, 345, 34);
        listaElectrodomesticos[2] = new Television(12,23,3,Colores.azul,ConsumoEnergetico.C,34,false);
        listaElectrodomesticos[3] = new Television(45, 34, 4, Colores.blanco, ConsumoEnergetico.D, 54, true);
        listaElectrodomesticos[4] = new Television();


        double precioTV = 0;
        double precioLavadora = 0;
        double precioElectrodomestico = 0;

        for (Electrodomestico electrodomestico : listaElectrodomesticos) {
            if (electrodomestico instanceof Television) {
                precioTV += electrodomestico.precioFinal();
            } else if (electrodomestico instanceof Lavadora) {
                precioLavadora += electrodomestico.precioFinal();
            }
            precioElectrodomestico += electrodomestico.precioFinal();
        }

        System.out.println("Precio total de televisores: " + precioTV);
        System.out.println("Precio total de lavadoras: " + precioLavadora);
        System.out.println("Precio total de electrodomesticos: " + precioElectrodomestico);
    }
}

