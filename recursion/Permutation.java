package recursion;

import java.util.ArrayList;

public class Permutation {
    private static ArrayList<String> getPermutations(String value){
        ArrayList<String> myResult = new ArrayList<>();
        if(value.length()==0){
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }
        char cc = value.charAt(0);
        String ros = value.substring(1);
        ArrayList<String> recResult = getPermutations(ros);
        for(String rrs: recResult){
            for(int j=0; j<= rrs.length(); j++){
                String val = rrs.substring(0,j)+cc+rrs.substring(j);
                myResult.add(val);
            }
        }
       return myResult;
    }

    //Better Approach without using arraylist
    private static void printPermutations(String value, String result){
        if(value.length()==0){
            System.out.print(result+" ");
            return;
        }
        for(int i=0; i<value.length(); i++) {
            char cc = value.charAt(i);
            String ros = value.substring(0, i) + value.substring(i+1);
            printPermutations(ros, result+cc);
        }
    }


    public static void main(String ar[]){
        //System.out.print(getPermutations("abcd"));
        printPermutations("abc","");
    }
}
