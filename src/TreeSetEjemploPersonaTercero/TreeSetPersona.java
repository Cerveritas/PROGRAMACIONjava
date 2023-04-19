package TreeSetEjemploPersonaTercero;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetPersona {

    public static void main(String[] args) {


        TreeSet<Persona> listado_personas = new TreeSet<>(Comparator.comparing(Persona::getNombre));
        listado_personas.add(new Persona("Maria", "12345678D", 24));
        listado_personas.add(new Persona("Sergio", "12345678T", 47));
        listado_personas.add(new Persona("ElRecartes", "12345678W", 546));
        listado_personas.add(new Persona("Nahiara", "12345678P", 12));

        System.out.println("TreeSet Ascendente");
        Iterator<Persona>itr = listado_personas.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().getNombre());
        }

        System.out.println("TreeSet Descendente");
        Iterator<Persona> itr2 = listado_personas.descendingIterator();
        while (itr2.hasNext()){
            System.out.println(itr2.next().getNombre());
        }
    }
}
