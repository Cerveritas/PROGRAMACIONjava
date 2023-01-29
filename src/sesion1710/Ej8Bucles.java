package sesion1710;

import java.util.Scanner;

public class Ej8Bucles {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Tabla del " + n);
        for(int i = 1; i<=10; i++) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
