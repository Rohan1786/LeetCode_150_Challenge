class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        if (n == 1) return heights[0];

        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Find NSE (Next Smaller Element)
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        // Clear stack for PSE computation
        stack.clear();

        // Find PSE (Previous Smaller Element)
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }
            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        // Compute max area
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }
}
