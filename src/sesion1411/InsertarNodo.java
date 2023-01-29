package sesion1411;

import java.util.Arrays;
import java.util.Scanner;

public class InsertarNodo {
    public static void main(String[] args) {

        int [] array = {1,2};
        int [] array1simulado = new int[3];

        System.out.println("El array es "+ Arrays.toString(array));
        System.arraycopy(array, 0, array1simulado, 0, array.length);
        System.out.println("El array es "+Arrays.toString(array1simulado));
        System.out.println("¿Quieres insertar nuevoelemento? ");
        System.out.println(" ");
        System.out.println("Pulse 's' para Confirmar");
        Scanner sc = new Scanner(System.in);
        char opcion = sc.next().toLowerCase().charAt(0);


        if (opcion=='s'){
            System.out.println("dime numero ");
            int valornuevo = sc.nextInt();
            array1simulado[array1simulado.length-1]=valornuevo;
            System.out.println("eñ array es "+Arrays.toString(array1simulado));
        }
        else{
            System.out.println("Pues nada");
        }
    }
}
