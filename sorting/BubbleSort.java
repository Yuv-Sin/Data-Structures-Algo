package sorting;

public class BubbleSort {

    private static int[] sort(int arr[]){
        for(int i=0; i< arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
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
