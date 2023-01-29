package sesion1710;
//Hay que remasterizarlo a mi manera
import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class Ej6Condicional {
    public static void main(String[] args) {
        System.out.println("Cálculo del tiempo de caída de un objeto.");

        int h = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca la altura (en metros) desde la que cae el objeto: ");
        h = sc.nextInt();

        final double g = 9.81;
        double s = (2*h/g);

        System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
    }
}


