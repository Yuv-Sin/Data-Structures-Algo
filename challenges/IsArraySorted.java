package challenges;

import java.util.Scanner;

//Take as input N, the size of an integer array. Take one more input, which is a list of N integers
// separated by a space, and store that in an array. Write a recursive function which prints true
// if the array is sorted in Increasing Order, and false otherwise.
public class IsArraySorted {
    public static void main(String args[]) {
        // Your Code Here
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        int i=0;
        while(N-->0){
            arr[i++] = scan.nextInt();
        }
        System.out.print(isArraySorted(arr,0));
    }

    static boolean isArraySorted(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        if(arr[index]>arr[index+1]){
            return false;
        }
        index++;
        return isArraySorted(arr,index);
    }
}
