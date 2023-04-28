package MasEjerciciosArrayListTercero.Ejercicio3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class UsoPersona {
    public static ArrayList<Persona> lista_personas = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        int opcion = 0;

        do {
            System.out.println("------------------------------------------------------------");
            System.out.println("0 - Salir del programa");
            System.out.println("1 - Añadir persona al arrayList");
            System.out.println("2 - Buscar persona por DNI en el arrayList");
            System.out.println("3 - Eliminar persona por DNI del arrayList");
            System.out.println("4 - Ordenar por apellidos");
            System.out.println("5 - Ordenar por apellidos y sexo");
            System.out.println("6 - Imprimir arraylist");
            System.out.println("------------------------------------------------------------ ");
            opcion = sc.nextInt();

            switch (opcion){
                case 0:
                    System.out.println("Gracias por usar el programa");
                    break;

                case 1:
                    add();
                    break;

                case 2:
                    System.out.println("Introducir el DNI del usuario");
                    String dni = sc.next();
                    buscar(dni);
                    break;

                case 3:
                    System.out.println("Introduce el dni de la persona que deseas eliminar");
                    String DNI = sc.next();
                    eliminar(DNI);
                    break;

                case 4:
                    ordenarApellidos();
                    break;

                case 5:
                    ordenarApellidosySexo();
                    break;

                case 6:
                    imprimir();
                    break;

                default:
                    System.out.println("El numero introducido no es correcto");
            }
        } while (opcion != 0);
    }

    private static void ordenarApellidosySexo() {
        System.out.println("ORDENACION POR APELLIDOS Y SEXO");
        lista_personas.sort(Comparator.comparing(Persona::getApellido1).thenComparing(Persona::getSexo));
        imprimir();
    }

    private static void ordenarApellidos() {
        System.out.println("ORDENACION POR APELLIDOS");
        lista_personas.sort(Comparator.comparing(Persona::getApellido1));
        imprimir();
    }

    private static void eliminar(String dni) {
        for (Persona p : lista_personas){
            if (p.getDni().equals(dni)){
                lista_personas.remove(p);
            }
        }
        System.out.println("eliminado correctamente...");
    }

    private static void imprimir() {
        System.out.println("imprimiendo array...");
        for (Persona p:lista_personas){
            System.out.println(p.toString().toString());
        }
    }

    private static void buscar(String dni) {
        boolean esta = false;
        for (Persona p : lista_personas){
            if (p.getDni().equals(dni)){
                esta = true;
                break;
            }
        }
        if (esta){
            System.out.println("El dni "+dni+" esta en el arrayList");
        } else {
            System.out.println("Lo sentimos pero el "+dni+" no se encuentra en el arraylist");
        }
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


        Persona p1 = new Persona (dni, nombre, apellido1, apellido2, sexo, edad, peso);
        lista_personas.add(p1);
                                                                                                                        System.out.println(" ");
        System.out.println("usuario registrado en el arraylist...");
    }
}
