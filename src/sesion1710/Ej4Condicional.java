package sesion1710;

import java.util.Scanner;

public class Ej4Condicional {
    public static void main(String[] args) {

        int hora=0;
        int multiplicacion, multiplicacion2;


        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas horas trabajas");
        hora = sc.nextInt();
        multiplicacion=hora*12;
        multiplicacion2=hora*16;

        if (hora<= 40)
        {
            System.out.println("el salario es "+multiplicacion);
        }
        else if (hora>=41)
        {
            System.out.println("el salario es "+multiplicacion2);
        }
        else
        {
            System.out.println("Ese valor es incorrecto");
        }









    }
}
