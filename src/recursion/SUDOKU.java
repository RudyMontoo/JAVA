package recursion;

public class SUDOKU {
    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        System.out.println(isValidSudoku(board));
    }

    static boolean isValidSudoku(char[][] board) {
        // Check rows and columns
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            for (int j = 0; j < 9; j++) {
                // Check row
                if (board[i][j] != '.') {
                    int n = board[i][j] - '1';
                    if (row[n]) return false;
                    row[n] = true;
                }
                // Check col
                if (board[j][i] != '.') {
                    int n = board[j][i] - '1';
                    if (col[n]) return false;
                    col[n] = true;
                }
            }
        }
        // Check 3x3 boxes
        for (int box = 0; box < 9; box++) {
            boolean[] seen = new boolean[9];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    int r = 3 * (box / 3) + i;
                    int c = 3 * (box % 3) + j;
                    if (board[r][c] != '.') {
                        int n = board[r][c] - '1';
                        if (seen[n]) return false;
                        seen[n] = true;
                    }
                }
            }
        }
        return true;
    }
}