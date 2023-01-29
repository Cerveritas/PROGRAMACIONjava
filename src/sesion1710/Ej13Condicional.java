package sesion1710;

import java.util.Scanner;

public class Ej13Condicional {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println("Vamos a ordenar numeros (3) que introduzcas por pantalla,");
        System.out.println("en este caso lo haremos de menor a mayor.");
        System.out.println(" ");

        int a = 0;
        int b = 0;
        int c = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        a = sc.nextInt();
        System.out.println("Introduzca el segundo numero");
        b = sc.nextInt();
        System.out.println("Introduzca el tercer numero");
        c = sc.nextInt();

        if (a<b && b<c)
            System.out.println(a+", "+b+", "+c);
        else
        {
            if (a<c && c<b)
                System.out.println(a+", "+c+", "+b);
            else
            {
                if (b<a && a<c)
                    System.out.println(b+", "+a+", "+c);
                else
                {
                    if (b<c && c<a)
                        System.out.println(b+", "+c+", "+a);
                    else
                    {
                        if (c<a && a<b)
                            System.out.println(c+", "+a+", "+b);
                        else
                        {
                            if (c<b && b<a)
                                System.out.println(c+", "+b+", "+a);
                        }
                    }
                }
            }
        }




























    }
}
