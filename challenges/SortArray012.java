package challenges;

//Sort the array of [0,1,2]
public class SortArray012 {

    private static int[] swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return arr;
    }

    private static int[] sortArrayOf012(int[] arr){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                arr = swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid]==1){
                mid++;
            }
            else{
                arr = swap(arr,mid,high);
                high--;
            }
        }
        return arr;
    }
    public static void main(String ar[]){
        int[] arr = {1,1,0,2,0,0,1,2,2,1};
        int[] sortedArray = sortArrayOf012(arr);
        for(int val:sortedArray){
            System.out.print(val+" ");
        }
    }
}
