package sesion1311;

public class ArrayBucleEach {
    public static void main(String[] args) {

        int [ ] edades2 = new int[5];
        for (int i=0; i<5; i++)
        {
            edades2[i]=i;
        }
        System.out.println("Bucle each");
        for (int elemento: edades2)
        {
            System.out.println(elemento);
        }

    }
}
