package matrix;

public class SpiralPrint {

    public static void printSpiral(int[][] matrix){
        for(int j=0; j<matrix[0].length; j++){
            System.out.print(matrix[0][j]+ " ");
        }
    }

    public static void main(String ar[]){
        int[][] matrix = {
                {11,12,13,14},
                {21,22,23,24},
                {31,32,33,34},
                {41,42,43,44}
        };
        printSpiral(matrix);
    }
}
