package sesion1311;

public class ArrayFinProfe {
    public static void main(String[] args) {
        // array mono
        int [] lista ={1,2,3,4,5,6};
        for (int i=0;i<lista.length;i++){
            if ( i==0) {
                System.out.print("{"+lista[i]);
            }
            else if (i==lista.length-1){
                System.out.print(","+lista[i]+"}");
                System.out.println("");
            }
            else{
                System.out.print(","+lista[i]);
            }
        }

        //array bidimensional
        int [][] lista2= {{1,2,3},{4,5,6}};

        for (int i=0;i<lista2.length;i++){
            System.out.println("");
            for (int j=0;j<lista2[i].length;j++) {
                if (j == 0) {
                    System.out.print( "("+lista2[i][j]);
                }
                else if (j==lista2[i].length-1){
                    System.out.print(","+lista[i]+")");

                }
                else {
                    System.out.print("," + lista2[i][j]);
                }
            }
        }

    }
}
