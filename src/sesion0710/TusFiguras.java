package sesion0710;

import java.util.Scanner;

/* Este programa trata de que vamos a dejar que el usuario decida el personaje a escoger.
*  Tendra 3 opciones = 3 numeros.
*  1 para Steve, 2 para Mario y 3 Para tu abuela.
*  Una vez elijamos saldra una imagen de nuestro personaje escogido.
*  Si metemos un numero fuera del rango indicado saldra una mensaje de error.
 */

public class TusFiguras {

    public static void main(String[] args) {

        // declaramos y inicializamos la variable numero
        int numero =0;

        // solicitud y lectura del numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un numero indicado para visualizar la figura elegida;");
        System.out.println("Pulse 1 para seleccionar un CUADRADO azul");
        System.out.println("Pulse 2 para seleccionar un TRIANGULO morado");
        System.out.println("Pulse 3 para seleccionar un  ROMBO verde");
        numero = sc.nextInt();

        // determina la figura
        if (numero == 1)
        {
            System.out.print("\033[36m  ██████████  \n");
            System.out.print("\033[36m  █        █  \n");
            System.out.print("\033[36m  █        █  \n");
            System.out.print("\033[36m  ██████████  \n");
        }
        else if (numero == 2)
        {
            System.out.print("\033[35m      ██      \n");
            System.out.print("\033[35m     █  █     \n");
            System.out.print("\033[35m    █    █    \n");
            System.out.print("\033[35m   █      █   \n");
            System.out.print("\033[35m  █        █  \n");
            System.out.print("\033[35m  ██████████  \n");
        }
        else if (numero == 3)
        {
            System.out.print("\033[32m      ██      \n");
            System.out.print("\033[32m     █  █     \n");
            System.out.print("\033[32m    █    █    \n");
            System.out.print("\033[32m   █      █   \n");
            System.out.print("\033[32m   █      █   \n");
            System.out.print("\033[32m    █    █    \n");
            System.out.print("\033[32m     █  █     \n");
            System.out.print("\033[32m      ██      \n");
        }
        // en el caso que no metamos un numero pedido (1, 2, 3), dara error.
        else
        {
            System.out.println("No has introducido un numero correcto, intentelo de nuevo");
        }
    }
}
