package recursion;

public class BubbleSort {
    private static void bubbleSort(int[] arr, int si, int li){
        if(li==0){
            return;
        }
        if(si==li){
            bubbleSort(arr,0,li-1);
            return;
        }
        if(arr[si]>arr[si+1]){
            int temp = arr[si];
            arr[si]=arr[si+1];
            arr[si+1]= temp;
        }
        bubbleSort(arr,si+1,li);
    }
    public static void main(String ar[]){
        int arr[] = {12,20,40,15,50,30};
        bubbleSort(arr,0,arr.length-1);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}
