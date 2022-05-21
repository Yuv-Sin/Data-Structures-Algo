package recursion;

import java.util.ArrayList;

public class BoardPath {
    private static ArrayList<String> getBoardPath(int curr, int end){
        if(curr==end){
            ArrayList<String> br = new ArrayList<>();
            br.add("\n");
            return br;
        }
        if(curr>end){
            ArrayList<String> br = new ArrayList<>();
            return br;
        }
        ArrayList<String> mr = new ArrayList<>();
        for(int dice=1; dice<=6; dice++){
            ArrayList<String> rr = getBoardPath(curr+dice,end);
            for(String rrs: rr){
                mr.add(dice+rrs);
            }
        }
        return mr;
    }

    //Better Approach without using arraylist
    private static void printBoardPath(int curr, int end, String result){
        if(curr==end){
            System.out.println(result+" ");
            return;
        }
        if(curr>end){
            return;
        }
        for(int dice=1; dice<=6; dice++){ // dice can only be rolled for maximum 6 times
            printBoardPath(curr+dice,end,result+dice);
        }
    }
    public static void main(String ar[]){
        //System.out.println(getBoardPath(0,10));
        printBoardPath(0,10,"");
    }
}
