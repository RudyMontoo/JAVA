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


 private boolean isSafe(int row, int col) {
        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 1) return false;
        }

        // Diagonal up-left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        // Diagonal up-right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }
}