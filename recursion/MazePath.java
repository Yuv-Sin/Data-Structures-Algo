package recursion;

import java.util.ArrayList;

public class MazePath {
    //Traverses 3X3 GRID
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
        ArrayList<String> rrv = getMazePath(cr+1, cc, er,ec); //cr+1 : because if we take one step vertically row changes
        for(String rrvs:rrv){
            mr.add("V"+rrvs);
        }

        //Traversing Diagonally
        ArrayList<String> rrd = getMazePath(cr+1,cc+1, er, ec);//cr+1, cc+1 : because if we take one step diagonally row & column changes
        for(String rrds:rrd){
            mr.add("D"+rrds);
        }

        return mr;
    }

    //Better Approach without using ArrayList
    private static void printMazePath(int cr, int cc, int er, int ec, String result){
        if(cc==ec && cr == er){
            System.out.println(result);
            return;
        }
        if(cc>ec || cr>er){
            return;
        }
        printMazePath(cr,cc+1,er,ec,result+"H");
        printMazePath(cr+1, cc, er, ec, result+"V");
        printMazePath(cr+1, cc+1, er, ec, result+"D");
    }

    public static void main(String ar[]){
        //System.out.println(getMazePath(0,0,2,2)); // path from (0,0) -> (2,2)
        printMazePath(0,0,2,2,"");
    }
}
