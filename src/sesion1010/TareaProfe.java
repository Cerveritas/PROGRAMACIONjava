package sesion1010;

import java.util.Scanner;

public class TareaProfe {


        public static void main(String[] args) {

            // declaramos e inicializamos la variable edad
            int nota =0;

            // solicitud y lectura de la edad
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduzca su nota");
            nota = sc.nextInt();

            // determinar que valor de la nota le corresponde
            if (nota>=0 && nota <=4.99)
            {
                System.out.println("Suspenso");
            }
            else if (nota >=5 && nota <=5.99)
            {
                System.out.println("Aprobado ");
            }
            else if (nota >=6 && nota <=6.99)
            {
                System.out.println("Bien");
            }
            else if (nota >=7 && nota <=8.99)
            {
                System.out.println("Notable");
            }
            else
            {
                System.out.println("Sobresaliente");
            }
        }
    }











