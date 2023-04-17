package HashetTercero;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEjemplo {
    public static void main(String[] args) {

        HashSet<String> nombres = new HashSet<>();
        nombres.add("Juan");
        nombres.add("Pia");
        nombres.add(null);
        Iterator<String> itr = nombres.iterator(); // <-- Es para recorrer la estructura el iterador
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("El numero de elementos "+nombres.size());
        nombres.clear();
        System.out.println("El numero de elementos "+nombres.size());

        nombres.add("Maria");
        nombres.add("Sofia");
        nombres.remove("Sofia");
        Iterator<String> itr2 = nombres.iterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next());
        }









    }
}
