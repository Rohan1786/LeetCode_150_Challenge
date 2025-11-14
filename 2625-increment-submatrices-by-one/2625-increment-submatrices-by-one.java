class Solution {
    public int[][] rangeAddQueries(int n, int[][] queries) {
        int[][] matrix =new int[n][n];
        int[][] temp=new int[n][n];
        for(int arr[]: queries){
            int r1=arr[0], c1=arr[1];
            int r2=arr[2], c2=arr[3];
           temp[r1][c1] += 1;

            if (c2 + 1 < n) temp[r1][c2 + 1] -= 1;
            if (r2 + 1 < n) temp[r2 + 1][c1] -= 1;
        if (r2 + 1 < n && c2 + 1 < n) temp[r2 + 1][c2 + 1] += 1;

        }

        for(int i=0; i<n; i++){
            for(int j=1; j<n; j++){
                temp[i][j]+=temp[i][j-1];
            }
        }
        for(int j=0; j<n; j++){
            for(int i=1; i<n; i++){
                temp[i][j]+=temp[i-1][j];
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                matrix[i][j]=temp[i][j];
            }
        }
        return matrix;
    }
}