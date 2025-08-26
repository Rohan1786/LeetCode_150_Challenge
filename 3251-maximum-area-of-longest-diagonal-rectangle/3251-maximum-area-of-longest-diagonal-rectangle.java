class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
         double maxDiagonal = 0;
        int maxArea = 0;

        for (int[] arr : dimensions) {
            int l = arr[0];
            int w = arr[1];

            // diagonal
            double diag = Math.sqrt((long) l * l + (long) w * w);
            int area = l * w;

            if (diag > maxDiagonal) {
                maxDiagonal = diag;
                maxArea = area;
            } 
           
            else if (diag == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }
}