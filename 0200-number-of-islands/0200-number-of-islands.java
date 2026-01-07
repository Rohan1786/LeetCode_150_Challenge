class Solution {
    int n;
    int m;
    public void dfs(int i, int j, char[][] grid){
        int[][] directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
        grid[i][j]='#';
        for(int[] dir: directions){
            int new_i=i+dir[0];
            int new_j=j+dir[1];
            if(new_i<0||new_i>=m||new_j>=n||new_j<0){
                continue;
            }
            if(grid[new_i][new_j]=='1'){
                dfs(new_i, new_j, grid);
            }
        }
    }
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int count =0;
        for(int i=0;i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'){
                    dfs(i, j, grid);
                  count++;
                }
            }
        }
        return count;
    }
}