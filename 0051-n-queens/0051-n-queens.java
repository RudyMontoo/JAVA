class Solution {
    List<List<String>> result=new ArrayList<>();
    int[][] board;
    public List<List<String>> solveNQueens(int n) {
        board=new int[n][n];
       for (int[] row : board) {
            Arrays.fill(row, 0);
        }

        func(0,new ArrayList<>());
        return result;

    }





    public void func(int row,List<String> list){
        if(row==board.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int col=0;col<board.length;col++){
            if(isSafe(row,col)){
                list.add(print(col));
                board[row][col]=1;
                func(row+1,list);
        
                list.remove(list.size()-1);
                board[row][col]=0;

            }
        }
    return;

    }

public String print(int col){
    String s="";
   for(int i=0;i<board.length;i++){
    if(i==col){
        s=s+"Q";
    }
    else s=s+".";
   }
   return s;
}


 public boolean isSafe(int row, int col) {

    int crow = row;
    int ccol = col;

    // UP 
    int r = 1;

    while (r < board.length) {

        // UP
        if (crow - r >= 0 &&
            board[crow - r][ccol] == 1) {
            return false;
        }

        r++;
    }



    
    int d = 1;

    while (d < board.length) {

        // UP-LEFT ↖
        if (crow - d >= 0 &&
            ccol - d >= 0 &&
            board[crow - d][ccol - d] == 1) {
            return false;
        }

        d++;
    }


    // ↗ + ↙
    d = 1;

    while (d < board.length) {

        // UP-RIGHT ↗
        if (crow - d >= 0 &&
            ccol + d < board.length &&
            board[crow - d][ccol + d] == 1) {
            return false;
        }
        d++;
    }

    return true;
}
}