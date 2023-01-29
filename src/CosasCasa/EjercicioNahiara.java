package CosasCasa;

import java.util.Scanner;

public class EjercicioNahiara {
    public static void main(String[] args) {

        String nombre = "sergio, nahiara";

        int numero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("¿De que persona quieres sacar la edad?");

        System.out.println("Pulsa; ");
        System.out.println(" ");
        System.out.println("(1) - Nahiara");
        System.out.println("(2) - Sergio");

        numero = sc.nextInt();


        switch (numero)
        {
            case 1: System.out.println("La edad de Nahiara es 19 años y 2 mentalmente");break;
            case 2: System.out.println("La edad de Sergio es 20 añazos y programador mentalmente");break;
            default:System.out.println("El numero metido no es valido");

        }


    }
}
