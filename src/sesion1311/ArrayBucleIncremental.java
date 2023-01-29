package sesion1311;

public class ArrayBucleIncremental {
    public static void main(String[] args) {

        int [] edades2 = new int[5];
        for (int i=0; i<5; i++)
        {
            edades2[i]=i;
        }
        System.out.println("Bucle incremental");
        for (int j=0; j< edades2.length; j++)
        {
            System.out.println(edades2[j]);
        }
    }
}
