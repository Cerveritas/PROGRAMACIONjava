package Ejercicio2PracticaProgramacionSegundo;

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
    public int dibujar(int lados) throws ExepcionCuadrado {
                                                                                                                        System.out.println(" ");
        System.out.println("A continuacion para empezar este apartado, vamos a empezar con la creacion de un \n" +
                            "cuadrado, para esto necesito que me digas el tamaño del cuadrado. \n" +
                            "Este cuadrado se formara con los simbolos '*', eso significa que segun el numero \n" +
                            "que metas el cuadrado tendras mas * o menos, eso significa que sera mas grande o mas pequeño.");

                                                                                                                        System.out.println(" ");

        System.out.println("De que tamaño quieres tu cuadrado");
        lados = sc.nextInt();


        if (lados <= 0){
            throw new ExepcionCuadrado("Un lado de cuadrado no puede ser menor o igual a 0");
        }

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



    public int area() {
        Scanner sc = new Scanner(System.in);
        lado=0;
                                                                                                                        System.out.println(" ");
        System.out.println("A continuacion vamos a realizar el calculo del area de tu cuadrado \n" +
                            "para esto es necesario saber cuanto mide tu cuadrado, asique...");
                                                                                                                        System.out.println(" ");
        System.out.println("Cuanto mide tu lado del cuadrado: ");
        lado = sc.nextInt();

        lado = (lado * lado);

        return lado;
    }


    public int volumen(){
        lado = 0;
                                                                                                                        System.out.println(" ");
        System.out.println("Para calcular el volumen necesito que se vuelva a introducir cuanto mide tu lado");

                                                                                                                        System.out.println(" ");
        lado = sc.nextInt();
        lado = (lado * lado) * lado;

        return lado;
    }
}





