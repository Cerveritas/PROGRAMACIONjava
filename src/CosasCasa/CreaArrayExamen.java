package CosasCasa;

import java.util.Arrays;
import java.util.Scanner;

public class CreaArrayExamen {
    public static void main(String[] args) {


        System.out.println("Vamos a realizar la creacion de un Array de numeros");


        int[] ArrayNumeros = new int[10];

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Introduce el numero " +i);
            ArrayNumeros[i] = sc.nextInt();
        }

        System.out.println("Array creado correctamente.....");
                                                                                                                        System.out.println(" ");
        System.out.println("A continuacion elige que es lo que quieres realizar: ");
        System.out.println("(1) - Ver el Array");
        int opcion=0;
        opcion= sc.nextInt();
        switch (opcion)
        {
            case 1: for(int i =0; i<ArrayNumeros.length; i++){
                System.out.println(ArrayNumeros[i]);break;
            }

            default:System.out.println("El numero introducido es incorrecto, vuelve a intentarlo");
        }



    }
}
