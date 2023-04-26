/*
package MasEjerciciosArrayListTercero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<Double> lista_reales = new ArrayList<Double>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        double numero = 0;
        double numero_antiguo = 0, numero_nuevo = 0;
        int posicion = 0;




        do {
            System.out.println("PULSE EL NUMERO DE LA OPCION QUE QUIERE REALIZAR");
            System.out.println("0 - Salir del programa");
            System.out.println("1 - Agregar un numero al arraylist");
            System.out.println("2 - Buscar un numero en el arraylist");
            System.out.println("3 - Modificar un numero en el arraylist");
            System.out.println("4 - Eliminar un numero en el arraylist");
            System.out.println("5 - Insertar un numero en una posicion dada");
            System.out.println("6 - Imprimir el array");
            System.out.println("............................");
            opcion = sc.nextInt();

            switch (opcion){

                case 0:
                    System.out.println("Gracias por usar el programa");
                    break;

                case 1:
                    System.out.println("Introduzca por favor el numero que desea añadir al arraylist");
                    numero = sc.nextDouble();
                    add(numero);
                    break;

                case 2:
                    System.out.println("Introduzca el numero que quiere buscar en el arraylist");
                    numero = sc.nextDouble();
                    buscar(numero);
                    break;

                case 3:
                    System.out.println("Introduzca el numero que desea modificar");
                    numero = sc.nextDouble();
                    modificar(numero_antiguo, numero_nuevo);
                    break;

                case 4:
                    System.out.println("Introduzca el numero que desea eliminar del arraylist");
                    numero = sc.nextDouble();
                    eliminar(numero);
                    break;

                case 5:
                    System.out.println("Introduca el nuevo numero para insertar en una posicion dada");
                    numero = sc.nextDouble();
                    System.out.println("Indique la posicion en la que se quiere insertar");
                    posicion = sc.nextInt();
                    add_specific(numero, posicion);
                    break;

                case 6:
                    imprimir_array();
                    break;

                default:
                    System.out.println("El numero introducido no es correcto");
                }
        }while (opcion != 0);
    }

    private static void modificar(double numero_antiguo, double numero_nuevo) {
        if (lista_reales.contains(numero_antiguo)){
            int posicion=lista_reales.indexOf(numero_antiguo);
            lista_reales.set(posicion, numero_nuevo);
        }
    }

    private static void buscar(double numero) {
        int posicion = lista_reales.indexOf(numero);

        if (posicion != -1){
            System.out.println("Esta");
        } else {
            System.out.println("No esta");
        }
    }


    public static void add(double numero) {
        lista_reales.add(numero);
    }




}
*/