package EjerciciosMetodos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        System.out.println("A continuacion elegiras que quieres calcular.");

        String figura="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige la figura que quieres calcular: ");
                                                                                                                        System.out.println(" ");
        System.out.println("Cuadrado");
        System.out.println("Circulo");
        System.out.println("Triangulo");
        figura=sc.next().toUpperCase();

        double area=0;
        switch (figura)
        {
            case "CIRCULO":
                System.out.println("Introduce el radio: ");
                double radio = sc.nextDouble();
                area = areaCirculo(radio);
                imprimir(area,figura);
                break;

            case "TRIANGULO":
                System.out.println("Introduce la base: ");
                double base = sc.nextDouble();
                System.out.println("Introduce la altura: ");
                double altura = sc.nextDouble();
                area = areaTriangulo(base,altura);
                imprimir(area,figura);
                break;

            case "CUADRADO":
                System.out.println("Introduce el lado: ");
                double lado = sc.nextDouble();
                area = areaCuadrado(lado);
                imprimir(area,figura);
                break;

            default:System.out.println("Figura introducida incorrecta");break;
        }


    }

    private static double areaCuadrado(double lado) {
        double area=0;
        area=(lado*lado);
        return area;
    }
    private static double areaTriangulo(double base, double altura) {
        double area=0;
        area=(base*altura)/2;
        return area;

    }
    private static double areaCirculo(double radio) {
        double area=0;
        area=(Math.pow(radio,2))*Math.PI;
        return area;

    }
    private static void imprimir(double area, String figura) {
        System.out.println("El area de "+figura+" es "+area);
    }
}
