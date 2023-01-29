package Practica_Sergio_CerveraJimenez;

import java.util.Scanner;

public class Ejercicio2 {
    /*
     * PROGRAMACION
     * UNIDAD 1 Y 2
     * @author Sergio Cervera Jimenez
     * @curse 1ºM DAM+
     */
    public static void main(String[] args) {
        // introduccion

        System.out.print    ("\033[36m ############################################################################\n");
        System.out.print    ("\033[36m #         Bienvenido a tu Matematico, si estas aqui es por que quieres     #\n");
        System.out.print    ("\033[36m #         aplicar distintas formulas de un circulo asique le               #\n");
        System.out.print    ("\033[36m #         le proporcionaremos la informacion necesaria                     #\n");
        System.out.print    ("\033[36m ############################################################################");
        System.out.println("\033[37m ");
        System.out.println(" ");
        System.out.println("Vamos a empezar con asginar el radio, entonces:");

        /* lo primero seria declarar las variables;
           "r" que es el radio para que el usuario elija que valor quiere asignarle.
           "pi" para inicializarlo al valor de 3.14
         */

        int r = 0;
        double pi= 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cual es el valor que le quieres asignar al radio?");
        r = sc.nextInt();
        System.out.println("\033[32m EL RADIO HA SIDO ASIGNADO CON EL VALOR DE "+r);

        System.out.println(" ");
        System.out.println("A continuacion elegiremos que queremos calcular:");

        /* a continuacion declaramos e inicializamos la variable calculo a 0 para
           que el usuario indique que valor quiere asignar para realizar un switch
           a continuacion.
         */

        int calculo=0;
        Scanner ca = new Scanner(System.in);
        System.out.println("\033[36m Pulsa 1, para calcular el PERIMETRO");
        System.out.println("\033[36m Pulse 2, para calcular el AREA");
        System.out.println("\033[36m Pulse 3, para calcular el VOLUMEN");
        calculo = ca.nextInt();

        /* aqui declaramos variables perimetro, area y volumen
           y las inicialiazmos con sus respectivas formulas.

         */
        double perimetro = 2*pi*r;
        double area = pi*(r*r);
        double volumen = (4*pi*(r*r*r))/3;


        switch (calculo)
        {
            //calculo del perimetro
            case 1: {System.out.println("EL resultado del Perimetro es: "+perimetro);break;}

            //calculo del area
            case 2: {System.out.println("El resultado del Area es: "+area);break;}

            //calculo del volumen
            case 3: {System.out.println("El resultado del Volumen es: "+volumen);break;}

            default: System.out.println("El valor introducido es incorrecto");
        }
    }
}