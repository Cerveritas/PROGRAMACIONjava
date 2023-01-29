package EjerciciosMetodos;

import javax.management.monitor.StringMonitor;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {

        String nombre = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        nombre = sc.next();

        System.out.println("Selecciona una opcion; ");
            System.out.println("1 - Longitud de palabra");
            System.out.println("2 - Inicial de palabra");
            System.out.println("3 - Ultima letra de la palabra");
            System.out.println("4 - Quitar espacio de la palabra");
            System.out.println("5 - Pasar palabra a mayusculas");
            System.out.println("6 - Pasar palabra a minusculas");
            System.out.println("7 - Sustituir letra de la palabra");
            System.out.println("8 - Ver si esta vacio o no");
            System.out.println("9 - Pasar a un array de char");
                                                                                                        System.out.println(" ");
        int opcion = 0;
        opcion = sc.nextInt();




        switch (opcion) {
            case 1: System.out.println(LongitudString(nombre));break;
//-----------------------------------------------------------------------------------------------
            case 2: System.out.println(InicialString(nombre));break;
//-----------------------------------------------------------------------------------------------
            case 3: System.out.println(UltimaLetra(nombre));break;
//-----------------------------------------------------------------------------------------------
            case 4: System.out.println(QuitarEspacio(nombre));break;
//-----------------------------------------------------------------------------------------------
            case 5: System.out.println(PasarMayuscula(nombre));break;
//-----------------------------------------------------------------------------------------------
            case 6: System.out.println(PasarMinuscula(nombre));break;
//-----------------------------------------------------------------------------------------------
            case 7:
                System.out.println("Dime la letra a reemplazar");
                    char letra_vieja = sc.next().charAt(0);
                System.out.println("Dime la letra nueva");
                    char letra_nueva = sc.next().charAt(0);
                System.out.println(ReemplazarLetra(nombre,letra_vieja,letra_nueva));break;
//-----------------------------------------------------------------------------------------------
            case 8:
                if(EsVacio(nombre)) {
                    System.out.println("La plalabra esta vacia");
                }else{System.out.println("la palabra no esta vacia");}break;

//-----------------------------------------------------------------------------------------------
            case 9:
                char[] array = DevolverArray(nombre);
                System.out.println(Arrays.toString(array));
                break;

//-----------------------------------------------------------------------------------------------
            default: System.out.println("No has introducido una opcion valida");break;
        }
    }

    // metodo 1
    private static int LongitudString(String nombre){
        int resultado=0;
        resultado=nombre.length();
        return resultado;
    }

    // metodo 2
    private static char InicialString(String nombre){
        char resultado=0;
        resultado=nombre.charAt(0);
        return resultado;

    }

    // metodo 3
    private static char UltimaLetra(String nombre){
        char resultado=0;
        resultado= nombre.charAt(nombre.length()-1);
        return resultado;
    }

    // metodo 4
    private static String QuitarEspacio(String nombre){
        String resultado="";
        resultado=nombre.trim();
        return resultado;
    }

    // metodo 5
    private static String PasarMayuscula(String nombre){
        String resultado="";
        resultado= nombre.toUpperCase();
        return  resultado;
    }

    // metodo 6
    private static String PasarMinuscula(String nombre){
        String resultado="";
        resultado=nombre.toLowerCase();
        return resultado;
    }

    // metodo 7
    private static String ReemplazarLetra(String nombre,char letra_vieja, char letra_nueva){
        String resultado="";
        resultado=nombre.replace(letra_vieja,letra_nueva);
        return resultado;
    }

    // metodo 8
    private static boolean EsVacio(String nombre){
        boolean resultado=false;
        resultado=nombre.isEmpty();
        return resultado;
    }

    // metodo 9
    private static char[] DevolverArray(String nombre){
        char[] array;
        array=nombre.toCharArray();
        return array;

    }
}
