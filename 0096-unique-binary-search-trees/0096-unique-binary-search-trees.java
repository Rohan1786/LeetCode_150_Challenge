class Solution {
    int[] memo;
    public int count_unique(int n ) {
       if(n<=1) return 1;
       if(memo[n]!=-1) return memo[n];
       int total=0;
       for(int i=1; i<=n; i++){
     total+=count_unique(i-1)*count_unique(n-i);
       }
       return memo[n]=total;
    }
    public int numTrees(int n) {
    //     memo=new int[20];
    //    Arrays.fill(memo, -1);
    //     return count_unique(n);
//Now we will go with the dp
int[]dp = new int[n+1];
dp[0]=1;
dp[1]=1;
for(int i=2; i<=n; i++)
{
    for(int j=1; j<=i; j++){
         dp[i] += dp[j - 1] * dp[i - j];
    }
}
return dp[n];
    }
}