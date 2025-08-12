package recursion;

public class NQUEEN {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        int solutions = queen(board, 0);
        System.out.println("Total solutions: " + solutions);
    }

    static int queen(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                count += queen(board, row + 1);
                board[row][col] = false;
            }
        }
        return count;
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "Q " : ". ");
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical upwards
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // Check left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) {
                return false;
            }
        }
        // Check right diagonal
        for (int i = 1; i <= Math.min(row, board.length - col - 1); i++) {
            if (board[row - i][col + i]) {
                return false;
            }
        }
        return true;
    }
}