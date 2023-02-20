package excepcionesSegundo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1ConCaptura {

    // los catch abra tantos como exceptiones hay
    // el try catch se mete en el main

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Introduce el dividendo");
                int dividendo = sc.nextInt();

            System.out.println("Introduce el divisor");
                int divisor = sc.nextInt();

            System.out.println("El cociente de la division es "+dividendo/divisor);
        }
        catch (InputMismatchException e){   //ESTE CARCH SE USA MAS
            System.out.println("El valor introducido por teclado no es acorde al tipo de datos");
        }
        catch (ArithmeticException e) {  //ESTE CATCH SE USA MENOS
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getClass());
            e.printStackTrace();
            // System.out.println("Tambien puedes poner tu la respuesta por defecto");
        }
        finally {
            sc.close();
        }
    }
}
