package recursion;

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

    // get SubString with ASCII Code
    private static ArrayList<String> getSSWASCII(String value){
        ArrayList<String> myResult = new ArrayList<>();
        if(value.length()==0){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }
        char cc = value.charAt(0);
        String ccAscii = String.valueOf((int)cc);
        String ros = value.substring(1);
        ArrayList<String> recResult = getSSWASCII(ros);
        for(int i=0; i<recResult.size(); i++){
            myResult.add(recResult.get(i));
            myResult.add(cc+recResult.get(i));
            myResult.add(ccAscii+recResult.get(i));
        }
        return myResult;
    }

    //Best Approach without using ArrayList
    private static void printSubsequences(String value, String result){
        //Base case
        if(value.length()==0){
            System.out.print(result+", ");
            return;
        }
        char cc = value.charAt(0);
        String ros = value.substring(1);
        printSubsequences(ros,result);
        printSubsequences(ros, result+cc);
    }

    public static void main(String ar[]){
//      Expected Output = ['', 'a', 'b', 'ab', 'c', 'ac', 'bc', 'abc'] = abc
//        System.out.print(getSubSequence("abc"));
//        System.out.println();
//        System.out.print(getSSWASCII("ab"));
        printSubsequences("abc","");
    }
}
