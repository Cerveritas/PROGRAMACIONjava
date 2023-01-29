package submetodos;

import java.util.Scanner;

public class ComprensionMetodos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduzcame el numero 1");
        int num1= sc.nextInt();
        System.out.println("introduzcame el numero 2");
        int num2= sc.nextInt();

          int result = suma(num1,num2);
          System.out.println("El resultado es"+result);


    }

    public static int suma(int x , int y ){

        int resultado;
        resultado=x+y;
        return resultado;
    }
}
