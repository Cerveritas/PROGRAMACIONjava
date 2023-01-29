package EjerciciosMetodos;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        // declarar las variables
        int base,exponente=0;

        // solicitar los datos y asignarselos a las variables
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca la base");
        base = sc.nextInt();
        System.out.println("Introduzca el exponente");
        exponente = sc.nextInt();

        double resultado = calcularPotencia(base,exponente);


        // 1era manera de imprimir resultado
        System.out.println(+resultado);

        // 2da manera de imprimir resultado
        imprimir(resultado);
   }

    private static void imprimir(double resultado) { // segunda manera
        System.out.println(resultado);
    }




    private static double calcularPotencia(int base, int exponente) {

        double resultado=0;

        resultado = Math.pow(base,exponente);


        return resultado;
    }


}
