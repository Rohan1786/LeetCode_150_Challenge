class Solution {
    public int minScoreTriangulation(int[] values) {
        int n = values.length;
        int[][] dp = new int[n][n];

        // dp[i][j] = min score to triangulate polygon from i to j
        for (int len = 3; len <= n; len++) { // polygon side length
            for (int i = 0; i + len - 1 < n; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i + 1; k < j; k++) {
                    int score = values[i] * values[j] * values[k] + dp[i][k] + dp[k][j];
                    dp[i][j] = Math.min(dp[i][j], score);
                }
            }
        }
        return dp[0][n - 1];
    }
}
