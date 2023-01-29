package Examen1TrimestreIntentadoCasa;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int opcion=0;
        int[] array = new int[0];


            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce numericamente el tamaño de la lista");
            array = new int[sc.nextInt()];
            System.out.println("Array creado correctamente: "+ Arrays.toString(array));
                                                                                                                        System.out.println(" ");
            System.out.println("¿A continuacion que quieres hacer? ");









    do{

        System.out.println("(0) - Salir");
        System.out.println("(1) - Inicializar nuestro array");
        System.out.println("(2) - Imprimir el valor maximo y su posicion");
        System.out.println("(3) - Mostrar media del array");
        System.out.println("(4) - Imprimir por pantalla el array");
                                                                                                                        System.out.println(" ");
        System.out.print("Elija una opcion: ");
        opcion = sc.nextInt();


        switch (opcion)
        {
            case 0: salirPrograma();
                break;

            case 1: inicializarArray(array);
                break;

            case 2: System.out.println("El numero mayor del array es "+imprimirNumeroMayor(array));
                break;

            case 3:
                break;

            case 4: imprimirArray(array);
                break;

            default: System.out.println("El numero introducido no es correcto");break;
        }
    }while (opcion != 0);


    }
    public static void salirPrograma(){
        System.out.println("Programa finalizado...");
    }

    public static int[] inicializarArray(int[] array){
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<array.length; i++){
            System.out.println("Introduce el numero de la posicio ");
            array[i]=sc.nextInt();
        }
        return array;
    }
    public static void imprimirArray(int[] array){
        for(int i=0; i< array.length; i++){
            System.out.println(array[i]);
        }
    }

    public static int imprimirNumeroMayor(int[] array){
        int mayorTemp = array[0];
        for(int i=0; i<array.length; i++){
            if(mayorTemp <= array[i]){
                mayorTemp = array[i];
                mayorTemp=i;
            }
        }
        return mayorTemp;
    }



}
