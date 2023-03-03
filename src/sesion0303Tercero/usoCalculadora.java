package sesion0303Tercero;

import java.util.Scanner;

public class usoCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora calcu1 = new Calculadora(5, 6);

        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();


        Calculadora calcu2 = new Calculadora(num1,num2);
        System.out.println("La suma de calcu es "+calcu1.sumar(calcu1.getNum1(), calcu1.getNum2()));

        System.out.println("La resta de calcu2 es "+calcu2.restar(calcu2.getNum1(), calcu2.getNum2()));





    }

}
