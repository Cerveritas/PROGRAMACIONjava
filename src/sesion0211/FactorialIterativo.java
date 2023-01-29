package sesion0211;

import java.util.Scanner;

public class FactorialIterativo {
    public static long factorialIterativo (long numero) {
        if (numero <0)
            numero = numero * -1;
        if (numero <=0)
            return 1;
        long factorial = 1;
        while (numero > 1){
            factorial = factorial * numero;
            numero--;
        }
        return factorial;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el numero del que quiera calcular su factorial");
        long numero = sc.nextLong();

        System.out.println("El factorial de " +numero+ " es "+factorialIterativo(numero));
    }
}
