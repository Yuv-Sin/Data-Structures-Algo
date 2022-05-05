package sorting;

public class InsertionSort {

    private static int[] sort(int arr[]){
        for(int counter=1; counter< arr.length-1; counter++){
            int val = arr[counter];
            int j = counter-1;
            while(j >=0 && arr[j]>val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        return arr;
    }

    public static void main(String ar[]){
        int arr[] = {88,68,101,45,20,99,121};
        int[] sortedArray = sort(arr);
        for(int val:sortedArray){
            System.out.print(val +" ");
        }
    }
}
