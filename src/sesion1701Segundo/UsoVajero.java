package sesion1701Segundo;

import java.util.Scanner;

public class UsoVajero {
    public static void main(String[] args) {

        System.out.println("\033[36m ************************");
        System.out.println("\033[36m *******SOLUCION 1*******");
        System.out.println("\033[36m ************************");
                                                                                                                        System.out.print("\u001B[0m");

        Viajero viajero1 = new Viajero("49701191P","Sergio", "Cervera", "Jimenez", "Española", "Mi casa");

        System.out.println("El DNI del viajero1 es: "+viajero1.getDNI());
        System.out.println("El nombre del viajero1 es: "+viajero1.getNombre());
        System.out.println("El primer apellido del viajero1 es: "+viajero1.getApellido1());
        System.out.println("El segundo apellido del viajero1 es: "+viajero1.getApellido2());
        System.out.println("La nacionalidad del viajero1 es: "+viajero1.getNacionalidad());
        System.out.println("La direccion del viajero1 es: "+viajero1.getDireccion());
                                                                                                                        System.out.println(" " +
                                                                                                                                "" +
                                                                                                                                "");
                                                                                                                        System.out.println("\033[31m*************************************************************************************************************************");
/**********************************************************************************************************************/System.out.println("\u001B[0m");


                                                                                                                        System.out.println(" ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su DNI: ");
        String DNI = sc.next();

        System.out.println("Introduzca su nombre: ");
        String nombre = sc.next();

        System.out.println("Introduzca su primer apellido: ");
        String apellido1 = sc.next();

        System.out.println("Introduzca su segundo apellido: ");
        String apellido2 = sc.next();

        System.out.println("Introduzca su nacionalidad: ");
        String nacionalidad = sc.next();

        System.out.println("Introduzca su direccion: ");
        String direccion = sc.next();


                                                                                                                        System.out.println(" ");

        System.out.println("\033[36m ************************");
        System.out.println("\033[36m *******SOLUCION 2*******");
        System.out.println("\033[36m ************************");

                                                                                                                        System.out.print("\u001B[0m");

        Viajero viajero2 = new Viajero(DNI,nombre,apellido1,apellido2,nacionalidad,direccion);
        System.out.println(viajero2.toString());




                                                                                                                        System.out.println(" ");
        System.out.println("\033[36m ************************");
        System.out.println("\033[36m *******SOLUCION 3*******");
        System.out.println("\033[36m ************************");
                                                                                                                        System.out.println(" \u001B[0m");
        System.out.println("El nombre del viajero2 es: "+viajero2.getNombre());
        System.out.println("El DNI de "+viajero2.getNombre()+" es "+viajero2.getDNI());
        System.out.println("El primer apellido de "+viajero2.getNombre()+" es "+viajero2.getApellido1());
        System.out.println("El segundo apellido de "+viajero2.getNombre()+" es "+viajero2.getApellido2());
        System.out.println("La nacionalidad de "+viajero2.getNombre()+" es "+viajero2.getNacionalidad());
        System.out.println("La direccion de "+viajero2.getNombre()+" es "+viajero2.getDireccion());

























    }
}
