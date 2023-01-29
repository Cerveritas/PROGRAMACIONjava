package sesion1710;

import java.util.Scanner;

public class Ej2Bucles {
    public static void main(String[] args) {

        System.out.println("\033[36m A continuacion vamos a mostrar los numeros multiplos de 5 hasta el 100 usando el bucle WHILE.");
        System.out.println("******************************************************************************************************");

        int i=0;

        while (i<=100)
        {
            System.out.println("\033[35m"+i);
            i=i+5;
        }
    }
}

