package EjemploLinkedLidtTercero;

import java.util.LinkedList;

public class LinkdListEj1 {
    public static void main(String[] args) {

        LinkedList<Integer> cola = new LinkedList<>();
        cola.addLast(1);
        cola.add(2);
        cola.addFirst(3);
        System.out.println(cola.toString());
        System.out.println("Eliminar el primero de la cola "+cola.remove());
        System.out.println(cola.add(3));
        System.out.println(cola.toString());
        System.out.println("Eliminar la primera ocurrencia "+cola.removeFirstOccurrence(1));
        System.out.println(cola.toString());








    }
}
