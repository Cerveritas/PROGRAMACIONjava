package EjemplosListTercero;

import java.util.ArrayList;
import java.util.Iterator;

public class RecorrerArrayListBucles {
    public static void main(String[] args) {


        ArrayList<Integer> coleccion_num = new ArrayList<>();
        coleccion_num.add(3);
        coleccion_num.add(2);
        coleccion_num.add(1);
        coleccion_num.add(1);
        coleccion_num.add(4);
        coleccion_num.add(5);

        System.out.println("RECORRER LA LISTA CON ITERADOR");
        Iterator<Integer> itr = coleccion_num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
            System.out.println("-");
        }

                                                                System.out.println("\n");

        System.out.println("RECORRER LA LISTA CON UN FOR TRADICIONAL ASCENDENTE");
        for (int i = 0; i < coleccion_num.size(); i++){
            System.out.println(coleccion_num.get(i));
            System.out.println("-");
        }

                                                                System.out.println("\n");

        System.out.println("RECORRER LA LISTA CON UN FOR-EACH");
        for (int elemento:coleccion_num){
            System.out.println(elemento);
            System.out.println("-");
        }

                                                                System.out.println("\n");

        System.out.println("RECORRER LA LISTA CON UN FOR TRADICIONAL DESCENDENTE");
        for (int j = coleccion_num.size() -1; j > 0; j--){
            System.out.println(coleccion_num.get(j));
            System.out.println("-");
        }








    }
}
