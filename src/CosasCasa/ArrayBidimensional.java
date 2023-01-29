package CosasCasa;

public class ArrayBidimensional {
    public static void main(String[] args) {

        int [][] matrix = new int[4][5];

        matrix [0][0]=1;
        matrix [0][1]=2;
        matrix [0][2]=3;
        matrix [0][3]=4;
        matrix [0][4]=5;

        matrix [1][0]=6;
        matrix [1][1]=7;
        matrix [1][2]=8;
        matrix [1][3]=9;
        matrix [1][4]=10;

        matrix [2][0]=11;
        matrix [2][1]=12;
        matrix [2][2]=13;
        matrix [2][3]=14;
        matrix [2][4]=15;

        matrix [3][0]=16;
        matrix [3][1]=17;
        matrix [3][2]=18;
        matrix [3][3]=19;
        matrix [3][4]=20;

        for (int i=0; i<4; i++){
            for (int j=0; j<5; j++){
                System.out.println(matrix[i][j]);
            }
        }




    }
}
