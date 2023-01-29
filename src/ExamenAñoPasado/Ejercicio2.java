package ExamenAñoPasado;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int opcion;
        do {
            System.out.println("Funcionalidades ejercicio 2");
            System.out.println(" ");
            System.out.println("1 - Calcular sumatorio");
            System.out.println("2 - Invertir array");
            System.out.println("3 - Salir");
            System.out.println(" ");

            System.out.println("Esperando opcion...");
            Scanner sc = new Scanner(System.in);
            opcion = sc.nextInt();

            switch (opcion)
            {
                case 1:
                    System.out.println("Que numero quires el sumatorio");
                    int numeros=sc.nextInt();
                    int sumatorio = metodo1(numeros);
                    System.out.println("El sumatorio de "+numeros+" es "+sumatorio);

                case 2: invertirArray();break;


                case 3: System.out.println("Gracias por utilizar el programa...");break;
                default:System.out.println("Opcion introducida incorrecta");break;
            }


        }while (opcion!=3);
    }

    public static int metodo1(int numeros){
        int resultado=0;
        for (int i=1; i<=numeros;i++){
            resultado=resultado+i;
        }
        return resultado;
    }

    public static void invertirArray(){
        Scanner sc = new Scanner(System.in);
        int[]array;
        System.out.println("Introduzca la dimension del array");
        int dimension = sc.nextInt();
        array = new int[dimension];
        for (int i=0; i< array.length; i++){
            System.out.println("Introduzca el valor "+i);
            array[i] = sc.nextInt();
        }
        System.out.println("EL array sin invertir es "+ Arrays.toString(array));
        int[] array_invertido = new int [dimension];
        for (int i=0; i<array.length; i++){
            array_invertido[i] = array[array.length-1-i];
        }
        System.out.println("El array invertido es "+Arrays.toString(array_invertido));
    }
}
