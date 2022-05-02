package searching;

/**
 * @author Yuvraj Singh Rana
 */
public class BinarySearch {
    /**
     *
     * @param arr
     * @param number
     * @return if found returns index , else not found message
     */
    public static Object search(int[] arr, int number){
        int low=0;
        int high= arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>number){
                high = mid-1;
            } else if (arr[mid]<number) {
                low = mid+1;
            }
            else {
                return "number :"+number+" is present at index "+mid;
            }
        }
        return "number :"+number+" is not present";
    }
    public static void main(String ar[]){
        int arr[] = {10,15,22,38,42,59,64,77,90}; // Sorted array required for binary search
        System.out.println(search(arr,59)); // Exists
        System.out.println(search(arr,1000)); // Not Exists
    }
}
