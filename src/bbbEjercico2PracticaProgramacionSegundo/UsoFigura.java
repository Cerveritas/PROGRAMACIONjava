package bbbEjercico2PracticaProgramacionSegundo;

import java.util.Scanner;

public class UsoFigura {
    public static void main(String[] args) {


        try {
            Cuadrado cuadrado = new Cuadrado();

            System.out.println(cuadrado.dibujar(cuadrado.getLado()));

            System.out.println("El area de tu cuadrado es de "+cuadrado.area());
            System.out.println("El volumen de tu cuadrado es de "+cuadrado.volumen());
        }
        catch (ExepcionCuadrado e){
            System.out.println(e.getMessage());
        }
    }
}
