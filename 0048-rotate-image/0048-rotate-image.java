class Solution {
    public void inPlaceSwap(int[][] matrix) {
        int row = matrix.length;
        for (int i = 0; i < row; i++) {
            for (int j = i + 1; j < row; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public void reverseMatrix(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            i++;
            j--;
        }
    }

    public void rotate(int[][] matrix) {
        inPlaceSwap(matrix); // transpose
        for (int i = 0; i < matrix.length; i++) {
            reverseMatrix(matrix[i]); // reverse each row
        }
    }
}
