package sesion1710;

public class Ej4Bucles {
    public static void main(String[] args) {

        System.out.println("\033[36m A continuacion mostraremos los numeros del 320 al 160");
        System.out.println(" contando de 20 en 20 hacia atras con el bucle FOR.");
        System.out.println("********************************************************");

        for (int i=320; i>=160; i=i-20)
        {
            System.out.println("\033[35m" +i);
        }


    }
}
