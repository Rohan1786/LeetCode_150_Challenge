
class Solution {
    public int check(int n,int[] memo){
        if(n<=1){
            return n;
        }
        if(memo[n]!=-1){
            return memo[n];
        }
        memo[n]=check(n-1,memo)+check(n-2,memo);
        return memo[n];
    }
    public int fib(int n) {
        // int[] memo = new int [n+1];
        // Arrays.fill(memo,-1);
        // return  check(n,memo);
        
        if(n<=1) return n;
        int[] dp = new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
   return dp[n];
    }
}