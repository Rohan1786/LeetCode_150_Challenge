class Solution {
    int mod = (int)1e9+7;
    int n;
    int m;
 Integer[][][] dp;
    public int solve(int[][] grid, int i, int j, int k, int sum) {
     if (i >= n || j >= m) return 0;
       sum = (sum + grid[i][j]) % k;
       if (dp[i][j][sum] != null) {
            return dp[i][j][sum];
        }
           if (i == n - 1 && j == m - 1) {
            return dp[i][j][sum] = (sum % k == 0 ? 1 : 0);
        }
        int right = solve(grid, i, j+1, k, sum);
        int down = solve(grid, i+1, j, k, sum);

        return dp[i][j][sum] = (int)(((long)right + down) % mod);
    }

    public int numberOfPaths(int[][] grid, int k) {
        n=grid.length;
        m=grid[0].length;
          dp = new Integer[n][m][k];

       return solve(grid, 0, 0, k, 0);
    }
}