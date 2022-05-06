package recursion;

public class Fibonacci {
    // To print the value of the Nth Fibonacci term
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }

    public static void main(String ar[]){
        System.out.print(fib(7));
    }
}
