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
            case 1: System.out.println("es "+ DiasSemana.LUNES);break;
            case 2: System.out.println("es "+ DiasSemana.MARTES);break;
            case 3: System.out.println("es "+ DiasSemana.MIERCOLES);break;
            case 4: System.out.println("es "+ DiasSemana.JUEVES);break;
            case 5: System.out.println("es "+ DiasSemana.VIERNES);break;
            case 6: System.out.println("es "+ DiasSemana.SABADO);break;
            case 7: System.out.println("es "+ DiasSemana.DOMINGO);break;
            default:System.out.println("No se ha introducido el numero correcto");
        }



    }
}
