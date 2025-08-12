package MAZE_PROBLEM;

public class includingallpath {

    public static void main(String[] args) {
        boolean[][] bound={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };

        includingallpath("",bound,0,0);

    }
    static void includingallpath(String p, boolean[][] maze, int row, int col){
        if(row==maze.length-1&&col==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[row][col]){
            return;
        }
        //i am considering this block in my pathh
        maze[row][col]=false;

        if(row<maze.length-1){

            includingallpath(p+'D',maze,row+1,col);//down side
        }
        if(col<maze[0].length-1) {
            includingallpath(p + "R",maze, row, col + 1);//right side
        }
        if(row>0){

            includingallpath(p+'U',maze,row-1,col);//upside
        }
        if(col>0) {
            includingallpath(p + "L",maze, row, col - 1);//downside
        }
        //before returning from the function we will remove our changes
        //so
        maze[row][col]=true;

    }
}
