package sesion0311;


import java.util.Scanner;

public class Simulacion {
    public static void main(String[] args) {

        int x1;
        int x2;
        char opcion = 'a';

        System.out.println("Introduce dos numeros:");
        Scanner sc = new Scanner(System.in);
        x1=sc.nextInt();
        Scanner df = new Scanner(System.in);
        x2 = df.nextInt();

        System.out.println("¿Que operacion quiere hacer?");
        System.out.println("SUMA ------------> (+)");
        System.out.println("RESTA -----------> (-)");
        System.out.println("MULTIPLICACIÓN --> (*)");
        System.out.println("DIVISION --------> (/)");
        Scanner gf = new Scanner(System.in);
        opcion=gf.next().charAt(0);




        Calculadora calc = new Calculadora();

        switch (opcion){
            case '+' : {imprimir(calc.suma(x1, x2));break;}
            case '-' : {imprimir(calc.resta(x1, x2));break;}
            case '*' : {imprimir(calc.multiplicacion(x1, x2));break;}
            case '/' : {imprimir(calc.division(x1, x2));break;}

        }
    }

    private static void imprimir(int resultado){
        System.out.println(resultado);
    }
}
