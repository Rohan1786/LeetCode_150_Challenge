class Solution {
    int m, n;
    int[][][][] dp;
    int[][] dirs = {{1,1}, {1,-1}, {-1,-1}, {-1,1}}; 

    public int lenOfVDiagonal(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        dp = new int[m][n][4][2];
        for (int[][][] a : dp)
            for (int[][] b : a)
                for (int[] c : b)
                    Arrays.fill(c, -1);

        int res = 0;
        // Start from each 1
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    for (int d = 0; d < 4; d++) {
                        res = Math.max(res, 1 + dfs(i + dirs[d][0], j + dirs[d][1], 2, d, 0, grid));
                    }
                }
            }
        }
        return res;
    }

    private int dfs(int i, int j, int exp, int dir, int turn, int[][] grid) {
        if (i < 0 || j < 0 || i >= m || j >= n) return 0;
        if (grid[i][j] != exp) return 0;
        if (dp[i][j][dir][turn] != -1) return dp[i][j][dir][turn];

        int nextExp = (exp == 2 ? 0 : 2);
        int best = 0;

        // continue same direction
        int ni = i + dirs[dir][0], nj = j + dirs[dir][1];
        best = Math.max(best, dfs(ni, nj, nextExp, dir, turn, grid));

        // take one clockwise turn
        if (turn == 0) {
            int newDir = (dir + 1) % 4;
            int ti = i + dirs[newDir][0], tj = j + dirs[newDir][1];
            best = Math.max(best, dfs(ti, tj, nextExp, newDir, 1, grid));
        }

        return dp[i][j][dir][turn] = 1 + best;
    }}