class Solution {
     private static final int[][] directions = {{-1,0},{0,-1},{1,0},{0,1}};
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int left = grid[0][0];
        int right = n*n-1;
        int ans = right;
       while(left<=right) {
         int mid = (left + right) / 2;
         if(canReach(grid,mid)){
            ans = mid;
            right = mid-1;
         }
         else{
            left = mid+1;
         }
       }
       return ans;
    }
//     public boolean canReach(int[][] grid, int t) {
//         int n = grid.length;
//         Stack<int[]> stack = new Stack<>();
//         boolean[][] visited = new boolean[n][n];
//         stack.push(new int[]{0,0});
//         visited[0][0]=true;
//         while(!stack.isEmpty()) {
//             int[] curr = stack.pop();
//             int r= curr[0];
//             int l=curr[0];
//             if(r==n-1&&l==n-1) return true;
//             for(int[] dir: directions) {
//                 int nr = r+dir[0];
//                 int nl = r+dir[1];
//                 if (nr >= 0 && nl >= 0 && nr < n && nl < n &&
//                     !visited[nr][nl] && grid[nr][nl] <= t) {
//                     visited[nr][nl] = true;
//                     stack.push(new int[]{nr, nl});
//                     }
//             }
//         }
//         return false;
//     }
// }
  private boolean canReach(int[][] grid, int t) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0, 0});
        visited[0][0] = true;

        while (!stack.isEmpty()) {
            int[] cell = stack.pop();
            int r = cell[0];
            int c = cell[1];

            if (r == n - 1 && c == n - 1) return true; // reached end

            for (int[] dir : directions) {
                int nr = r + dir[0];
                int nc = c + dir[1];

                if (nr >= 0 && nc >= 0 && nr < n && nc < n &&
                    !visited[nr][nc] && grid[nr][nc] <= t) {
                    visited[nr][nc] = true;
                    stack.push(new int[]{nr, nc});
                }
            }
        }
        return false;
    }
}