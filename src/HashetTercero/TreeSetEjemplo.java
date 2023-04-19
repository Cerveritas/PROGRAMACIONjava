package HashetTercero;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetEjemplo {
    public static void main(String[] args) {

        System.out.println("CONJUNTO TREESET");
        TreeSet<Integer> coleccion_num = new TreeSet<>();
        coleccion_num.add(3);
        coleccion_num.add(2);
        coleccion_num.add(1);
        coleccion_num.add(1);
        coleccion_num.add(4);
        coleccion_num.add(5);

        Iterator<Integer> itr = coleccion_num.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("Saca el menor "+coleccion_num.first());
        System.out.println("Saca el mayor "+coleccion_num.last());
        System.out.println("CONJUNTO TREESET MENORES A 3");
        SortedSet<Integer> coleccion_num_menores = coleccion_num.headSet(3);
        Iterator<Integer> itr2 = coleccion_num_menores.iterator();
        System.out.println("Sacamos el subconjunto de la coleccion que son menores que 3");
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }
        System.out.println("CONJUNTO TREESET DESCENDENTE");
        Iterator<Integer> conjuntos_TS_descendente = coleccion_num.descendingIterator();
         while (conjuntos_TS_descendente.hasNext()){
             System.out.println(conjuntos_TS_descendente.next());
         }

    }
}
