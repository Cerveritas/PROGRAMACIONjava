package sesion1701Segundo;

import java.util.Scanner;

public class UsoViajero2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


/******************************************************************MODALIDAD 1****************************************************************************************/

        // 1 MODALIDAD objeto con constructor por defecto
        Viajero viajero1 = new Viajero();

/******************************************************************MODALIDAD 2****************************************************************************************/

        // 2 MODALIDAD objeto con constructor parametrizado metiendole los valores en duro
        Viajero viajero2 = new Viajero("2345345p","Sergio","Cervera","Jimenez","Española","MiCasa");

/******************************************************************MODALIDAD 3*************EXAMEN**********************************************************************/

        System.out.println("Introduce su DNI");
        String DNI = sc.next();
        System.out.println("Introduce su Nombre");
        String Nombre = sc.next();
        System.out.println("Introduce su Apellido1");
        String Apellido1 = sc.next();
        System.out.println("Introduce su Apellido2");
        String Apellido2 = sc.next();
        System.out.println("Introduce su Nacionalidad");
        String Nacionalidad = sc.next();
        System.out.println("Introduce su Direccion");
        String Direccion = sc.next();



        // 3 MODALIDAD objeto creado con constructor parametrizado metiendole los valores que el usuario ha introducido por teclado (*****EXAMEN*****)
        Viajero viajero3 = new Viajero(DNI, Nombre,Apellido1,Apellido2,Nacionalidad,Direccion);


/******************************************************************MODALIDAD 4****************************************************************************************/


        // 4 MODALIDAD objeto creado con constructor por defecto y luego con los setters vamos dandole valor
        Viajero viajero4 = new Viajero();
        System.out.println("Introduce su DNI");
        viajero4.setDNI(sc.next());

        System.out.println("Introduce su nombre");
        viajero4.setNombre(sc.next());

        System.out.println("Introduzcame su primer apellido");
        viajero4.setApellido1(sc.next());

        System.out.println("Introduzcame su segundo valor");
        viajero4.setApellido2(sc.next());

        System.out.println("Introduzcame su nacionalidad");
        viajero4.setNacionalidad(sc.next());

        System.out.println("Introduzcame su direccion");
        viajero4.setDireccion(sc.next());



/************************************************************************************************************************************************************************/
/***********************************************************************FORMAS DE IMPRIMIR*******************************************************************************/
/************************************************************************************************************************************************************************/


/******************************************************************FORMAS DE IMPRIMIR MODALIDAD 1************************************************************************/

        // Esta manera de imprimir es a lo brusco todoo a null/0

        System.out.println("Informacion del viajero1");
            System.out.println("El DNI del viajero es "+viajero1.getDNI());
            System.out.println("El apellido1 del viajero es "+viajero1.getApellido1());
            System.out.println("El apellido2 del viajero es "+viajero1.getApellido2());
            System.out.println("La nacionalidad del viajero es "+viajero1.getNacionalidad());
            System.out.println("La direccion del viajero es "+viajero1.getDireccion());




/******************************************************************FORMAS DE IMPRIMIR MODALIDAD 2************************************************************************/

        // Esta manera imprime todoo lo que le hemos metido en duro haciendo uso del metodo GetInfo

        System.out.println("¿Cual es el formato de impresion para el viajero2? [Normal] o [Pausado]");
            FormatoViajero formato = FormatoViajero.valueOf(sc.next().toLowerCase());
                viajero2.getInfo(formato);


/******************************************************************FORMAS DE IMPRIMIR MODALIDAD 3************************************************************************/

        // Esta es la manera de impresion de la modalidad 3 usada para examen haciendo uso del metodo GetInfo

        System.out.println("¿Cual es el formato de impresion para el viajero3? [Normal] o [Pausado]");
            formato = FormatoViajero.valueOf(sc.next().toLowerCase());
                viajero3.getInfo(formato);



/******************************************************************FORMAS DE IMPRIMIR MODALIDAD 4************************************************************************/

        // Esta manera imprime los valores que le hemos asignado a los getters y setters, haciendo uso del metodo GetInfo

        System.out.println("¿Cual es el formato de impresion para el viajero4? [Normal] o [Pausado]");
            formato = FormatoViajero.valueOf(sc.next().toLowerCase());
                viajero2.getInfo(formato);



    }
}
