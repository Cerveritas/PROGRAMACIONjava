package EjemplosStackTercero;

import java.util.Stack;

public class StackEJ1 {
    public static void main(String[] args) {

        Stack<String> pilaString = new Stack<>();
        System.out.println("Es vacio? "+pilaString.empty());
        pilaString.add("Sergio");
        pilaString.add("Nahiara");
        pilaString.add("Paco");

        System.out.println("Es vacio? "+pilaString.empty());
        System.out.println(pilaString.toString());
        System.out.println("cima pila "+pilaString.pop());
        System.out.println("Desapilo "+pilaString.pop());
        System.out.println("Apilo "+pilaString.push("ErRecarte"));
        System.out.println(pilaString.toString());
        System.out.println("eltos de la pila "+pilaString.size());





    }
}
