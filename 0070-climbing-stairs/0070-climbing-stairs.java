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
        memo = new int[n + 1];
        Arrays.fill(memo, -1);
        return memoTech(n, 0);
    }
}