package recursion;

public class IndexOfElement{

    private static int firstIndex(int arr[], int index, int element){
        if(index==arr.length)
            return -1;
        if(arr[index]==element)
            return index;
        return firstIndex(arr,index+1,element);
    }

    private static int lastIndex(int arr[], int index, int element){
        if(index==arr.length)
            return -1;
        int pointer = lastIndex(arr,index+1,element);
        if(pointer==-1){
            if(arr[index]==element){
                return index;
            }
            else{
                return -1;
            }
        }
        else {
            return pointer;
        }
    }

    private static int[] allIndices(int arr[], int si, int data, int count){
        if(si==arr.length){
            int[] base= new int[count];
            return base;
        }
        int[] result=null;
        if(arr[si]==data){
           result = allIndices(arr,si+1,data,count+1);
        }
        else{
            result = allIndices(arr,si+1,data,count);
        }
        if(arr[si]==data){
            result[count]=si;
        }
        return result;
    }

    public static void main(String ar[]){
        int arr[] = {6,8,1,1,8,3,4};
        int element1 = 8;
        int element2 = 100;
        System.out.println("First index of element "+element1+" is: "+firstIndex(arr,0,element1));
        System.out.println("Last index of element "+element1+" is: "+lastIndex(arr,0,element1));
        int ans[] = allIndices(arr,0,element1,0);
        System.out.print("All Indices of element "+element1+" are: ");
        for(int val:ans){
            System.out.print(val+" ");
        }
    }
}
