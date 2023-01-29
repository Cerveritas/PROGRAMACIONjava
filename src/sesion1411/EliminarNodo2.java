package sesion1411;

import java.util.Arrays;
import java.util.Scanner;

public class EliminarNodo2 {
    public static void main(String[] args) {

        int[] array_inicial = {1,2,3,4};
        int[] array_final = new int[3];

        System.out.println(Arrays.toString(array_inicial));
        System.out.println("Indique el número que quiere borrar");
        Scanner sc  = new Scanner(System.in);
        int item = sc.nextInt();
        int posicion = Arrays.binarySearch(array_inicial,item);

            if(posicion<0)
            {
                System.out.println("El elemento no esta en el array. No se puede eliminar nada");
            }
            else
            {
                int remainingElements = array_inicial.length - (posicion-1);
                System.arraycopy(array_inicial, 0, array_final, 0, posicion);
                System.arraycopy(array_inicial, posicion + 1, array_final, posicion, remainingElements);

                System.out.println("Elemento borrado");
                System.out.println("El array actualizado es "+Arrays.toString(array_final));
            }




    }
}
