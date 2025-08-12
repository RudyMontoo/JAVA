package MAZE_PROBLEM;

import java.util.ArrayList;

public class includingdiagonal {
    public static void main(String[] args) {
        System.out.println(includingdiagonal("",3,3));

    }
    static ArrayList<String> includingdiagonal(String p, int row, int col){
        if(row==1&& col==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if(row>1&&col>1){
            list.addAll(includingdiagonal(p+"D",row-1,col-1));
        }
        if(row>1){
            list.addAll(includingdiagonal(p+"V",row-1,col));
        }
        if (col>1){
            list.addAll(includingdiagonal(p+"H",row,col-1));
        }

        return list;
    }
}
