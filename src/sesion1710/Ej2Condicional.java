package sesion1710;
import java.util.Scanner;
public class Ej2Condicional {

    public static void main(String[] args) {

        //no se llega a ejecutar por la readline(), no quiero hacerlo con numeros


            String dia;
            System.out.println("\033[36 Elige un dia de la semana");
            System.out.println("Y te dire que te toca a primera.");
            Scanner scr = new Scanner(System.in);

            dia=scr.nextLine();
            dia = dia.toLowerCase();

            switch (dia)
            {
                case "lunes":
                    System.out.println("\033[35m Base De Datos");break;
                case "martes":
                    System.out.println("\033[35m Lenguaje De Marcas");break;
                case "miercoles":
                    System.out.println("\033[35m Programacion");break;
                case "jueves":
                    System.out.println("\033[35m Base De Datos");break;
                case "viernes":
                    System.out.println("\033[35m Fol");break;
                case "sabado":
                    System.out.println("\033[35m Aqui empieza el fin de semanaaa!!!!");break;
                case "domingo":
                    System.out.println("\033[35m A descansar y coger fuerzas para mañana");break;
                default: System.out.println("\033[31m ESE ES UN VALOR INCORRECTO!!!");break;
            }
        }
    }



