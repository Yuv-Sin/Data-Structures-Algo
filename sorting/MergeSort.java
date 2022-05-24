package sorting;

public class MergeSort {

    private static int[] mergeSortedArray(int[] arr1, int[] arr2){
        int m = arr1.length;
        int n = arr2.length;
        int[] mergedArray = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i] <= arr2[j]){
                mergedArray[k]=arr1[i];
                i++;
                k++;
            }
            else {
                mergedArray[k]=arr2[j];
                j++;
                k++;
            }
        }
        if(i==m){
            while(j< n){
                mergedArray[k]=arr2[j];
                k++;
                j++;
            }
        }
        else if(j==n){
            while(i< m){
                mergedArray[k]=arr1[i];
                k++;
                i++;
            }
        }
        return mergedArray;
    }

    private static int[] mergeSort(int arr[], int low, int high){
        if(low==high){
            int[] br = new int[1];
            br[0] = arr[low];
            return br;
        }
        int mid= (low+high)/2;
        int[] firstHalf = mergeSort(arr,low,mid);
        int[] secondHalf = mergeSort(arr,mid+1,high);
        return mergeSortedArray(firstHalf,secondHalf);
    }

    public static void main(String ar[]){
        int[] arr = {45,110,55,10,80,250,100,89,60,200};
        int[] sortedArray = mergeSort(arr,0,arr.length-1);
        for(int val:sortedArray){
            System.out.print(val+" ");
        }

    }
}
