package ExamenRecuperacionSegundo2;
import java.util.Scanner;
public class main {
    public static void main(String[] args) throws longitudIncorrecta, contraseñaInvalida {

        // preguntar el tamaño del array que almacenará los objetos de la clase password

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el tamaño que quiere que tenga el array de contraseñas");
        int tamaño  = sc.nextInt();

        boolean[] fortaleza_contraseñas =  new boolean[tamaño];
        Password[] listado_contraseña = new Password[tamaño];
        for (int i = 0; i < listado_contraseña.length; i++){
            System.out.println("Introduzca la longitud que tendra la contraseña ");
            int longi = sc.nextInt();
            listado_contraseña[i] = new Password(longi);
            fortaleza_contraseñas[i] = listado_contraseña[i].esFuerte();
            System.out.println("Contraseña generada: "+listado_contraseña[i].getContraseña()+" Fortaleza de la contraseña: " +fortaleza_contraseñas[i]);
        }






















    }
}
