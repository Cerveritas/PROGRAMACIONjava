package RepasoRecreo;

import java.util.Scanner;

public class ArrayUnidimensional {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // CREAR E INICIALIZAR EL ARRAY UNIDIMENSIONAL DE 10 A SER POSIBLE

        System.out.println("Introduzca la dimension del array");
        int dimension = sc.nextInt();
        int[] array_enteros = new int[dimension];


        for (int i = 0; i<array_enteros.length; i++){
            System.out.println("Introduzca un valor para la posicion "+i);
            array_enteros[i]=sc.nextInt();
        }


        // RECORRERLO E IMPRIMIRLO

        for (int i = 0; i<array_enteros.length; i++){
                                                                        System.out.println(" ");
            System.out.println("La posicion "+i+" tiene asignado el valor de "+array_enteros[i]);


        }


        // INDICAR CUANTOS NUMEROS SON POSITIVOS Y CUANTOS NEGATIVOS

        int contador_positivos = 0;
        int contador_negativos = 0;

        for (int i = 0; i<array_enteros.length; i++){
            if (array_enteros[i]>=0){
                contador_positivos++;
            }
            else {
                contador_negativos++;
            }
        }
        System.out.println("La cantidad de numeros negativos en el array es: "+contador_negativos);
        System.out.println("La cantidad de numeros positivos en el array es: "+contador_positivos);
    }
}
