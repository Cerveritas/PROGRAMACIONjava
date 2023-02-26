package bbbEjercico2PracticaProgramacionSegundo;

import java.util.Scanner;

public class UsoFigura {
    public static void main(String[] args) {


    try {
        Cuadrado cuadrado = new Cuadrado();
        System.out.println("El area de tu cuadrado en centimetros es "+cuadrado.area()+" cm");
        System.out.println(cuadrado.dibujar(cuadrado.getLado()));
    }
    catch (ExepcionCuadrado e){
        System.out.println(e.getMessage());
    }





    }
}
