class Solution {
    int[] memo;
    public int climbStairs(int n) {
        memo = new int[n+1];
       Arrays.fill(memo, -1);
       return climb(n);
    }
    public int climb(int n){
 if(n==0||n==1) return 1;
        if(memo[n]!=-1) return memo[n];
      return memo[n]=climb(n-1)+climb(n-2);
    }
}