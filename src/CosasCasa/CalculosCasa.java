package CosasCasa;

import java.util.Scanner;

public class CalculosCasa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Sistema para hacer calculos");
        System.out.println(" ");

        int opcion=0;
        System.out.println("Elija con un numero la operacion que desea realizar: ");
        System.out.println(" ");
        System.out.println("(1) - Cuadrado");
        System.out.println("(2) - Triangulo");
        System.out.println("(3) - Circulo");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 0: System.out.println("Saliendo del programa...");
                break;

            case 1:
                break;
            case 2: break;
            case 3: break;
            default: System.out.println("*El numero introducido es incorrecto*");


        }




    }
    public static int areaCuadrado;
}
