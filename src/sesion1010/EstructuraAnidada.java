package sesion1010;

import java.util.Scanner;

/* programa que dado una edad nos indica en que etapa educativa estamos
* Educacion infantil 0-5 años
* Educacion Primaria 6-12 años
* Educacion Secundaria 13-17 años
* Universidad y FP de 18 para adelante
 */

public class EstructuraAnidada {
    public static void main(String[] args) {

        // declaramos e inicializamos la variable edad
        int edad =0;

       // solicitud y lectura de la edad
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        edad = sc.nextInt();

        // determinar a que etapa educativa estoy mediante el uso del if anidados
        if (edad>=0 && edad <=5)
        {
            System.out.println("Educacion Infantil");
        }
        else if (edad >=6 && edad <=12)
        {
            System.out.println("Educacion Primaria");
        }
        else if (edad >=13 && edad <=17)
        {
            System.out.println("Educacion Secundaria");
        }
        else
        {
            System.out.println("Universidad y FP");
        }
    }
}
