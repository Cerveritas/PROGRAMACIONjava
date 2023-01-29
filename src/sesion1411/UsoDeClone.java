package sesion1411;

public class UsoDeClone {
    public static void main(String[] args) {

        int [] numeros = {1,2,3,4,5};
        int [] lista_numeros2 = {1,2,3,4,5};

        System.out.println("Array numeros "+java.util.Arrays.toString(numeros));

        lista_numeros2 = numeros.clone();
        System.out.println("Array lista numero "+java.util.Arrays.toString(lista_numeros2));
    }
}
