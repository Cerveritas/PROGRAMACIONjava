package bbbEjercicio1PracticaProgramacionSegundo;

import java.util.Random;

public class Ejecutable{
    public static void main(String[] args) {

        Electrodomestico[] lista = new Electrodomestico[5];



        Random random = new Random();
        for (int i = 0; i < lista.length; i++) {
            if (random.nextBoolean()) {
                lista[i] = new Television();
            } else {
                lista [i] = new Lavadora();
            }
        }





        double precioTotalTelevisores = 0;
        double precioTotalLavadoras = 0;
        double precioTotalElectrodomesticos = 0;
        for (Electrodomestico electrodomestico : lista) {
            precioTotalElectrodomesticos += electrodomestico.getPrecioBase();
            if (electrodomestico instanceof Television) {
                precioTotalTelevisores += electrodomestico.getPrecioBase();
            } else if (electrodomestico instanceof Lavadora) {
                precioTotalLavadoras += electrodomestico.getPrecioBase();
            }
        }



        System.out.println("Precio total de los televisores: " + precioTotalTelevisores);
        System.out.println("Precio total de las lavadoras: " + precioTotalLavadoras);
        System.out.println("Precio total de los electrodomésticos: " + precioTotalElectrodomesticos);
    }
}

