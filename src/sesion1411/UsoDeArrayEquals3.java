package sesion1411;

import java.util.Arrays;

public class UsoDeArrayEquals3 {
    public static void main(String[] args) {

        int[] numero1 = {1,2,3,4};
        int[] numero2 = {1,2,3};

        if (Arrays.equals(numero1,numero2))
        {
            System.out.println("Son iguales");
        }
        else
        {
            System.out.println("No son iguales");
        }
    }
}
