package sorting;

public class SelectionSort {

    public static int[] sort(int arr[]){
        for(int counter=0; counter<arr.length-1; counter++){
            int min = counter;
            for(int j=counter+1; j<=arr.length-1; j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
        }
        return arr;
    }

    public static void main(String ar[]){
        int arr[] = {88,68,101,45,20,99,120};
        int[] sortedArray = sort(arr);
        for(int val:sortedArray){
            System.out.print(val +" ");
        }
    }
}
