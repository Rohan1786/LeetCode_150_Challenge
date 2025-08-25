class Solution {
    int index = 0;

    public void solve(int[][] mat, int row, int col, int dir, int[] arr) {
        int m = mat.length;
        int n = mat[0].length;

      
        if (row < 0 || col < 0 || row >= m || col >= n) return;

        arr[index++] = mat[row][col];

        if (dir == 1) { 
            if (col == n - 1) { 
                solve(mat, row + 1, col, -1, arr);
            } else if (row == 0) { // hit top border → go right
                solve(mat, row, col + 1, -1, arr);
            } else { // normal up-right move
                solve(mat, row - 1, col + 1, 1, arr);
            }
        } else { 
            if (row == m - 1) {
                solve(mat, row, col + 1, 1, arr);
            } else if (col == 0) { 
                solve(mat, row + 1, col, 1, arr);
            } else { 
                solve(mat, row + 1, col - 1, -1, arr);
            }
        }
    }

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];
        solve(mat, 0, 0, 1, arr); 
        return arr;
    }
}
