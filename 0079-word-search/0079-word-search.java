class Solution {
    int m, n;

    public boolean solve(char[][] board, String word, int i, int j, int index) {

        
        if (index == word.length()) return true;
 
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] != word.charAt(index)) {
            return false;
        }
 
        char temp = board[i][j];
        board[i][j] = '#';

       
        boolean found =
                solve(board, word, i + 1, j, index + 1) ||
                solve(board, word, i - 1, j, index + 1) ||
                solve(board, word, i, j + 1, index + 1) ||
                solve(board, word, i, j - 1, index + 1);
 
        board[i][j] = temp;

        return found;
    }

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (solve(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
