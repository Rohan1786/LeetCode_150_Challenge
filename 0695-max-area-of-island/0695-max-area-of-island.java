class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int maxArea=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                maxArea=Math.max(maxArea,dfs(grid,i,j));
            }
        }
        return maxArea;
    }
    public int dfs(int[][] grid,int i,int j) {
        

        if(i>=grid.length||i<0||j>=grid[i].length||j<0||grid[i][j]==0){
            return 0;
        }
        grid[i][j]=0;
        int ans=1;
        ans+=dfs(grid,i+1,j);
        ans+=dfs(grid,i-1,j);
        ans+=dfs(grid,i,j+1);
        ans+=dfs(grid,i,j-1);
        return ans;
    }
}