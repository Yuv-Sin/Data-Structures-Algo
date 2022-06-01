package challenges;

import java.util.Scanner;

//Take as input N, the size of array. Take N more inputs and store that in an array. Take as input M, a number.
// Write a recursive function which returns the last index at which M is found in the array and -1
// if M is not found anywhere. Print the value returned.
public class FindLastIndex {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int arr[] = new int[N];
        int i=0;
        while(N-->0){
            arr[i++] = scan.nextInt();
        }
        int M = scan.nextInt();
        int lastIndex = -1;
        System.out.print(findLastIndex(arr,M,0,lastIndex));
    }
    static int findLastIndex(int[] arr, int M, int index, int lastIndex){
        if(index==arr.length){
            return lastIndex;
        }
        if(arr[index]==M){
            lastIndex = index;
        }
        index++;
        return findLastIndex(arr,M,index,lastIndex);
    }
}
