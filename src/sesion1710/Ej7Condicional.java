package sesion1710;

import java.util.Scanner;
//repa
public class Ej7Condicional {
    public static void main(String[] args) {

        int nota=0;
        int nota1=0;
        int nota2=0;
        Scanner not = new Scanner(System.in);
        System.out.println("Digame la primera nota");
        nota = not.nextInt();
        nota1= not.nextInt();
        nota2= not.nextInt();

        int operacion=0;
        operacion = nota+nota1+nota2;

        if (nota>=0)
        {
            if (nota1>=0){
                if (nota2>=0){
                    System.out.println(operacion/3);
                }
            }
        }
        else {System.out.println("Mete un valor correcto");}










    }
}
