package sesion1411;

public class UsoDeArraySort {
    public static void main(String[] args) {

        int[] numeros = {121,12,4,55};
        java.util.Arrays.sort(numeros);
        System.out.println("Array de numeros ordenados "+java.util.Arrays.toString(numeros));

        String[] nombres = {"Sofia","Sergio","Nahiara"};
        java.util.Arrays.sort(nombres);
        System.out.println("Array de strings ordenados "+java.util.Arrays.toString(nombres));
    }
}
