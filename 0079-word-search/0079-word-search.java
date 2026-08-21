class Solution {

    public boolean exist(char[][] board, String word) {

        boolean[][] vis = new boolean[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {

                if (func(i, j, board, word, vis, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean func(int i, int j,
                        char[][] board,
                        String word,
                        boolean[][] vis,
                        int index) {

        if (index == word.length()) {
            return true;
        }

        if (i >= board.length || i < 0 ||
            j >= board[0].length || j < 0) {
            return false;
        }

        if (vis[i][j]) {
            return false;
        }

        if (board[i][j] != word.charAt(index)) {
            return false;
        }

        vis[i][j] = true;

        if (func(i, j + 1, board, word, vis, index + 1) ||
            func(i, j - 1, board, word, vis, index + 1) ||
            func(i - 1, j, board, word, vis, index + 1) ||
            func(i + 1, j, board, word, vis, index + 1)) {

            return true;
        }

        vis[i][j] = false;

        return false;
    }
}