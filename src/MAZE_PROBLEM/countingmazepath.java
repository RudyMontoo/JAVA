package MAZE_PROBLEM;

public class countingmazepath {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int result=count(row,col);
        System.out.println(result);
    }
    static int count(int row, int col){
        if(row==1||col==1){
            return 1;
        }
        int left=count(row,col-1);//right side
        int right=count(row-1,col);//down side
        return left+right;
    }
}
