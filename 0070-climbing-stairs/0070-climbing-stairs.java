class Solution {
    public int climbStairs(int n) {
        // int[] dp=new int[n+1];
        // dp[0]=1;
        // dp[1]=2;
        // for(int i=2; i<=n; i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n-1];

        //now we are going to optimize the space too
        int prev1 =1;
        int prev2 =1;
        // int res =0;
        for(int i=2; i<=n; i++){
            int res =prev1 + prev2;
            prev2 = prev1;
            prev1 =res;
        }
        return prev1;
    }
}