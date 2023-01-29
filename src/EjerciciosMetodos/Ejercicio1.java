package EjerciciosMetodos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int numero;
        System.out.println("Introduzca hasta que número quieres saber que es primo: ");
        Scanner sc = new Scanner(System.in);
        numero=sc.nextInt();
        for (int i=0;i<=numero;i++){
            boolean resultado = esPrimo(i);
            if (resultado) {
                System.out.println(i + " Es primo");
            } else {
                System.out.println(i + " No es primo");
            }

        }
    }
    public static boolean esPrimo(int numero) {
        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            // Si es divisible por cualquiera de estos números, no
            // es primo
            if (numero % x == 0)
                return false;
        }
        // Si no se pudo dividir por ninguno de los de arriba, sí es primo
        return true;
    }
}
