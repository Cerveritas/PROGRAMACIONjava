package sesion1310;

import java.util.Scanner;

public class EjercicioForIncremental {

    public static void main(String[] args) {

        int numero=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Elija hasta que numero deseas ir");
        numero=sc.nextInt();


        for (int i=1;i<=numero;i++)
        {
            System.out.println(i);
        }


        for (int j=numero;j>0;j--)
        {
            System.out.println(j);
        }


    }
}

