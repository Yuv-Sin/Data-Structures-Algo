package recursion;

public class Factorial {

    public static int fact(int n){
        if(n==1)
            return 1;
        n = n*fact(n-1);
        return n;
    }

    public static void main(String ar[]){
        System.out.print("Factorial of number n is: "+fact(6)); // it returns zero for large numbers
    }
}
