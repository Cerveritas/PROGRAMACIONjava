package HashetTercero;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetEjemplo {

    public static void main(String[] args) {

        LinkedHashSet<String> nombres = new LinkedHashSet<>();
        nombres.add("Juan");
        nombres.add("Pia");
        nombres.add(null);
        Iterator<String> itr = nombres.iterator();
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
