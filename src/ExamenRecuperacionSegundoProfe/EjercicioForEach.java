package ExamenRecuperacionSegundoProfe;

public class EjercicioForEach {
    public static void main(String[] args) {
        int[] array ={1,2,3,4,5,6};

          /*  for (int i : array) {
               System.out.println(array[i]);
            }*/
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        for (int j:array){
            System.out.println(array[j]);
        }

    }
}
