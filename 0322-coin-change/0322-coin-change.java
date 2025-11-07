import java.util.*;

class Solution {
    int[][] t;  

    public int solve(int i, int amount, int[] coins) {
        int n = coins.length;

        // Base cases
        if (amount == 0) return 0;          
        if (i == n) return 1000000000;         
        if (t[i][amount] != -1) return t[i][amount];
 
        if (coins[i] > amount) {
            return t[i][amount] = solve(i + 1, amount, coins);
        }
 
        int take =  1+solve(i, amount - coins[i], coins);
 
        int skip = solve(i + 1, amount, coins);

    
        return t[i][amount] = Math.min(take, skip);
    }

    public int coinChange(int[] coins, int amount) {
        // initialize dp array same as your 518 code
        // t = new int[301][5001];
        // for (int i = 0; i < 301; i++) {
        //     Arrays.fill(t[i], -1);
        // }

        // int ans = solve(0, amount, coins);

        // // if impossible, return -1
        // return ans >= 1000000000 ? -1 : ans;
        int[] dp =new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1; i<=amount; i++){
            for(int coin: coins){
                if(i-coin>=0){
                dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
}
