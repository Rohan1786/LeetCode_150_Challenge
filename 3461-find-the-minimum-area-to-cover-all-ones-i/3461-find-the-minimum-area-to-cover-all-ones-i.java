class Solution {
    public int minimumArea(int[][] grid) {
         int m = grid.length;
        int n = grid[0].length;
        int maxRow =-1;
        int minRow=m;
        int maxCol = -1;
        int minCol =n;;
       
        for(int i=0; i< m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]==1){
                    minRow=Math.min(minRow,i);
                    maxRow = Math.max(maxRow, i);
                    maxCol =Math.max(maxCol, j);
                    minCol =Math.min(minCol, j);
                }
            }
        }
        return (maxRow -minRow+1)*(maxCol-minCol+1);
    }
}