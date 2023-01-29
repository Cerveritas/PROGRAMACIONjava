
package sesion1710;

import java.util.Scanner;

public class Ej10Condicional {
    public static void main(String[] args) {

        String horoscopo = "";

        System.out.println(" ");
        System.out.println("\033[34m Este programa le dirá cuál es su horóscopo a partir de su fecha de nacimiento.");
        System.out.println(" ");

        int dia = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\033[37m Introduzca el día: ");
        dia = sc.nextInt();

        int mes = 0;
        Scanner scr = new Scanner(System.in);
        System.out.println("\033[37m Introduce el mes: ");
        mes = scr.nextInt();

        switch (mes) {
            case 1:
                if (dia < 21)
                {
                    horoscopo = "Capricornio";
                } else {
                    horoscopo = "Acuario";
                }
                break;
            case 2:
                if (dia < 20)
                {
                    horoscopo = "Acuario";
                } else {
                    horoscopo = "Piscis";
                }
                break;
            case 3:
                if (dia < 21)
                {
                    horoscopo = "Piscis";
                } else {
                    horoscopo = "Aries";
                }
                break;
            case 4:
                if (dia < 21)
                {
                    horoscopo = "Aries";
                } else {
                    horoscopo = "Tauro";
                }
                break;
            case 5:
                if (dia < 20)
                {
                    horoscopo = "Tauro";
                } else {
                    horoscopo = "Géminis";
                }
                break;
            case 6:
                if (dia < 22)
                {
                    horoscopo = "Géminis";
                } else {
                    horoscopo = "Cáncer";
                }
                break;
            case 7:
                if (dia < 22)
                {
                    horoscopo = "Cáncer";
                } else {
                    horoscopo = "Leo";
                }
                break;
            case 8:
                if (dia < 24)
                {
                    horoscopo = "Leo";
                } else {
                    horoscopo = "Virgo";
                }
                break;
            case 9:
                if (dia < 23)
                {
                    horoscopo = "Virgo";
                } else {
                    horoscopo = "Libra";
                }
                break;
            case 10:
                if (dia < 23)
                {
                    horoscopo = "Libra";
                } else {
                    horoscopo = "Escorpio";
                }
                break;
            case 11:
                if (dia < 23)
                {
                    horoscopo = "Escorpio";
                } else {
                    horoscopo = "Sagitario";
                }
                break;
            case 12:
                if (dia < 21)
                {
                    horoscopo = "Sagitario";
                } else {
                    horoscopo = "Capricornio";
                }
                break;
            default:
        }

        System.out.print("\033[35m ¡¡¡¡Su horóscopo es " + horoscopo+"!!!!");
    }
}


































