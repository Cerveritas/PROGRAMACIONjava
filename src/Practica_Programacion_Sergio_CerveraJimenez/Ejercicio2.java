package Practica_Programacion_Sergio_CerveraJimenez;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        String[] lista = new String[0];

        int opcion = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce numericamente el tamaño de la lista de la compra: ");
        lista = new String[sc.nextInt()];
        System.out.println("Lista de la compra creada correctamente... A continuacion, ¿que quieres hacer?");
                                                                                                                        System.out.println(" ");
        do{
        System.out.println("-----------------------------------------------------------------------------------------------------------------");
        System.out.println("(0) - Salir");
        System.out.println("(1) - Hacer lista de la compra");
        System.out.println("(2) - Numero de items de la lista de la compra");
        System.out.println("(3) - Imprimir la lista de la compra");
        System.out.println("(4) - Comprobar si existe 'elemento' y en que posicion se encuentra en la lista");
        System.out.println("(5) - Comprobar numero de veces que se repite un producto en la lista de la compra introducido por teclado");
        System.out.println("(6) - Numero de vocales de un producto introducido por teclado");
        System.out.println("(7) - Eliminar el producto introducido por teclado de la lista si esta en la lista");
        System.out.println("(8) - Insertar un nuevo producto en la lista");
                                                                                                                        System.out.println(" ");

        System.out.println("Elige una opcion: ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 0: salirPrograma();
                break;
            case 1: lista = hacerListaCompra(lista);
                System.out.println("La lista ha sido creada correctamente...");
                                                                                                                        System.out.println(" ");
                break;

            case 2: System.out.println("El numero de items en la lista de la compra es: "+numeroDeItems(lista));
                                                                                                                        System.out.println(" ");
                break;

            case 3: System.out.println("Los elementos de la lista introducidos por teclado son: ");
                imprimirLista(lista);
                                                                                                                        System.out.println(" ");
                break;

            case 4: System.out.println("Introduce el elemento que quieres buscar en la lista: ");
                int[]posiciones = buscarProducto(lista, sc.next());
                System.out.print("El elemento se encuentra en la poscicion: ");
                for(int i=0; i< posiciones.length; i++){
                    System.out.println(posiciones[i]);
                }
                                                                                                                        System.out.println(" ");
                break;

            case 5: System.out.println("Introduce el producto que quieres comprobar si esta repetido: ");
                System.out.println("El producto esta repetido "+cuantasVeces(lista, sc.next())+" veces");
                                                                                                                        System.out.println(" ");
                break;

            case 6: System.out.println("Introduce el producto del que quieres conocer sus vocales: ");
                String producto = sc.next();
                int[] cantidad;
                if(cuantasVeces(lista, producto) > 0){
                    cantidad = numeroVocales(producto);
                }else cantidad = numeroVocales(" ");
                System.out.println("El producto "+producto+" contiene las siguientes vocales: ");
                System.out.println("(a) --> "+cantidad[0]);
                System.out.println("(e) --> "+cantidad[1]);
                System.out.println("(i) --> "+cantidad[2]);
                System.out.println("(o) --> "+cantidad[3]);
                System.out.println("(u) --> "+cantidad[4]);
                                                                                                                        System.out.println(" ");
                break;

            case 7: System.out.println("Introduce el producto que quieres eliminar de la lista: ");
                lista = eliminarProducto(lista, sc.next());
                                                                                                                        System.out.println(" ");
                break;

            case 8: System.out.println("Cual es producto que deseas añadir en la lista: ");
                lista = añadirProducto(lista, sc.next());
                                                                                                                        System.out.println(" ");
                break;

            default:
                System.out.println("La opcion introducida no es correcta. Intentelo de nuevo");break;
        }
    }while (opcion!=0);
    }

    // METODO 0 --> SALIR DEL PROGRAMA
    public static void salirPrograma(){
        System.out.println("Saliendo del Programa...");
    }

    // METODO 1 --> RELLENAS EN ARRAY DE "LISTA DE COMPRA"
    public static String[] hacerListaCompra(String[] lista){
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<lista.length; i++){
            System.out.println("Introduce el elemento nº "+i);
            lista[i] = sc.next();
        }
    return lista;
    }

    // METODO 2 --> TE SACA EL Nº DE PRODUCTOS QUE HAS METIDO EN LA LISTA
    public static int numeroDeItems(String[] lista){
        int numero=0;
        numero = lista.length;
        return  numero;

    }

    // METODO 4 --> COMPRUEBA SI EL PRODUCTO ELEGIDO ESTA EN LA LISTA O NO, Y SI ESTA EN QUE POSICION SE ENCUENTRA
    public static int[] buscarProducto(String[]lista, String producto){
        int[] posiciones = new int[0];
        for(int i = 0; i < lista.length; i++){
            if(lista[i].equals(producto)){
                posiciones= Arrays.copyOf(posiciones, posiciones.length+1);
                posiciones[posiciones.length-1] = i;
            }
        }
        return posiciones;
    }

    // METODO 5 --> COMPRUEBA CUANTAS VECES ESTA REPETIDO O NO UN PRODUCTO EN NUESTRA LISTA DE LA COMPRA
    public static int cuantasVeces(String[]lista, String producto){
        int cantidad = 0;
        for(int i = 0; i<lista.length; i++){
            if(producto.equals(lista[i])){
                cantidad++;
            }
        }
    return cantidad;
    }

    // METODO 6 --> CUENTA EL NUMERO DE VOCALES QUE TIENE UN PRODUCTO A ELEGIR DE LA LISTA
    public static int[] numeroVocales(String producto){
        char[]productoCharArray = producto.toCharArray();
        int[]cantidad = {0, 0, 0, 0, 0};
        for(int i = 0; i < productoCharArray.length; i++){
            switch (productoCharArray[i]){
                case 'a': cantidad[0]++;break;
                case 'e': cantidad[1]++;break;
                case 'i': cantidad[2]++;break;
                case 'o': cantidad[3]++;break;
                case 'u': cantidad[4]++;break;
            }
        }
    return cantidad;
    }

    // METODO 7 --> ELIMINA UN PRODUCTO DE LA LISTA INTRODUCIDO POR TECLADO
    public static String[] eliminarProducto(String[]lista, String producto){
        String[]listaFinal = new String[lista.length];
        int j=0;
        for (int i = 0; i < lista.length; i++){
            if (!lista[i].equals(producto)){
                if(!lista[i].equals(producto)){
                    listaFinal[j] = lista[i];
                    j++;
                }
            }
        }
        System.out.println("La nueva lista es:");
        imprimirLista(listaFinal);
        return lista;
    }

    // METODO 8 --> AÑADE UN PRODUCTO A LA LISTA INTRODUCIDO POR TECLADO
    public static String[] añadirProducto(String[]lista, String producto){
        lista = Arrays.copyOf(lista, lista.length);
        lista[lista.length-1] = producto;
        System.out.println("La nueva lista es: ");
        imprimirLista(lista);
        return lista;
    }

    // METODO AUXILIAR --> EL ENCARGADO DE ALGUNOS PRINTS DE ALGUNOS SUBMETODOS
    public static void imprimirLista(String[]lista){
        for(int i = 0; i<lista.length; i++){
            System.out.println(lista[i]);
        }
    }
}
