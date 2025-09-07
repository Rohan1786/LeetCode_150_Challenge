class Solution {
    int[][] memo = new int[301][5001]; 
    
    public int solve(int i, int[] coins, int amount) {
        int n = coins.length;
        
        if (amount == 0) return 1;   
        if (i == n) return 0;      
        
        if (memo[i][amount] != -1) return memo[i][amount];
        
        int take = 0;
        if (coins[i] <= amount) {
            take = solve(i, coins, amount - coins[i]); 
        }
        
        int skip = solve(i + 1, coins, amount); 
        
        return memo[i][amount] = take + skip;
    }
    
    public int change(int amount, int[] coins) {
        for (int[] arr : memo) {
            Arrays.fill(arr, -1);
        }
        return solve(0, coins, amount);
    }
}
