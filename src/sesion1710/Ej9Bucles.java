package sesion1710;

import java.util.Scanner;

public class Ej9Bucles {
    public static void main(String[] args) {

        int numeroIntroducido=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número entero y le diré cuántos dígitos tiene: ");
        numeroIntroducido = sc.nextInt();

        long n = numeroIntroducido;
        int numeroDeDigitos = 1;

        while (n > 10) {
            numeroDeDigitos++;
            n /= 10;
        }

        System.out.println(numeroIntroducido + " tiene " + numeroDeDigitos + " dígito/s.");
    }
}









