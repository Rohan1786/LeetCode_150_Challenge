class Solution {
    int n;
    int[][]t;
   public int solve(int i, int amount, int[] coins) {
       
        if (amount == 0) return 1;
 
        if (i >= n || amount < 0) return 0;
 
        if (t[i][amount] != -1) return t[i][amount];
  
        int take = solve(i, amount - coins[i], coins);  
        int skip = solve(i + 1, amount, coins);           
        return t[i][amount] = take + skip;
    }
    public int change(int amount, int[] coins) {
        n = coins.length;
        t=new int[n+1][amount+1];
        for(int[]arr: t)
        {
            Arrays.fill(arr,-1);
        }
        return solve(0, amount, coins);
    }
}