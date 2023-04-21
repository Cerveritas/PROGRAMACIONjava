package EjemplosListTercero;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer> coleccion_num = new ArrayList<Integer>();

        coleccion_num.add(3);
        coleccion_num.add(3);
        coleccion_num.add(2);
        coleccion_num.add(1);
        coleccion_num.add(4);
        coleccion_num.add(5);


        Iterator<Integer> itr = coleccion_num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
        System.out.println("elemento situado en primer lugar "+coleccion_num.get(0));
        System.out.println("posicion de la primera ocurrencia de 3 -> "+coleccion_num.indexOf(3));
        System.out.println("posicion de la ultima ocurrencia de 3 -> "+coleccion_num.lastIndexOf(3));
        System.out.println("Tamaño de la lista "+coleccion_num.size());
        System.out.println("Sublista 0-2 "+coleccion_num.subList(0,2).toString());
        System.out.println("Cambiar el valor de la posicion ultima "+coleccion_num.set(coleccion_num.size()-1, 6));
        System.out.println(coleccion_num.toString());



    }




}
