package recursion;

public class PatternPrint {
    /**
     *Prints the following pattern
     * N
     * NN
     * NNN
     * NNNN
     * -----------N Upto N times
     */
    private static void printPattern(int N, int row, int col){
        if(row>N){
            return;
        }
        if(col>row){
            System.out.println();
            printPattern(N,row+1,1);
            return;
        }
        System.out.print("*");
        printPattern(N,row,col+1);
    }
    public static void main(String ar[]){
        printPattern(5,1,1);
    }
}
