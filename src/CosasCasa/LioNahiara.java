package CosasCasa;

import java.util.Scanner;

public class LioNahiara {
    public static void main(String[] args) {


        System.out.println("VAMOS A VER LAS POSIBILIDADES DE VERNOS ESTE FINDE YA QUE TU NOVIO TIENES MUCHAS GANAS");

        Scanner number = new Scanner(System.in);
        System.out.println("ELige:");
        System.out.println(" ");
        System.out.println("(1) - Si aceptas dormir conmigo mañana por la noche cumpliendo todos los terminos de mi novia");
        System.out.println("(2) - Deniegas completamente esta proposicion");
        int numero = 0;
        numero = number.nextInt();


        while (numero != 1) {
            System.out.println("Respuesta incorrecta, vuelve a intentarlo ");
            numero = number.nextInt();
        }

        number.close();

        System.out.println("Respuesta correcta! Se ve que aprecias a tu novio");


        System.out.println("Hola me llamo sergio");
        System.out.println("Soy programador");
        System.out.println("Me dedico principalmente al desarrollo de Software con el uso de JAVA");
        System.out.println("Otro lenguaje de programacion que uso es JavaScript al implementarlo en mis paginas web hechas con HTML y CSS");

    }
}



