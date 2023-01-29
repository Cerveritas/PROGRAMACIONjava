package sesion1310;

import java.util.Scanner;

public class EjercicioGeneraciones {

    public static void main(String[] args) {

        int año=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica de que año eres y te dire a que generacion pertences");
        año=sc.nextInt();

          if (año>=1994 && año<=2010 )
        {
            System.out.println("Generacion Z");
        }

          else if (año>=1981 && año<=1993)
        {
            System.out.println("Generacion Y");
        }
          else if (año>=1969 && año<=1980)
        {
            System.out.println("Generacion X");
        }
          else if (año>=1949 && año<=1968)
        {
             System.out.println("Generacion X");
         }
          else if (año>=1930 && año<=1948)
         {
             System.out.println("Generacion X");
         }
          else
          {
            System.out.println("Error");
          }
        while (año<1948 && año>2010);
        {
            System.out.println("Tienes que volver a empezar y meter un año correcto");
        }
    }

}
