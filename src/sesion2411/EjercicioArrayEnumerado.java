package sesion2411;

import java.util.Scanner;

public class EjercicioArrayEnumerado {
    private static final int [][] notas = new int[2][3];
    public static void main(String[] args) {

        System.out.println("Lo primero que haremos sera meter los datos de las notas dentro de un array BIDIMEMSIONAL");

       Scanner sc = new Scanner(System.in);

        System.out.println("Introduza practica 1 de programacion: ");
        notas[0][0]=sc.nextInt();

        System.out.println("Introduzca practica 2 de programacion: ");
        notas[0][1]=sc.nextInt();

        System.out.println("Introduzca nota examen de programacion: ");
        notas[0][2]=sc.nextInt();

        System.out.println("Introduzca practica 1 de BBDD: ");
        notas[1][0]=sc.nextInt();

        System.out.println("Introduzca practica 2 de BBDD: ");
        notas[1][1]=sc.nextInt();

        System.out.println("Introduzca nota examen de BBDD: ");
        notas[1][2]=sc.nextInt();
        menu();

    }
    public static void menu(){
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("A continuacion veremos que tipo de media deseas visualizar.");
        System.out.println("Pulse 0 para SALIR");
        System.out.println("Pulse 1 para: MEDIA DE UNA ASIGNATURA");
        System.out.println("Pulse 2 para: MEDIA DE AMBAS ASIGNATURAS");

        switch (sc.nextInt())
        {
            case 0: System.out.println("Programa Finalizado");break;
            case 1: media_de_una_asignatura();break;
            case 2: media_de_ambas_asinaturas();break;
            default:System.out.println("El numero introducido no es correcto");
        }

    }
    public static void media_de_una_asignatura(){
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        System.out.println("Has elegido ver la media de una asignatura.");
        System.out.println("A continuacion elige de que asignatura quieres ver la nota final");
        System.out.println(" ");
        System.out.println("(1) - Para media de PROGRAMACION.");
        System.out.println("(2) - Para media de BBDD.");

        switch (sc.nextInt())
        {
            case 1: System.out.println("la nota de programacion es: "+((notas[0][0]+notas[0][1]+notas[0][2])/3));break;
            case 2: System.out.println("la nota de BBDD es: "+((notas[1][0]+notas[1][1]+notas[1][2])/3));break;
            default:System.out.println("El numero introducido no es correcto");
        }

    menu();



    }
    public static void media_de_ambas_asinaturas(){
        System.out.println(" ");

        System.out.println("La nota media de ambas asigaturas es "+(( (notas[0][0]+notas[0][1]+notas[0][2]) /3)+((notas[1][0]+notas[1][1]+notas[1][2])/3))/2);



    menu();

    }

}
