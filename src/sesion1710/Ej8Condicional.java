package sesion1710;

import java.util.Scanner;
public class Ej8Condicional {
    public static void main(String[] args) {

        System.out.println("\033[37m Vamos a hacer la media de tres notas y ver cual es tu nota final");

        int nota=0;
        int nota1=0;
        int nota2=0;
        Scanner not = new Scanner(System.in);
        System.out.println("\033[34m Digame la primera nota");
        nota = not.nextInt();

        Scanner nol = new Scanner(System.in);
        System.out.println("\033[34m Digame la segunda nota");
        nota1= nol.nextInt();

        Scanner nokt = new Scanner(System.in);
        System.out.println("\033[34m Digame la tercera nota");
        nota2= nokt.nextInt();

        int operacion;
        operacion = (nota+nota1+nota2)/3;


        if (operacion>=0 && operacion<=4)
        {
            System.out.println("\033[31m Tu nota es un "+operacion+" , Tienes un Insuficiente");
        }
        else if (operacion>=5 && operacion<=6)
        {
            System.out.println("\033[32m Tu nota es "+operacion+" , Tienes un Suficiente");
        }
        else if (operacion>=7 && operacion<=8)
        {
            System.out.println("\033[32m Tu nota es "+operacion+" , Tienes un Notable");
        }
        else if (operacion>=9 && operacion<=10)
        {
            System.out.println("\033[32m Tu nota es "+operacion+" , Tienes un Sobresaliente");
        }

    }
}
