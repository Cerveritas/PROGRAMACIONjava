/*package EjerciciosMetodos;

import java.util.Scanner;

public class EjercicioString {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        String palabra="";

        System.out.println("Que opcion quiere usted");
        System.out.println(" ");
        System.out.println("1. - Buscar cierta vocal en una palabra");
        System.out.println("2. - Invertir la palabra");
        System.out.println("3. - Contar longitud de palabra");
        System.out.println("4. - Comparar dos palabras");
        opcion = sc.nextInt();

        System.out.println("Que palabra quiere usted: ");
        palabra = sc.next();




        switch (opcion)
        {
            case 1: System.out.println("Que vocal deseas buscar");
                    char vocal = sc.next().charAt(0);
                    int numero_vocales=buscar_vocal_palabra(palabra, vocal);
                    System.out.println("El numero de "+vocal+" en la palabra: "+palabra+" es "+numero_vocales);

            case 3: contar_longitud(palabra);

            case 4: palabra= palabra_igual(String palabra);


        }
    }

    private static void contar_longitud(String palabra) {
       System.out.println("La palabra "+palabra+" tiene "+palabra.length()+" letras. ");
    }

    private static int buscar_vocal_palabra(String palabra, char vocal){
        int resultado = 0;
        for (int i=0; i<palabra.length(); i++){
            if (palabra.charAt(i) == vocal){
                resultado++;
            }
        }
        return resultado;
    }

    private static boolean palabra_igual(String palabra){


    }
}
*/