package recursion;

import java.util.ArrayList;

public class MazePath {
    private static ArrayList<String> getMazePath(int cr, int cc, int er, int ec){

        //Base case when both pointers reach the end
        if(cr==er && cc==ec){
            ArrayList<String> br = new ArrayList<>();
            br.add("");
            return br;
        }

        //Base case when any pointer reaches the outOfScope area
        if(cr>er || cc>ec){
            ArrayList<String> br = new ArrayList<>();
            return br;
        }

        ArrayList<String> mr = new ArrayList<>();

        //Traversing Horizontally
        ArrayList<String> rrh = getMazePath(cr, cc+1, er, ec); //cc+1 : because if we take one step horizontally column changes
        for(String rrhs:rrh){
            mr.add("H"+rrhs);
        }

        //Traversing Vertically
        ArrayList<String> rrv = getMazePath(cr+1, cc, er,ec);
        for(String rrvs:rrv){
            mr.add("V"+rrvs);
        }

        return mr;
    }
    public static void main(String ar[]){
        System.out.println(getMazePath(0,0,2,2)); // path from (0,0) -> (2,2)
    }
}
