class Solution {
    int[] dp;
    public int count_unique(int n ) {
       if(n<=1) return 1;
       if(dp[n]!=-1) return dp[n];
       int total=0;
       for(int i=1; i<=n; i++){
     total+=count_unique(i-1)*count_unique(n-i);
       }
       return dp[n]=total;
    }
    public int numTrees(int n) {
        dp=new int[20];
       Arrays.fill(dp, -1);
        return count_unique(n);
    }
}