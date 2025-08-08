class Solution {

    double[][] dp;
    int[][] value = {{100,0}, {75,25}, {50,50}, {25,75}};

    public double solve(int A, int B) {
        if (A <= 0 && B <= 0) return 0.5;
        if (A <= 0) return 1.0;
        if (B <= 0) return 0.0;

        if (dp[A][B] != -1.0) {
            return dp[A][B];
        }

        double prob = 0.0;
        for (int[] p : value) {
            prob += 0.25 * solve(A - p[0], B - p[1]);
        }

        return dp[A][B] = prob;
    }

    public double soupServings(int n) {
        if (n >= 5000) { // optimization to avoid deep recursion
            return 1.0;
        }

        dp = new double[n + 1][n + 1];
        for (double[] arr : dp) {
            Arrays.fill(arr, -1.0);
        }

        return solve(n, n);
    }
}
