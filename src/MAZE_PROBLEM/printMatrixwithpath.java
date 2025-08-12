package MAZE_PROBLEM;

import java.util.Arrays;

public class printMatrixwithpath {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path=new int[board.length][board[0].length];
        printmatrixwithpath("",board,0,0,path,1);

    }
    static void printmatrixwithpath(String p, boolean[][] maze, int row, int col, int[][] path,int step){
        if(row==maze.length-1&&col==maze[0].length-1){
            path[row][col]=step;
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));

            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(!maze[row][col]){
            return;
        }
        //i am considering this block in my pathh
        maze[row][col]=false;
        path[row][col]=step;

        if(row<maze.length-1){

            printmatrixwithpath(p+'D',maze,row+1,col,path,step+1);//down side
        }
        if(col<maze[0].length-1) {
            printmatrixwithpath(p + "R",maze, row, col + 1,path,step+1);//right side
        }
        if(row>0){

            printmatrixwithpath(p+'U',maze,row-1,col,path,step+1);//upside
        }
        if(col>0) {
            printmatrixwithpath(p + "L",maze, row, col - 1,path,step+1);//downside
        }
        //before returning from the function we will remove our changes
        //so
        maze[row][col]=true;
        path[row][col]=0;
    }
}
