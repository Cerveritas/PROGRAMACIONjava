package sesion1611;

import java.util.Scanner;

public class EjercicioClase {
    public static void main(String[] args) {

        String[] lista = {"Sergio", "Nahiara", "Sofia"};
        int posicion = -1;
        String busca;
        Scanner sc = new Scanner(System.in);
        System.out.println("Que nombre deseas buscar");
        busca = sc.next();
        posicion = busca(lista, busca);
        imprimir(posicion); //, busca);
    }
//todo lo comentado se puede activar para ser mas completo, pero sigue valiendo de las dos formas
    private static void imprimir(int posicion)// ,String nombre)
    {
        if (posicion==-1)
        {
            System.out.println("Error");
            //                 ("el nombre "+nombre+"  no esta"
        }
        else
        {
            System.out.println(posicion);
            //                 ("el nombre "+nombre+" se encuentra en la posicion "+posicion)
        }
    }

    private static int busca(String[] lista, String busca) {
        int posicion=-1;
        for (int i = 0; i < lista.length; i++)
        {
            if (lista[i].equals(busca))
            {
                posicion=i;
            }
        }
        return posicion;
    }
}




