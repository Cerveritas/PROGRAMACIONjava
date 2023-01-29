package sesion2411;

import java.util.Scanner;

public class UsoEnumeradoDiasSemana {
    public static void main(String[] args) {

        int valor=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un valor del 1 al 7");
        valor = sc.nextInt();

        DiasSemana dia = null;
        switch (valor)
        {
            case 1: System.out.println("es "+dia.LUNES);break;
            case 2: System.out.println("es "+dia.MARTES);break;
            case 3: System.out.println("es "+dia.MIERCOLES);break;
            case 4: System.out.println("es "+dia.JUEVES);break;
            case 5: System.out.println("es "+dia.VIERNES);break;
            case 6: System.out.println("es "+dia.SABADO);break;
            case 7: System.out.println("es "+dia.DOMINGO);break;
            default:System.out.println("No se ha introducido el numero correcto");
        }



    }
}
