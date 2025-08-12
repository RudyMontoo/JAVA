package MAZE_PROBLEM;

public class printingpath {
    public static void main(String[] args) {

        printingpath("" ,3,3);
    }
    static void printingpath( String p,int row, int col){
        if(row==1&&col==1){
            System.out.println(p);
return;
        }
        if(row>1){

            printingpath(p+'D',row-1,col);//down side
        }
        if(col>1) {
            printingpath(p + "R", row, col - 1);//right side
        }

    }
}
