package sesion1411;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarNodo {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7};
        int[] newArray = null;
        int elementoEliminar = 0;

       System.out.println("Tu array actual es "+Arrays.toString(array));
       System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el que quieres eliminar");
        elementoEliminar = sc.nextInt();

        for (int i = 0; i < array.length-1; i++) {
            if(array[i] == elementoEliminar){
                newArray = new int[array.length - 1];
                for(int index = 0; index < i; index++){
                    newArray[index] = array[index];
                }
                for(int j = i; j < array.length - 1; j++){
                    newArray[j] = array[j+1];
                }
                break;
            }
        }
        System.out.println("El nuevo Array carecerá del número = "+elementoEliminar+" y el resultado es: "+ Arrays.toString(newArray));
    }
}






