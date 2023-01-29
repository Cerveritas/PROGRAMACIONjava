package sesion1710;

import java.util.Scanner;

public class Ej1Condicional {
    public static void main(String[] args) {

        int mes=0;

        Scanner sc =new Scanner(System.in);
        System.out.println("Introduczca un numero entre el 1 y el 12 para mostrar el mes elegido");
        mes = sc.nextInt();

        switch (mes)
        {
            case 1: {System.out.println("Enero");break;}
            case 2: {System.out.println("Febrero");break;}
            case 3: {System.out.println("Marzo");break;}
            case 4: {System.out.println("Abril");break;}
            case 5: {System.out.println("Mayo");break;}
            case 6: {System.out.println("Junio");break;}
            case 7: {System.out.println("Julio");break;}
            case 8: {System.out.println("Agosto");break;}
            case 9: {System.out.println("Septiembre");break;}
            case 10: {System.out.println("Octubre");break;}
            case 11: {System.out.println("Noviembre");break;}
            case 12: {System.out.println("Diciembre");break;}
            default: {System.out.println("El numero introducido no es valido");break;}
        }
    }
}
