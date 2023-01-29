package sesion1811;

public class ArrayArgumento {
    public static void main(String[] args) {

        int [] arrayorigen = {1,2,3,4,5};
        int longitud = calcular_longitud(arrayorigen);
        System.out.println("La longitud del array es "+longitud);
    }
    public static int calcular_longitud(int[] a) //la a se puede sustituir por arrayorigen y tendra la misma funcionalidad
    {
        int resultado;
        resultado = a.length; //a a se puede sustituir por arrayorigen y tendra la misma funcionalidad
        return resultado;
    }
}
