package sesion1411;

import java.util.Arrays;
public class BusquedaDeArrayBinarySearchNumerico {
    public static void main(String[] args) {

        int [] matriz =  {15,22,35,96};
        int posicion = Arrays.binarySearch(matriz,15);

       /* if (posicion >=0 ) {
            System.out.println("encontrado en posicion "+posicion);
        }
        else {
            System.out.println("no fue encontrado");
        }*/

        if (posicion<0)
        {
            System.out.println("no fue encontrado");
        }
        else
        {
            System.out.println("encontrado en posicion "+posicion);
        }
    }
}