class Solution {
     public void make(char[][] grid, int i, int j, int n, int m) {
        // boundary check
        if (i < 0 || i >= n || j < 0 || j >= m || grid[i][j] != '1') return;

      
        grid[i][j] = '0';
 
        make(grid, i - 1, j, n, m); // up
        make(grid, i + 1, j, n, m); // down
        make(grid, i, j - 1, n, m); // left
        make(grid, i, j + 1, n, m); // right
    }
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    make(grid, i, j, n, m);
                    count++;
                }
            }
        }

        return count;
    }
}