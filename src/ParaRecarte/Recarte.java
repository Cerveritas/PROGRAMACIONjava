package ParaRecarte;

import java.util.Scanner;

public class Recarte {
    public void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("BIENVENIDO A CHAGPT34, LA IA CON LOS CONOCIMIENTOS NECESARIOS PARA SABER \n"+
                "COSAS NAZIS Y PICANTES");

        int opcion = 0;                                                                                                                System.out.println(" ");
        System.out.println("A continuacion marque la opcion que quiera realizar");
        System.out.println(" ");
        System.out.println("(1) - Tamaño de tu pito (recomendada)");
        System.out.println("(2) - Liga conmigo");
        System.out.println("(3) - Hackear la nasa");

        opcion = sc.nextInt();





        switch (opcion){
            case 1: System.out.println(tamano());
                break;
            case 2: System.out.println("Creo que esta opcion no esta hecha para gente como tu");
                break;
            case 3: System.out.println("Otro dia, cuando estes mas calmado, esto podria salir mal");
                break;

        }





    }

    private int tamano() {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Para saber el tamaño de tu pito solo tengo que saber cual es tu nombre");
        nombre = sc.next();

        if (nombre == "Sergio"){
            System.out.println("El tamaño de tu pito es un numero incaculable, lo dejaremos como infinito");

        } else if (nombre == "Recarte") {
            System.out.println("¿Que pito?");
        }


        return 0;
    }
}
