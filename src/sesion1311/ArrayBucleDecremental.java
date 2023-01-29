package sesion1311;

public class ArrayBucleDecremental {
    public static void main(String[] args) {

        int [] edades2 = new int[5];
        for (int i=0; i<5; i++)
        {
            edades2[i]=i;
        }
        System.out.println("Bucle decremental");
        for (int k=edades2.length; k>0; k--)
        {
            System.out.println(edades2[k-1]);
        }
    }
}
