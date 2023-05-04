/*
package MasEjerciciosArrayListTerceroo.Ejercicio3;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class UsoPersona {

    static Scanner sc = new Scanner(System.in);
   static Persona lista_personas = new Persona();
    public static void main(String[] args) {


        int opcion = 0;

        do {
            System.out.println("---------------------------------------------------");
            System.out.println("0 - Salir del programa");
            System.out.println("1 - Añadir persona al arraylist");
            System.out.println("2 - Buscar persona por DNI en el arraylist");
            System.out.println("3 - Eliminar persona por DNI del arraylist");
            System.out.println("4 - Ordenar por apellidos");
            System.out.println("5 - Ordenar por apellidos y sexo");
            System.out.println("6 - Imprimir arraylist");
            System.out.println("---------------------------------------------------");
            opcion = sc.nextInt();


            switch (opcion) {
                case 0:
                    System.out.println("Gracias por usar el programa");
                    break;

                case 1:
                    add();
                    break;

                case 2:
                    System.out.println("Introducir el DNI del usuario");
                    String DNI = sc.next();
                    buscar(DNI);
                    break;

                case 3:
                    System.out.println("Introduce el dni de la persona que deseas eliminar");
                    String dni = sc.next();
                    eliminar(dni);
                    break;

                case 4:
                    ordenarApellidos();
                    break;

                case 5:
                    ordenarApellidosYSexo();
                    break;

                case 6:
                    imprimir();
                    break;

                default:
                    System.out.println("El numero introducido no es valido");
                    break;


            }

        } while (opcion!= 0);

    }

    private static void add() {
       Persona p1 = new Persona(dni, nombre, apellido1, apellido2, sexo, edad, peso);
       p1.add(lista_personas);

        System.out.println("Usuario registrado en el arraylist");
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
            System.out.println("el dni esta en el array");
        } else {
            System.out.println("Lo sentimos el dni no se encuentra en el arraylist");
        }
    }

    private static void imprimir() {
        System.out.println("Imprimiendo array...");
        for (Persona p : lista_personas){
            System.out.println(p.toString().toString());
        }
    }

    private static void eliminar(String dni) {
        for (Persona p : lista_personas){
            if (p.getDni().equals(dni)){
                lista_personas.remove(p);
            }
        }
        System.out.println("Eliminar correctamente...");
    }

    private static void ordenarApellidos() {
        System.out.println("ORDENACION POR APELLIDOS");
        lista_personas.sort(Comparator.comparing(Persona::getApellido1));
        imprimir();
    }


    private static void ordenarApellidosYSexo() {
        System.out.println("ORDENACION POR APELLIDOS Y SEXO");
        lista_personas.sort(Comparator.comparing(Persona::getApellido1).thenComparing(Persona::getSexo));
        imprimir();
    }


}
*/