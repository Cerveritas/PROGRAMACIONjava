package sesion1411;

public class UsoDeCopyOfyCopyOfRange {
    public static void main(String[] args) {



        int [] numeros = {1,2,3,4,5};
            System.out.println("Array numeros "+java.util.Arrays.toString(numeros));

        int [] listanumeros2 = java.util.Arrays.copyOf(numeros, numeros.length);
            System.out.println("Array listanumeros2 "+java.util.Arrays.toString(listanumeros2));

        int [] listanumeros3 = java.util.Arrays.copyOf(numeros, numeros.length);
            System.out.println("Array listanumeros3 "+java.util.Arrays.toString(listanumeros3));

        int [] listanumeros4 = java.util.Arrays.copyOfRange(numeros, 0, numeros.length-1);
        System.out.println("Array listanumero4 "+java.util.Arrays.toString(listanumeros4));

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");


        String [] alumnos = {"Sergio","Nahiara","JesuCristo"};
        System.out.println("Nombres "+java.util.Arrays.toString(alumnos));

        String [] alumnos2 = java.util.Arrays.copyOf(alumnos, alumnos.length);
        System.out.println("Nombres2 "+java.util.Arrays.toString(alumnos2));





    }
}
