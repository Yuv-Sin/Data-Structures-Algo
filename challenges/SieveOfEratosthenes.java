package challenges;

import java.util.Arrays;

//Helps to find prime number in (n*log*logn) Complexity
public class SieveOfEratosthenes {

    private static void printPrimes(int n){

        boolean[] primes = new boolean[n+1];
        Arrays.fill(primes,true);
        primes[0]=primes[1]=false;

        for(int table=2; table*table<=n; table++){
            if(primes[table]) {
                for (int multi = 2; table * multi <= n; multi++){
                    primes[multi * table] = false;
                }
            }
        }
        for(int i=0; i<primes.length; i++){
            if(primes[i]){
                System.out.print(i+" ");
            }
        }
    }

    public static void main(String ar[]){
        printPrimes(25);
    }
}
