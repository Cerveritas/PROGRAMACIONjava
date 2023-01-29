package sesion0911;

import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {

        /* Declaracion del array
        *  Este array almacenara las notas de las asignaturas del primer trimestre de DAM
        *  BBDD, ED, Programacion; LM, Sistemas
         */

        //forma 1
        int [] notas_1ertrimestre = new int [5];

        notas_1ertrimestre[0]=7;
        notas_1ertrimestre[1]=8;
        notas_1ertrimestre[2]=6;
        notas_1ertrimestre[3]=3;
        notas_1ertrimestre[4]=4;

        for (int i=0; i<5; i++) //el uso de este for es para imprimir
        {
            System.out.println(notas_1ertrimestre[i]);
        }



System.out.println("FORMA 2");


        //forma 2
        int [] notas_2trimestre = {7,8,6,3,5};

        for (int i=0; i<5; i++)  //el uso de este for es para imprimir
        {
            System.out.println(notas_2trimestre[i]);
        }
        System.out.println("Impresion de array con foreach");
        for (int elemento:notas_2trimestre)
        {
            System.out.println(elemento);
        }














        //forma 3
        int [] notas_3trimestre = new int[4];
        Scanner sc = new Scanner(System.in);

            for (int i =0; i<=notas_3trimestre.length; i++)
            {
                System.out.println("Introduzcame su nota por favor");
                notas_3trimestre[i] = sc.nextInt();

            }











    }
}
