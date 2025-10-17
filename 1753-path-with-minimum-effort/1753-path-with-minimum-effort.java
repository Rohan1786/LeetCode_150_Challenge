class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] dist = new int[m][n];
        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);

        // Min-heap for (effort, row, col)
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, 0, 0});  // effort = 0, start at (0,0)
        dist[0][0] = 0;

        int[][] dirs = {{1,0}, {-1,0}, {0,1}, {0,-1}};
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int effort = curr[0], r = curr[1], c = curr[2];

            if (r == m - 1 && c == n - 1) return effort; // reached destination

            for (int[] d : dirs) {
                int nr = r + d[0];
                int nc = c + d[1];
                if (nr >= 0 && nc >= 0 && nr < m && nc < n) {
                    int newEffort = Math.max(effort, Math.abs(heights[r][c] - heights[nr][nc]));
                    if (newEffort < dist[nr][nc]) {
                        dist[nr][nc] = newEffort;
                        pq.offer(new int[]{newEffort, nr, nc});
                    }
                }
            }
        }

        return 0; // should never reach here
    }
}
