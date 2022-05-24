package sorting;

public class QuickSort {
    private static void quickSort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        int pivot = arr[mid];
        int left  = low;
        int right = high;

        while (left<=right){
            while(arr[left]<pivot){
                left++;
            }
            while (arr[right]>pivot){
                right--;
            }
            if(left<=right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        //smaller cases
        quickSort(arr,low,right);
        quickSort(arr,left,high);
    }
    public static void main(String ar[]){
        int arr[] = {40,20,90,70,10,80,60,50};
        quickSort(arr,0,arr.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
