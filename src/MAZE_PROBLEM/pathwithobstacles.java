package MAZE_PROBLEM;

import java.util.ArrayList;

public class pathwithobstacles {
    public static void main(String[] args) {
        boolean[][] bound={
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };

        pathwithobstacles("",bound,0,0);

    }
    static void pathwithobstacles( String p,boolean[][] maze,int row, int col){
        if(row==maze.length-1&&col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        if(row<maze.length-1){

            pathwithobstacles(p+'D',maze,row+1,col);//down side
        }
        if(col<maze[0].length-1) {
            pathwithobstacles(p + "R",maze, row, col + 1);//right side
        }

    }

    }

