package recursion;
//LEETCODE ONE OF HARDEST QUESTION
//IMPORTAANT

import java.util.*;

public class NQUEEN_LISTLEETCODE {
    public static void main(String[] args) {
        int n = 4;
        List<List<String>> solutions = solveNQueens(n);
        for (List<String> solution : solutions) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        boolean[][] board = new boolean[n][n];
        backtrack(result, board, 0);
        return result;
    }

    private static void backtrack(List<List<String>> result, boolean[][] board, int row) {
        int n = board.length;
        if (row == n) {
            result.add(formatBoard(board));
            return;
        }
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = true;
                backtrack(result, board, row + 1);
                board[row][col] = false;
            }
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int n = board.length;
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col]) return false;
        }
        // Check left diagonal
        for (int i = 1; i <= Math.min(row, col); i++) {
            if (board[row - i][col - i]) return false;
        }
        // Check right diagonal
        for (int i = 1; i <= Math.min(row, n - col - 1); i++) {
            if (board[row - i][col + i]) return false;
        }
        return true;
    }

    private static List<String> formatBoard(boolean[][] board) {
        List<String> formatted = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? "Q" : ".");
            }
            formatted.add(sb.toString());
        }
        return formatted;
    }
}