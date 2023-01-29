package sesion1011;

import java.util.Scanner;

public class ArrayBidimensional {
    public static void main(String[] args) {

        //Arrays bidimensional de las 3 formas existentes.
        //Tabla de 2x2 (2 filas y 2 columnas).

        //PRIMERA forma.
        int [] [] notas1 = new int[2][2];

        notas1 [0][0] = 3;
        notas1 [0][1] = 4;
        notas1 [1][0] = 7;
        notas1 [1][1] = 9;
        System.out.println(notas1[0][0]);













        //SEGUNDA forma.
        int [][] nota2 = {{1,2},{3,4}};
        System.out.println(nota2[1][1]);















        //TERCERA forma.
        Scanner sc = new Scanner(System.in);
        int [] [] notas3 = new int[2][2];
        for (int i=0; i<notas3.length; i++)
        {
            for (int j=0; j< notas3.length; j++)
            {
                System.out.println("Introduce una nota");
                notas3[i][j] = sc.nextInt();
            }
        }
        System.out.println(notas3[0][1]);
    }
}
