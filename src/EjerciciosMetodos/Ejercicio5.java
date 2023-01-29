package EjerciciosMetodos;

import sesion1811.ArrayArgumento;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        System.out.println("Introduzcame la moneda a cambiar");
        Scanner sc = new Scanner(System.in);
        double dinero_a_cambiar= sc.nextDouble();

        System.out.println("A que moneda quieres cambiar");
        String moneda_a_cambiar=sc.next().toUpperCase();

        // lo hacemos modo procedimiento
        conversor(dinero_a_cambiar, moneda_a_cambiar);


    }
    public static void conversor(double dinero_a_cambiar, String moneda_a_cambiar){

        final double DOLAR=1.28;     // constantes siempre en mayusculas.
        final double LIBRA=0.86;
        final double YENES=129.853;

        double resultado=0;

        switch (moneda_a_cambiar){

            case "DOLAR": resultado=dinero_a_cambiar*DOLAR;break;
            case "LIBRA": resultado=dinero_a_cambiar*LIBRA;break;
            case "YENES": resultado=dinero_a_cambiar*YENES;break;
            default:System.out.println("el valor introducido es incorrecto");break;

        }
        System.out.println("El dienero en euros "+dinero_a_cambiar+" es en "+moneda_a_cambiar+" "+resultado);

    }
}