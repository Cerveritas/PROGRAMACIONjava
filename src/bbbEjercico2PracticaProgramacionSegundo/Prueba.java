package bbbEjercico2PracticaProgramacionSegundo;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {

        int lados = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos lados deseas tener el cuadrado");
        lados = sc.nextInt();

        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if (i == 0 || i == lados - 1 || j == 0 || j == lados - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    }

