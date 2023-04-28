package MasEjerciciosArrayListTercero.Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class UsoPersona {
    public static ArrayList<Persona> lista_personas = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {



/*
        lista_personas.add(new Persona("123456789N", "Nahiara", "Zarco", "Garcia", 'F', 20, 60));
        lista_personas.add(new Persona("987654321S", "Sergio", "Cervera", "Jimenez", 'M', 21, 70));
        lista_personas.add(new Persona("46756764R", "Alejandro", "Recarte", "Rebollo", 'P', 22, 80));

*/

        int opcion = 0;

        do {
            System.out.println("0 - Salir del programa");
            System.out.println("1 - Añadir persona al arrayList");
            System.out.println("2 - Buscar persona por DNI en el arrayList");
            System.out.println("3 - Eliminar persona por DNI del arrayList");
            System.out.println("4 - Ordenar por apellidos");
            System.out.println("5 - Ordenar por apellidos y sexo");
            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa...");
                    break;

                case 1: add();
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                default:
                    System.out.println("El numero introducido no es correcto");
            }
        } while (opcion != 0);
    }


    private static void add() {
        System.out.println("Introduzca el DNI de la persona");
        String dni = sc.next();

        System.out.println("Introduzca el nombre de la persona");
        String nombre = sc.next();

        System.out.println("Introduzca el apellido1 de la persona");
        String apellido1 = sc.next();

        System.out.println("Introduzca el apellido2 de la persona");
        String apellido2 = sc.next();

        System.out.println("Introduzca el sexo de la persona (H o M)");
        char sexo = sc.next().toUpperCase().charAt(0);

        System.out.println("Introduzca la edad de la persona");
        int edad = sc.nextInt();

        System.out.println("Introduzca el peso de la persona");
        double peso = sc.nextInt();


        Persona p1 = new Persona("123456789N", "Nahiara", "Zarco", "Garcia", 'F', 20, 60);
        lista_personas.add(p1);

        Persona p2 = new Persona("987654321S", "Sergio", "Cervera", "Jimenez", 'M', 21, 70);
        lista_personas.add(p2);

        Persona p3 = new Persona("46756764R", "Alejandro", "Recarte", "Rebollo", 'P', 22, 80);
        lista_personas.add(p3);


        System.out.println(lista_personas.toString());

    }
}
