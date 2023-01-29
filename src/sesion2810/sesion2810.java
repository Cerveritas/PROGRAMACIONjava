package sesion2810;

import java.util.Scanner;

public class sesion2810 {
    public class TiempoAltura{
        public static void main(String[] args) {
            final double G=9.8;
            double h=0;
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca el valor en metros");
            h=sc.nextDouble();
            double t=0;
            while (h<=0){
                System.out.println("Introduzca el valor en metros");
                h=sc.nextDouble();
            }
            t=Math.sqrt(2*h/G);
            System.out.println("El tiempo es = "+t);
        }


    }
}
