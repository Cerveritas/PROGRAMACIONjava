package Ejercicio2Segundo;

import java.util.Scanner;

public class UsoPlaneta {
    public static void main(String[] args) {



/****************************************************PLANETA 1*********************************************************/
        Planeta planeta1 = new Planeta("Tierra", 4, 2.3, 3.2, 34, 34324, Tamanio.ENANO, false);




/****************************************************PLANETA 2*********************************************************/
        Planeta planeta2 = new Planeta();
        System.out.println("El nombre es "+planeta2.getNombre());


/************************************************PLANETA 3 (EXAMENN)***************************************************/


        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el nombre del planeta");
        String nombre = sc.next();

        System.out.println("Introduzca el numero de satelites");
        int cantidadSatelites = sc.nextInt();

        System.out.println("Introduzca la masa del planeta");
        double masa = sc.nextDouble();

        System.out.println("Introduzca el volumen del planeta");
        double volumen = sc.nextDouble();

        System.out.println("Introduzca el diametro del planeta");
        int diametro = sc.nextInt();

        System.out.println("Introduzca la distancia al sol");
        int distancia = sc.nextInt();

        System.out.println("Introduzca el tipo de planeta: Gaseoso, Terrestre, Enano");
        String tipo = sc.next().toUpperCase();
        Tamanio tamanio = Tamanio.valueOf(tipo);

        System.out.println("Es observable el planeta?: S-N");
        char opcion = sc.next().toUpperCase().charAt(0);
        boolean observable = opcion == 'S';

        Planeta planeta3 = new Planeta(nombre,cantidadSatelites,masa,volumen,diametro,distancia,tamanio,observable);





/**********************************************************************************************************************/



        planeta1.imprimir();

        System.out.println(planeta3);

        System.out.println("La densidad del planeta dos es "+planeta2.calcularDensidad());

        System.out.println("Verificar que el planeta tres es obserbable"+planeta3.esPlanetaExterior());





    }
}
