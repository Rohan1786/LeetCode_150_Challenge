class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int m = grid.length;
        int n = grid[0].length;
        int freshOrange=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    freshOrange++;
                }else if(grid[i][j]==2){
                    queue.offer(new int[]{i,  j});
                }
            }
        }
        if(freshOrange==0) return 0;
        int minutes=0;
        int[][] directions = {{1, 0},{-1, 0},{0, 1}, {0, -1}};
         while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0; i<size; i++){
            int[] curr = queue.poll();
            for(int[] dir: directions){
              int x = curr[0]+dir[0];
              int y = curr[1]+dir[1];
            if (x >= 0 && y >= 0 && x < m && y < n && grid[x][y] == 1)
{
                grid[x][y]=2;
                freshOrange--;
                queue.offer(new int[]{x, y});
              }}
            }

            minutes++;

         }
         return freshOrange==0?minutes-1:-1;
    }
}