package sesion1411;

public class UsoDeArrayEqual2 {
    public static void main(String[] args) {

        int[] numeros1 = {121,12,1,55};
        int[] numeros2 = {121,12,1,55};
        int[] numeros3 = {12,1,55};

        System.out.println("¿Son iguales numero1 y numero2? ---> "+java.util.Arrays.equals(numeros1,numeros2));
        System.out.println("¿Son iguales numero1 y numero3? ---> "+java.util.Arrays.equals(numeros1,numeros3));
    }
}
