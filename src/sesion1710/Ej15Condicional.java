package sesion1710;

import java.util.Scanner;

public class Ej15Condicional {
    public static void main(String[] args) {

        System.out.println("Este programa pinta una pirámide.");
        System.out.println(" ");

        char r=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un carácter de relleno: ");
        r = sc.next().charAt(0);

        int opcion = 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("Elija un tipo de pirámide");
        System.out.println(" ");


        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia la izquierda");
        System.out.println("4. Con el vértice hacia la derecha");
        opcion = scr.nextInt();

        switch(opcion) {
            case 1:
                System.out.println("  " + r);
                System.out.println(" " + r + r + r);
                System.out.println(""+r + r + r + r + r);
                break;
            case 2:
                System.out.println(""+r + r + r + r + r);
                System.out.println(" " + r + r + r);
                System.out.println("  " + r);
                break;
            case 3:
                System.out.println("    " + r);
                System.out.println("  " + r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println("  " + r + " " + r);
                System.out.println("    " + r);
                break;
            case 4:
                System.out.println(r);
                System.out.println(r + " " + r);
                System.out.println(r + " " + r + " " + r);
                System.out.println(r + " " + r);
                System.out.println(r);
                break;
            default:
        }
    }
}
