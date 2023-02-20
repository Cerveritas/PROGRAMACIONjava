package excepcionesSegundo;

import java.util.Scanner;
public class Ej1SinCaptura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el dividendo");
        int dividendo = sc.nextInt();

        System.out.println("Introduce el divisor");
        int divisor = sc.nextInt();

        System.out.println("El cociente es "+dividendo/divisor);


    }
}
