package recursion;

public class IsArraySorted {
    // Checks if the given array is sorted or not
    private static boolean isArraySorted(int[] arr, int index) {
        if(index==arr.length-1)
            return true;
        if(arr[index]>arr[index+1])
            return false;
        return isArraySorted(arr,index+1);
    }

    public static void main(String ar[]){
        int sortedArr[] = {1,4,6,8,88};
        int arr[] = {8,6,9,3,5,1};
        System.out.print(isArraySorted(sortedArr,0));
    }
}
