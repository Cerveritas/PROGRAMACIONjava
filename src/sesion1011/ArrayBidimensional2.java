package sesion1011;

import java.util.Scanner;

public class ArrayBidimensional2 {
    public static void main(String[] args) {

        //Arrays bidimensional de las 3 formas existentes.
        //Tabla de 2x3 (2 filas y 3 columnas).

        //Primera forma.
        int [][] notas1 = new int[2][3];

        notas1 [0][0] = 3;
        notas1 [0][1] = 4;
        notas1 [0][2] = 8;
        notas1 [1][0] = 1;
        notas1 [1][1] = 10;
        notas1 [1][2] = 7;
        System.out.println(notas1 [1][1]);












        //Segunda forma.
        int [][] notas2 = {{1,2,3},{4,5,5}};
        System.out.println(notas2[1][0]);















        //Tercera forma.
        Scanner sc = new Scanner(System.in);
        int [][] notas3 = new int[2][3];
        for (int i=0; i<notas3.length; i++)
        {
            for (int j=0; j<notas3[i].length; j++)
            {
                System.out.println("Introduzca la nota");
                notas3[i][j] = sc.nextInt();
            }
        }
        for (int i=0; i<notas3.length; i++)
        {
            System.out.print("\n");
            for (int j=0; j<notas3[i].length; j++)
            {
                System.out.print(notas3[i][j]);
            }
        }
    }
}
