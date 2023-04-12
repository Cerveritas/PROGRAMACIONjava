package ExamenAñoPasado;

import java.util.Scanner;

public class Ejercicio3Sergio {
    public static void main(String[] args) {

        // declaracion array de int

        int dimension = solicitarDimension();
        int[] array = new int[dimension];




    }

    public static int solicitarDimension() {
        Scanner sc = new Scanner(System.in);
        int resultado=0;
        do {
            System.out.println("Introduzcame una dimension");
            resultado = sc.nextInt();
        }while (resultado<=0);

        return resultado;
    }
}
