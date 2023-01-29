package sesion1701Segundo;

import java.util.Scanner;

public class UsoEjericicioPractico2 {

    public static void main(String[] args) {


        EjercicioPractico2 ej2 = new EjercicioPractico2();

        ej2.setDNI("");
        ej2.setNombre("");
        ej2.setApellido1("");
        ej2.setApellido2("");
        ej2.setNacionalidad("");
        ej2.setDireccion("");

        System.out.println("El DNI es "+tranformarDNI());
        System.out.println("El nombre es "+tranformarNombre());
        System.out.println("El primer apellido es "+tranformarApellido1());
        System.out.println("El segundo apellido es "+tranformarApellido2());
        System.out.println("La nacionalidad es "+tranformarNacionalidad());
        System.out.println("La direccion es "+tranformarDireccion());


    }

    public static String tranformarDNI(){
        String DNI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu DNI");
        DNI = sc.next();
        return DNI;
    }
    public static String tranformarNombre(){
        String Nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu Nombre");
        Nombre = sc.next();
        return Nombre;
    }
    public static String tranformarApellido1(){
        String Apellido1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu primer apellido");
        Apellido1 = sc.next();
        return Apellido1;
    }
    public static String tranformarApellido2(){
        String Apellido2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu segundo apellido");
        Apellido2 = sc.next();
        return Apellido2;
    }
    public static String tranformarNacionalidad(){
        String Nacionalidad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu nacionalidad");
        Nacionalidad = sc.next();
        return Nacionalidad;
    }
    public static String tranformarDireccion(){
        String Direccion;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es tu direccion");
        Direccion = sc.next();
        return Direccion;
    }
}
