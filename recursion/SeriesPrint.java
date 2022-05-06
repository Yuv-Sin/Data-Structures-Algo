package recursion;


public class SeriesPrint {

    public static void printSeriesDecInc(int n){
        //Prints the following Series  n -- 5 4 3 2 1 1 2 3 4 5 -- n
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printSeriesDecInc(n-1);
        System.out.print(n+" ");
    }

    public static void printSeriesOddEvenDecInc(int n){
        //Prints the following Series  n -- 5 3 1 2 4 -- n
        if(n==0){
            return;
        }
        if(n%2==1)
            System.out.print(n+" ");
        printSeriesOddEvenDecInc(n-1);
        if(n%2==0)
            System.out.print(n+" ");
    }

    public static void main(String ar[]){
        //printSeriesDecInc(5);
        printSeriesOddEvenDecInc(5);
    }
}
