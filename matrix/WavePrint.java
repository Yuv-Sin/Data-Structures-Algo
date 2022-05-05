package matrix;

public class WavePrint {

    public static void printWave(int[][] matrix){
        for(int i=0; i<matrix.length; i++){
            if(i%2!=0){
                for(int j=matrix[i].length-1; j>=0; j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            else{
                for(int j=0; j<matrix[i].length; j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println("");
        }
    }

    public static void main(String ar[]){
        int[][] matrix = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
                {41,42,43,44}
        };
        printWave(matrix);
    }
}
