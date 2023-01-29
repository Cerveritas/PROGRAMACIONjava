package CosasCasa;

import java.util.Scanner;

public class ApruebaAMiNovia {
    public static void main(String[] args) {



        System.out.println("Bienvenido a --> PON A PRUEBA A TU NOVIA");
        System.out.println(" ");
        System.out.println("Para este test es importante responder a todas");
        System.out.println("y cada una de las 5 siguientes preguntas:");
        System.out.println(" ");
        System.out.println(" ");

        int pregunta1 = 0;
        int pregunta2 = 0;
        int pregunta3 = 0;
        int pregunta4 = 0;
        int pregunta5 = 0;

        Scanner sc = new Scanner(System.in);

        // Pregunta 1
        System.out.println("Del 1 al 5 cuanto quieres a tu novio: ");
        System.out.println("(1) - Poco | (5) - Mucha");
        pregunta1 = sc.nextInt();

        // Pregunta 2
        System.out.println("¿Que probabilidad del 1 al 10 hay de verte en un futuro con tu novio?: ");
        System.out.println("(1) - Poca | (5) - Mucha");
        pregunta2 = sc.nextInt();

        // Pregunta 3
        System.out.println("Has pensado en dejar la relacion en algun momento: ");
        System.out.println("(1) - Si | (5) - No");
        pregunta3 = sc.nextInt();

        // Pregunta 4
        System.out.println("Que probabilidad hay de que me pongas los cuernos: ");
        System.out.println("(1) - Poca | (5) - Mucha");
        pregunta4 = sc.nextInt();

        // Pregunta 5
        System.out.println("Que probabilidad hay de que me compres el lego de Star Wars de 999€: ");
        System.out.println("(1) - Poca | (5) - Mucha");
        pregunta5 = sc.nextInt();
        System.out.println(" ");
        System.out.println(" ");

        int resultado=0;

        resultado = (pregunta1+pregunta2+pregunta3+pregunta4+pregunta5)/5;

        if (resultado == 5){
            System.out.println("Perfecto!!! Tu relacion es perfecta");
        }
        else if (resultado == 4){
            System.out.println("Bien, tu relacion sera durareda si es cuidada");
        }
        else if (resultado == 3){
            System.out.println("No esta mal, pero hay que mejorar en algunos aspectos");
        }
        else if (resultado == 2){
            System.out.println("Tu relacion va en picado al fracaso, dificilmente sacaras un futuro con tu pareja puta infiel");
        }
        else if (resultado == 1){
            System.out.println("Eres toxica y una persona inestable, dile a tu novio que sois una mierda y dejarlo ya que pareceis Carlos y Jara");
        }















    }
}
