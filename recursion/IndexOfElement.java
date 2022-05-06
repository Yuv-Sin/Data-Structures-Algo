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

    public static void main(String ar[]){
        int arr[] = {6,8,1,1,8,3,4};
        int element1 = 8;
        int element2 = 100;
        System.out.println("First index of element "+element1+" is: "+firstIndex(arr,0,element1));
        System.out.println("Last index of element "+element1+" is: "+lastIndex(arr,0,element1));
    }
}
