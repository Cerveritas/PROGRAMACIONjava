package sesion1710;

import java.util.Scanner;

public class Ej7Bucles {


    public static void main(String[] args) {

        int intentos = 4;
        int numeroIntroducido;
        boolean acertado = false;


        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Introduzca la clave de la caja fuerte: ");
            numeroIntroducido = sc.nextInt();

            if (numeroIntroducido == 8888) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }

            intentos--;

        } while((intentos > 0) && (!acertado));

        if (acertado) {
            System.out.println("Ha abierto la caja fuerte.");
        } else {
            System.out.println("Lo siento, ha agotado las 4 oportunidades.");
        }
    }
}
