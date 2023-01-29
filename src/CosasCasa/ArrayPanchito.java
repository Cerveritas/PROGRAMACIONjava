package CosasCasa;

import java.util.Scanner;

public class ArrayPanchito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaprecios=0;


        int [] precios = new int[3];

            //for (int i=0; i<precios.length; i++) {     EL USO DEL FOR ES SOLO SI PIDO UNA VEZ LO MISMO, NO 3 DE DISTINTA MANERA

                System.out.println("Dame el primer precio: ");
                precios[0] = sc.nextInt();
                System.out.println("Dame el segundo precio");
                precios[1]=sc.nextInt();
                System.out.println("Dame el tercer valor");
                precios[2]=sc.nextInt();
            //}

            System.out.println(" ");
            for (int i=0; i<precios.length; i++){
                System.out.println("Los precios metidos dentro del array son: "+precios[i]);
            }

            System.out.println(" ");
            for (int i=0; i<precios.length; i++){
                sumaprecios=sumaprecios+precios[i];
            }
                System.out.println("La suma total de los precios es: "+sumaprecios);





    }
}
