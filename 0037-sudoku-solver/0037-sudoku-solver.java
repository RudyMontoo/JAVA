class Solution {

    public void solveSudoku(char[][] board) {
        func(0, 0, board);
    }

    public boolean func(int r, int c, char[][] board) {

        // All rows completed
        if (r == board.length) {
            return true;
        }

        // Move to next row
        if (c == board.length) {
            return func(r + 1, 0, board);
        }

        // Already filled → move to next cell
        if (board[r][c] != '.') {
            return func(r, c + 1, board);
        }

        // Try 1 to 9
        for (int x = 1; x <= 9; x++) {

            if (subGrid(x, r, c, board) &&
                rcSafe(x, r, c, board)) {

                // Choose
                board[r][c] = (char) ('0' + x);

                // Explore
                if (func(r, c + 1, board)) {
                    return true;
                }

                // Undo / Backtrack
                board[r][c] = '.';
            }
        }

        return false;
    }



    // let first make condition 
    // 1)subGrid-> check 3 *3 matrix  ,i,j 
        //P1 how we known which sub board it belong 
        // startRow = (i / 3) * 3
        // startCol = (j / 3) * 3

        public boolean subGrid(int x,int r, int c, char[][] board){
            int sr=(r/3)*3;
            int sc=(c/3)*3;
            for(int i=sr;i<sr+3;i++){
                for(int j=sc;j<sc+3;j++){
                    if(board[i][j]==(char) ('0' + x))return false;
                }
            }
            return true;
        }


    // 2)now check for rowwise and colwise
        public boolean rcSafe(int x, int r, int c, char[][] board){
            for(int i=0;i<board.length;i++){
                    if(board[r][i]==(char) ('0' + x)){
                   return false;
                    }
            }
             for(int i=0;i<board.length;i++){
                   if( board[i][c]==(char) ('0' + x)){
                    return false;
                   }
            }
            return true;
        }


}