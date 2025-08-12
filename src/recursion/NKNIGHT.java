package recursion;

public class NKNIGHT {
    public static void main(String[] args) {
        int n = 4; // Size of the board
        int numKnights = 4; // Number of knights to place
        boolean[][] board = new boolean[n][n];
        knight(board, 0, 0, numKnights);
    }

    static void knight(boolean[][] board, int row, int col, int knightsToPlace) {
        // Base condition: If all knights are placed, display the board
        if (knightsToPlace == 0) {
            display(board);
            System.out.println(); // Add a newline for better separation of solutions
            return; // Important: return after finding a solution
        }

        // Base condition: If we've exhausted all rows, no more places to put knights
        if (row == board.length) {
            return;
        }

        // Move to the next row if we've reached the end of the current column
        if (col == board.length) {
            knight(board, row + 1, 0, knightsToPlace); // Start from col 0 of the next row
            return;
        }

        // Try placing a knight at the current cell (row, col)
        if (isSafe(board, row, col)) {
            board[row][col] = true; // Place the knight
            knight(board, row, col + 1, knightsToPlace - 1); // Recur for the next column, one less knight to place
            board[row][col] = false; // Backtrack: remove the knight for other possibilities
        }

        // Don't place a knight at the current cell and move to the next column
        knight(board, row, col + 1, knightsToPlace);
    }

    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                System.out.print(element ? "K " : ". ");
            }
            System.out.println();
        }
    }

    // Checks if placing a knight at (row, col) is safe (i.e., no other knight attacks it)
    private static boolean isSafe(boolean[][] board, int row, int col) {
        // A knight attacks in an 'L' shape. We only need to check backward directions
        // because we are placing knights from top-left to bottom-right.
        // If a knight is placed at (row, col), we check if any existing knight
        // (which would be at a smaller row or earlier column) attacks this position.

        // Check 8 possible knight moves in backward direction
        // (-2, -1)
        if (isValid(board, row - 2, col - 1) && board[row - 2][col - 1]) {
            return false;
        }
        // (-2, +1)
        if (isValid(board, row - 2, col + 1) && board[row - 2][col + 1]) {
            return false;
        }
        // (-1, -2)
        if (isValid(board, row - 1, col - 2) && board[row - 1][col - 2]) {
            return false;
        }
        // (-1, +2)
        if (isValid(board, row - 1, col + 2) && board[row - 1][col + 2]) {
            return false;
        }

        // If none of the attacking positions are occupied, it's safe
        return true;
    }

    // Helper function to check if a given row and column are within the board boundaries
    private static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }
}