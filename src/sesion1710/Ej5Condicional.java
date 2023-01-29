package sesion1710;

import java.util.Scanner;

public class Ej5Condicional {
    public static void main(String[] args) {

        int a=0;
        int b=0;
        int suma;
        suma = a+b;

        System.out.println("Vamos a realizar la suma de dos valores");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el valor de la variable a");
        a = sc.nextInt();

        Scanner st = new Scanner(System.in);
        System.out.println("Indica el valor de la variable b");
        b = sc.nextInt();

        suma = a+b;

        System.out.println("La suma de las dos varibales es "+suma);













    }
}
