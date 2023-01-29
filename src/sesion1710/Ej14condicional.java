package sesion1710;

import java.util.Scanner;

public class Ej14condicional {
    public static void main(String[] args) {

        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero y te dire si es par y divisible entre 5 o no");
        num = sc.nextInt();

        if (num %2 == 0 && num %5 == 0)
        {
            System.out.println("Es par y divisible entre 5");
        }

        else
        {
            System.out.println("Es impar y no es divisible entre 5");
        }
    }
    }

