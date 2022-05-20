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
    public static void main(String ar[]){
        System.out.print(getPermutations("abcd"));
    }
}
