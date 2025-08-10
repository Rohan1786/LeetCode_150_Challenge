class Solution {
    public int maxArea(int[] height) {
      int n = height.length;
      int left =0;
      int right = n-1;
      int maxArea=0;
      while(left<right) {
        int min =Integer.MAX_VALUE;
        int width = right - left;;
        min=Math.min(height[left],height[right]);
        int area = min * width;
        maxArea= Math.max(area,maxArea);
        if(height[left]<height[right]) {
            left++;
        }
        else{
            right--;
        }
      }
        return maxArea;
    }
}