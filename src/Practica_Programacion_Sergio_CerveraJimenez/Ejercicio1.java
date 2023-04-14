package Practica_Programacion_Sergio_CerveraJimenez;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        float[]temperaturas = new float[12];
        int opcion=0;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Que opcion deseas realizar?: ");
            System.out.println(" ");
            System.out.println("(0) - Salir.");
            System.out.println("(1) - Inicializar un array que recoja la temperatura media de cada mes del año.");
            System.out.println("(2) - Mostrar el mes (enumerado) con mayor temperatura.");
            System.out.println("(3) - Mostrar el mes (enumerado) con menor temperatura.");
            System.out.println("(4) - Imprimir la temperatura del mes introducido (de 0 a 11) por teclado.");
            System.out.println("(5) - Sacar temperatura media de los meses de verano.");
            System.out.println("(6) - Sacar temperatura media de los meses de invierno.");
            System.out.println("(7) - Comparar si temperatura de dos meses (enumerados) introducidos son iguales.");
            opcion = sc.nextInt();



            switch (opcion) {
                case 0: System.out.println("Saliendo del programa...");
                    break;

                case 1: temperaturas = inicializarArray(temperaturas);
                    System.out.println("Array creado correctamente...");
                    break;

                case 2: System.out.println("La mayor temperatura del año ha sido en "+mayorTemperatura(temperaturas));
                                                                                                                        System.out.println(" ");
                    break;

                case 3: System.out.println("La menor temperatura del año ha sido en "+menorTemperatura(temperaturas));
                                                                                                                        System.out.println(" ");
                    break;

                case 4: System.out.println("Escribe el mes del que quieres sacar la temperatura: ");
                    int mes = sc.nextInt();
                    System.out.println("La temperatura fue de "+sacarTemperatura(mes, temperaturas));
                    break;

                case 5: System.out.println("La media de temperaturas de los meses de verano es: "+temperaturaMediaVerano(temperaturas));
                    break;

                case 6: System.out.println("La media de temperaturas de los meses de invierno es: "+temperaturaMediaInvierno(temperaturas));
                    break;

                case 7:
                    System.out.println("Introduce el primer mes a comparar: ");
                        meses mes2 = meses.valueOf(sc.next().toUpperCase());
                    System.out.println("Introduce el segundo mes a comparar");
                        meses mes1 = meses.valueOf(sc.next().toUpperCase());
                    if (compararTemperaturas(mes1, mes2, temperaturas)){
                        System.out.println("Los meses mencionados tienen la misma temperatura.");
                    }else{
                        System.out.println("Los meses mencionados tienen una temperatura distinta.");
                    }
                    break;

                default: System.out.println("El numero introducido no es valido.");
            }
        } while (opcion != 0);
    }

    // METODO 1 --> INICIALIZACION DEL ARRAY
    public static float[] inicializarArray(float[] temperaturas){

        temperaturas=new float[12];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<12; i++){
            System.out.println("Introduce la temperatura media de "+sacar_mes(i));
            temperaturas[i]=sc.nextFloat();
        }
        return temperaturas;
    }

    // METODO 2 --> SACAR LA MAYOR TEMPERATURA DE TODOS LOS MESES
    public static meses mayorTemperatura(float[] temperaturas){
        float mayorTemp = temperaturas[0];
        int mes=0;
        for(int i=0; i<12; i++){
            if(mayorTemp < temperaturas[i]){
                mayorTemp = temperaturas[i];
                mes=i;
            }
        }
        return sacar_mes(mes);
    }

    // METODO 3 --> SACAR LA MENOR TEMPERATURA DE TODOS LOS MESES
    public static meses menorTemperatura(float[] temperaturas){
        float menorTemp = temperaturas[0];
        int mes = 0;
        for(int i=0; i<12; i++){
            if(menorTemp > temperaturas[i]){
                menorTemp = temperaturas[i];
                mes=i;
            }
        }
        return sacar_mes(mes);
    }

    // METODO 4 --> SACAR LA TEMPERATURA DEL MES A ELEGIR
    public static float sacarTemperatura(int mes, float[] temperaturas){
        return temperaturas[mes];
    }

    // METODO 5 --> SACAR LA TEMPERATURA MEDIA DE LOS MESES DE VERANO
    public static float temperaturaMediaVerano(float[]temperaturas){
        return (temperaturas[5] + temperaturas [6] + temperaturas [7])/3;
    }

    // METODO 6 --> SACAR LA TEMPERATURA MEDIA DE LOS MESES DE INVIERNO
    public static float temperaturaMediaInvierno(float[]temperaturas){
        return (temperaturas[0] + temperaturas[1] + temperaturas[2])/3;
    }

    // METODO 7 --> COMPARAR LA TEMPERATURA DE DOS MESES Y VER SI SON IGUALES O NO
    public static boolean compararTemperaturas(meses mes1, meses mes2, float[]temperaturas){
        return temperaturas[sacar_indice(mes1)] == temperaturas[sacar_indice(mes2)];
    }






    // METODOS AUXILIARES
    public static int sacar_indice (meses mes){
        int indice = -1;
        for(int i=0; i<meses.values().length; i++){
            if(mes.equals(meses.values()[i])){
                indice = i;
            }
        }
        return indice;
    }
    public static meses sacar_mes (int i){
        return meses.values()[i];
    }





}
