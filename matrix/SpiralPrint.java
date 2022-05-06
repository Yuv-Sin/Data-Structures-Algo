package matrix;

public class SpiralPrint {

    public static void printSpiral(int[][] matrix){
        //Take variables to point at various position of matrix
        int top=0;
        int bottom = matrix.length-1;
        int left = 0;
        int right = matrix[top].length-1;

        int dir = 0; // notifies the direction of traversing
        int count = (bottom+1) * (right+1); // keeps the count of traversed indexes

        dir=1; // from left to right

        while(left<=right && top<=bottom){
            if(count>0 && dir==1){
                for(int i=top; i<=right; i++){
                    System.out.print(matrix[top][i]+" ");
                    count--;
                }
                dir=2; // from top to bottom
                top++;
            }
            if(count>0 && dir==2){
                for(int i=top; i<=bottom; i++){
                    System.out.print(matrix[i][right]+" ");
                    count--;
                }
                dir=3; // from right to left
                right--;
            }
            if(count>0 && dir==3){
                for(int i=right; i>=left; i--){
                    System.out.print(matrix[bottom][i]+" ");
                    count--;
                }
                dir = 4; // from bottom to top
                bottom--;
            }
            if(count>0 && dir==4){
                for(int i=bottom; i>=top; i--){
                    System.out.print(matrix[i][left]+" ");
                    count--;
                }
                dir = 1; // from left to right with new top and bottom
                left++;
            }
        }
        System.out.print("END");
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
