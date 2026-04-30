class Solution {
    public int maxPathScore(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int[][][] dp = new int[m][n][k+1];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                Arrays.fill(dp[i][j],-1);
            }
        }
        int startScore=(grid[0][0]==2)?2:grid[0][0];
        int startCost = (grid[0][0]==0)?0:1;
        if(startCost<=k) dp[0][0][startCost]=startCost;

        //Dp 
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int cost =(grid[i][j]==0)?0:1;
                int score = (grid[i][j]==2)?2:grid[i][j];
                for(int c=cost; c<=k; c++){
                    int best =-1;
                    if(i>0 && dp[i-1][j][c-cost]!=-1){
                        best = Math.max(best, dp[i-1][j][c-cost]);
                    }
                    if(j>0 && dp[i][j-1][c-cost]!=-1){
                        best = Math.max(best, dp[i][j-1][c-cost]);
                    }
                    if(best!=-1){
                        dp[i][j][c]=best+score;
                    }
                }
            }
        }
        int res=-1;
        for(int c=0; c<=k; c++){
            res=Math.max(res, dp[m-1][n-1][c]);
        }
        return res;
    }
}