class Solution {
    StringBuilder res;

    public boolean dfs(char[][] board, int i, int j, String word, int idx, boolean[][] visited) {
        int m = board.length, n = board[0].length;

        // Base cases
        if (idx == word.length()) return true;  // full word matched
        if (i < 0 || j < 0 || i >= m || j >= n) return false; // out of bounds
        if (visited[i][j] || board[i][j] != word.charAt(idx)) return false; // already used or mismatch

        // choose
        visited[i][j] = true;
        res.append(board[i][j]);

        // explore
        boolean found = dfs(board, i - 1, j, word, idx + 1, visited)
                     || dfs(board, i + 1, j, word, idx + 1, visited)
                     || dfs(board, i, j - 1, word, idx + 1, visited)
                     || dfs(board, i, j + 1, word, idx + 1, visited);

        // backtrack
        visited[i][j] = false;
        res.deleteCharAt(res.length() - 1);

        return found;
    }

    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        res = new StringBuilder();
        boolean[][] visited = new boolean[m][n];

        // Try to start DFS from every cell
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, i, j, word, 0, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
