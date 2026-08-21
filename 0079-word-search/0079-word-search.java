class Solution {
    public boolean exist(char[][] board, String word) {
        StringBuffer sb = new StringBuffer();
        boolean[][] vis = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
    for (int j = 0; j < board[0].length; j++) {
        if (func(i, j, sb, board, word, vis)) {
            return true;
        }
    }
}
return false;
       
    }

    public boolean func(int i, int j, StringBuffer sb,
                        char[][] board, String word,
                        boolean[][] vis) {

        if (i >= board.length || i < 0 ||
            j >= board[0].length || j < 0) {
            return false;
        }

        if (vis[i][j]) {
            return false;
        }

        if (board[i][j] != word.charAt(sb.length())) {
            return false;
        }

        sb.append(board[i][j]);
        vis[i][j] = true;

        if (sb.toString().equals(word)) {
            return true;
        }

        if (func(i, j + 1, sb, board, word, vis) ||
            func(i, j - 1, sb, board, word, vis) ||
            func(i - 1, j, sb, board, word, vis) ||
            func(i + 1, j, sb, board, word, vis)) {
            return true;
        }

        sb.deleteCharAt(sb.length() - 1);
        vis[i][j] = false;

        return false;
    }
}