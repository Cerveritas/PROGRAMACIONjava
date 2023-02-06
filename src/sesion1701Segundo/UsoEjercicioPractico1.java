package sesion1701Segundo;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class UsoEjercicioPractico1 {

    public static void main(String[] args) {


        EjercicioPractico1 ej = new EjercicioPractico1();

        System.out.println("Ejercicio1");
        System.out.println("El primer numero es: "+ej.getNumero1());
        System.out.println("El segundo numero es: "+ej.getNumero2());
        System.out.println("El mayor es: "+Math.max(ej.getNumero1(), ej.getNumero2()));


    }
}
