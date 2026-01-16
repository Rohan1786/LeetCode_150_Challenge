class Solution {
    int[][] memo;
    public int uniquePaths(int m, int n) {
        memo = new int[m][n];
        for(int[]arr: memo){
            Arrays.fill(arr, -1);
        }
        return solve(m, n, 0, 0);
    }
    public int solve(int m, int n, int i, int j){
          if (i >= m || j >= n) {
            return 0;
        }
        if(memo[i][j]!=-1){
            return memo[i][j];
        }
        if(i==m-1 && j == n-1) return 1;
       memo[i][j]=solve(m, n, i+1, j)+solve(m, n, i, j+1);
       return memo[i][j];
    }
}