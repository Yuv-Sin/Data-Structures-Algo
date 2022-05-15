package recursion;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class SubSequence {
    /**
     *
     * @param value
     * @return SubSequence of a string using recursion
     */
    private static ArrayList<String> getSubSequence(String value){
        if(value.length()==0){
            ArrayList<String> baseResult = new ArrayList<>();
            baseResult.add("");
            return baseResult;
        }
        char cc = value.charAt(0);
        String ros = value.substring(1);
        ArrayList<String> myResult = new ArrayList<>();
        ArrayList<String> recResult = getSubSequence(ros);
        for(int i=0; i<recResult.size(); i++){
            myResult.add(recResult.get(i));
            myResult.add(cc+recResult.get(i));
        }
        return myResult;
    }

    public static void main(String ar[]){
        // Expected Output = ['', 'a', 'b', 'ab', 'c', 'ac', 'bc', 'abc'] = abc
        System.out.print(getSubSequence("abc"));
    }
}
