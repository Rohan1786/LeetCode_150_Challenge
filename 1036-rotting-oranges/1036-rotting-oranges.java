class Solution {
    public int orangesRotting(int[][] grid) {
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        if (grid == null || grid.length == 0) {
            return 0;
        }
        
        int freshCount = 0;
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                }
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                }
            }
        }
        
        int minutes = 0;
        if (freshCount == 0) return 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] rotten = queue.poll();
                for (int[] d : dir) {
                    int x = rotten[0] + d[0];
                    int y = rotten[1] + d[1];
                    if (x >= 0 && x < m && y >= 0 && y < n && grid[x][y] == 1) {
                        grid[x][y] = 2;
                        freshCount--;
                        queue.offer(new int[]{x, y});
                    }
                }
            }
            minutes++;
        }
        
        return freshCount == 0 ? minutes - 1 : -1;
    }
}
