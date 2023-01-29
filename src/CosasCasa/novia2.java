package CosasCasa;

import java.util.Scanner;

public class novia2 {
    public static void main(String[] args) {
        System.out.print    ("\033[36m ############################################################################\n");
        System.out.print    ("\033[36m #                    Test para saber si tu novia es infiel                 #\n");
        System.out.print    ("\033[36m #                    y es una buena novia y futura mujer                   #\n");
        System.out.print    ("\033[36m #                    con la que pasar el resto de tu vida                  #\n");
        System.out.print    ("\033[36m ############################################################################");
        System.out.println("\033[37m ");
        System.out.println(" ");
        System.out.println("\033[37m Responda a las siguientes preguntas del test;");
        System.out.println(" ");

    /* declaramos la variable trabajo y la inicializamos para que el usuario
       elija con 1 o 2 el resultado de si tiene trabajo o no.
     */

        int trabajo = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("\033[33m Para responder SI, pulse 1.");
        System.out.println("\033[33m Para responder NO, pulse 2.");
        System.out.println("\033[32m ¿Usted piensa en un futuro con su pareja?");
        trabajo = sc.nextInt();


        if (trabajo == 1)
        {
            System.out.println("\033[37m sabia que ibas a decir 2, calla.");
        }
        else if (trabajo == 2)
        {
            System.out.println("\033[37m Con esa respuesta ya das a entender que tienes una relacion de mierda.");return;
        }else {System.out.println("Tu respuesta no es valida");return;}

        // aqui sigue la segunda pregunta de el dinero que se desea solicitar
        System.out.println(" ");
        System.out.println(" Vamos a la segunda pregunta");
        System.out.println(" ");
        System.out.println("\033[33m El dinero que desea adqurir debe ser igual o menor al 80% del precio de la vivienda.");

        // declaramos e inicializamos la variable "precio" a 0 para que el usuario ponga la cantidad de dinero que quiere adquirir

        int precio=0;
        Scanner pr = new Scanner(System.in);
        System.out.println("\033[32m ¿Cuanto vale la vivienda que desea comprar?");
        precio = pr.nextInt();

    /* declaramos la variable "porcentaje" y la inicializamos a la formula asignada
       que es el 80% del precio indicado anteriormente.
     */

        int porcentaje;
        porcentaje=precio/100*80;

        System.out.println("\033[33m PUEDES PEDIR UN PRESTAMO DE  "+porcentaje+ " euros O INFERIOR");
        System.out.println(" ");

        // declaramos e inicializamos el valor de "user" a 0 para que el usuario indique la cantidad a pedir.

        int user=0;
        Scanner us = new Scanner(System.in);
        System.out.println("\033[32m ¿Cuanto deseas pedir?");
        user = us.nextInt();

        if (user > porcentaje)
        {
            System.out.println("\033[31m El dinero solicitado es superior a lo indicado, vuelvalo a intentar");return;
        }
        else if (user <= porcentaje)
        {
            System.out.println("\033[37m Perfecto usted a decidido pedir un prestamo de "+user+" euros");
        }

        //aqui finalizamos con la ultima pregunta de el dinero ahorrado
        System.out.println(" ");
        System.out.println(" Vamos a la tercera y ultima pregunta");
        System.out.println(" ");
        System.out.println("\033[33m El dinero ahorrado debe ser un 20% superior al precio de la vivienda");
        System.out.println("\033[33m Recordamos que tu vivienda elegida tiene un valor de "+precio+" euros");
        System.out.println(" ");

    /* declaramos e inicializamos la variable "ahorro" a 0 e indicamos que
       el valor "ahorro" es el 20% de precio para indicar al usuario el
       minimo de dinero que debe tener ahorrado.
     */

        int ahorro=0;
        ahorro=(precio/100)*20;

        System.out.println("\033[33m De esta manera debes tener ahorrado como minimo "+ahorro+" euros.");
        System.out.println(" ");

    /* por ultimo se declara la variable e inicializa "real" que es el dinero que el usuario
       pondra que tiene ahorrado, de esta manera se confirmara o no si al usuario se le
       concedera la hipoteca por tener todos los pasos correctos o de esta manera se le
       denegara la hipoteca.
     */

        int real=0;
        Scanner rl = new Scanner(System.in);
        System.out.println("¿Entonces, cuanto dinero tienes ahorrado?");
        real = rl.nextInt();

        if (ahorro<=real )
        {
            System.out.println("\033[37m Perfecto");
            System.out.println(" ");
            System.out.println("\033[37m Enorhabuena!!! Los datos introducidos son aptos para hipotecar ");
            System.out.println("\033[37m su futura casa.");
            System.out.println(" ");
            System.out.println("\033[37m Le esperamos mañana 21 de octubre a las 10:30 a.m.");
        }
        else if (ahorro > real)
        {
            System.out.println("\033[37m Valla, no has llegado a cumplir con todos los requisitos para pedir el prestamo ");
        }
    }
}


