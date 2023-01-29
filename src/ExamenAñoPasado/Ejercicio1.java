package ExamenAñoPasado;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        String texto="";
        texto=solicitar_usuario_texto(texto);

        String[] array_string=convertir_array_string(texto);
        System.out.println(Arrays.toString(array_string));

        int[] array_enteros = convertir_array_enteros(array_string);

        int sumatorio = suma_enteros(array_enteros);
        System.out.println("El resultado de la suma del array es "+Arrays.toString(array_enteros)+" es "+sumatorio);
    }

    public static String solicitar_usuario_texto(String texto){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzcame un texto compuesto por numeros y separado por punto y comas");
        texto=sc.next();
        return texto;

    }
    public static String[] convertir_array_string(String texto){
        String[] array_string = texto.split(";");
        return array_string;

    }
    public static int[] convertir_array_enteros(String[] array_string){
        int[] array_resultante = new int[array_string.length];
        for(int i=0; i<array_string.length; i++){

            array_resultante[i]=Integer.parseInt(array_string[i]);
        }
        return array_resultante;
    }

    public static int suma_enteros(int[] array_enteros){
        int resultado=0;
        for(int i=0; i<array_enteros.length; i++){
            resultado=resultado+array_enteros[i];
        }

        return resultado;
    }
}
