package VehiculosHerenciaSegundo;

import java.util.Scanner;

public class UsoVehiculo {
    public static void main(String[] args) {

        Coche coche = new Coche(123333,"157SCJ",4,120);

            System.out.println("El coche tiene unas caracteristicas de: "+coche.showInfo());


            Moto moto = new Moto(12000,"7856GTF",125);

                System.out.println("La moto tiene unas caracteristicas de: "+moto.showInfo());


            Camion camion = new Camion(456789,"45674FGT",16);

                System.out.println("El camion tiene unas caracteristicas de: "+camion.showInfo());












    }
}
