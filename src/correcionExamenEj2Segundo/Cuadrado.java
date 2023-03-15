package correcionExamenEj2Segundo;

import java.util.Scanner;

public class Cuadrado extends Figura implements IAcciones {

    private int lado;


    public Cuadrado(){
    }


    public Cuadrado(int lado) throws ExcepcionCuadrado {

        if (lado <= 0){
            throw new ExcepcionCuadrado("Un lado no puede ser igual o menor que '0'");
        }
        this.lado = lado;
    }


    public int getLado() {
        return lado;
    }

    public void setLado(int lado) throws ExcepcionCuadrado {
        if (lado <= 0){
            throw new ExcepcionCuadrado("Un lado no puede ser igual o menor que '0'");
        }
        this.lado = lado;
    }




    public double volumen() {
        return Math.pow(lado,3);
    }


    public double area() {
        return lado * lado;
    }


    public int dibujar() {



        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {
                if (i == 0 || i == lado - 1 || j == 0 || j == lado - 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        return lado;

    }



}

