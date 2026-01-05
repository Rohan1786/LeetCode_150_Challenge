class Solution {
    int[][] memo;
    int m;
    final int INF = (int)1e9;

    public int solve(int[] coins, int i, int amount) { 
        if (amount == 0) return 0; 
        if (i == m || amount < 0) return INF; 
        if (memo[i][amount] != -1)
            return memo[i][amount];
 
        int skip = solve(coins, i + 1, amount);
 
        int take = 1 + solve(coins, i, amount - coins[i]);

        return memo[i][amount] = Math.min(skip, take);
    }

    public int coinChange(int[] coins, int amount) {
        m = coins.length;
        memo = new int[m][amount + 1];

        for (int[] row : memo)
            Arrays.fill(row, -1);

        int ans = solve(coins, 0, amount);
        return ans >= INF ? -1 : ans;
    }
}
