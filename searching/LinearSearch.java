package searching;

/**
 * @author Yuvraj Singh Rana
 */
public class LinearSearch{

    /**
     *
     * @param arr
     * @param number
     * @return if found returns index , else not found message
     */
    public static Object search(int[] arr, int number){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                return "number: "+number+" present at index: "+ i;
            }
        }
        return "number: "+number+" not found";
    }
    public static void main(String ar[]){
        int arr[] = {27,98,54,76,35,14,29,19,63};
        System.out.println(search(arr,63)); // Exists
        System.out.println(search(arr,1000)); // Not Exists
    }
}