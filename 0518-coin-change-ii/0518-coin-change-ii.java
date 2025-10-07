class Solution {
    int[][]t;
    public int solve(int i, int amount, int[] coins){
    
    int n = coins.length;
    if(amount ==0) return 1;
    if(t[i][amount]!=-1) return t[i][amount];
    if(i==n) return 0;
    if(coins[i]>amount){
        return solve(i+1, amount, coins);
    }
int take = solve(i, amount-coins[i], coins);
int skip = solve(i+1, amount,coins);
return t[i][amount]=take+skip;
    }
    public int change(int amount, int[] coins) {
        t=new int[301][5001];
        for(int i=0;i<301; i++){
            Arrays.fill(t[i],-1);
        }
        return solve(0, amount, coins);
    }
}