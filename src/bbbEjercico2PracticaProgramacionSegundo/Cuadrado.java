package bbbEjercico2PracticaProgramacionSegundo;

import java.util.Scanner;

public class Cuadrado extends Figura implements iAcciones {
    Scanner sc = new Scanner(System.in);

    // ATRIBUTOS

    private int lado;



    // CONSTRUCTORES

    public Cuadrado(){

    }


    public Cuadrado(int lado) {
        this.lado = lado;
    }




    // GETTERS


    public int getLado() {
        return lado;
    }


    // SETTERS

    public void setLado(int lado) {
        this.lado = lado;
    }



    // METODOS

    @Override
    public int dibujar(int lados) {

        System.out.println("De que tamaño quieres tu cuadrado");
        lados = sc.nextInt();

        for (int i = 0; i < lados; i++) {
            for (int j = 0; j < lados; j++) {
                if (i == 0 || i == lados - 1 || j == 0 || j == lados - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        return lados;
    }



    public int area(){
        lado=0;
        System.out.println("Cuanto mide tu lado del cuadrado: ");
        lado = sc.nextInt();

        lado = lado * lado;

        return lado;


    }






}
