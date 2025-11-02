class Solution {
     //Recursive technique
    public int solve(int n, int i){
        if(i==n) return 1;
        if(i>n){
            return 0;
        }
       
        int step=solve(n, i+1);
        int skip=solve(n, i+2);
        return step+skip;
    }

int[] memo;

    public int memoTech(int n, int i) {
        if (i == n) return 1;  // reached the top
        if (i > n) return 0;   // exceeded stairs

        if (memo[i] != -1) {
            return memo[i];
        }

        int step = memoTech(n, i + 1);
        int more = memoTech(n, i + 2);

        // store result for this position
        return memo[i] = step + more;
    }

    public int climbStairs(int n) {
        // memo = new int[n + 1];
        // Arrays.fill(memo, -1);
        // return memoTech(n, 0);
        //now the dp approach 
        // if (n == 0) return 0;
        // if (n == 1) return 1;
        // int[] dp  = new int[n+1];
        // dp[0]=1;
        // dp[1]=1;
        // for(int i=2; i<=n; i++){
        //     dp[i]=dp[i-1]+dp[i-2];
        // }
        // return dp[n];+


        // now the tricky approach
         if (n == 0) return 0;
        if (n == 1) return 1;
        int i=2;
        int c = 0;
        int a =1;
        int b=1;
       while(i<=n){
        c=a+b;
        a=b;
        b=c;
        i++;
       }
       return c;
    }
}