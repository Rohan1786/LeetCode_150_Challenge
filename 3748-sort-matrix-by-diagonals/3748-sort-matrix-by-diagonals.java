class Solution {
   
    public int[][] sortMatrix(int[][] grid) {
      int n = grid.length;

        // Step 1: Diagonals starting from first column (bottom-left) → non-increasing
        for (int row = 0; row < n; row++) {
            List<Integer> diagonal = extractDiagonal(grid, row, 0);
            diagonal.sort(Collections.reverseOrder()); // non-increasing
            placeDiagonal(grid, row, 0, diagonal);
        }

        // Step 2: Diagonals starting from first row (top-right) → non-decreasing
        for (int col = 1; col < n; col++) {
            List<Integer> diagonal = extractDiagonal(grid, 0, col);
            Collections.sort(diagonal); // non-decreasing
            placeDiagonal(grid, 0, col, diagonal);
        }

        return grid;
    }

    // Extracts a diagonal into a list
    private List<Integer> extractDiagonal(int[][] grid, int i, int j) {
        int n = grid.length;
        List<Integer> diagonal = new ArrayList<>();
        while (i < n && j < n) {
            diagonal.add(grid[i][j]);
            i++;
            j++;
        }
        return diagonal;
    }

    // Places sorted values back into the diagonal
    private void placeDiagonal(int[][] grid, int i, int j, List<Integer> diagonal) {
        int n = grid.length;
        int k = 0;
        while (i < n && j < n) {
            grid[i][j] = diagonal.get(k++);
            i++;
            j++;
        }
    }
}