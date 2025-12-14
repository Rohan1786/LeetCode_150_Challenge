class Solution {
    public int maximalRectangle(char[][] matrix) {
        int cols = matrix[0].length;
        int[] heights =new int[cols];
        int maxArea=0;
        for(char[] row: matrix){
            for(int j=0; j<cols; j++){
               heights[j]=(row[j]=='1')? heights[j]+1:0;
            }
            maxArea= Math.max(maxArea, largestRectangle(heights));
        }
        return maxArea;
    }
    public int largestRectangle(int[] heights){
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            left[i]=(stack.isEmpty())?-1:stack.peek();
            stack.push(i);
        }
        stack.clear();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
             right[i]=(stack.isEmpty())?n:stack.peek();
             stack.push(i);
        }
        int maxArea= 0;
        for(int i=0; i<n; i++){
            int width = right[i]-left[i]-1;
            maxArea=Math.max(maxArea, heights[i]* width);
        }
        return maxArea;
    }
}