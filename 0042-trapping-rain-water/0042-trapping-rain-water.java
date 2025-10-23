class Solution {
    public int trap(int[] height) {
        int ans =0;
        int left=0;
        int n = height.length;
        int right = n-1; 
        int leftMax=0;
        int rightMax=0;
        while(left<right) {
         if(height[left]<=height[right]) {
            if(leftMax<height[left]) 
            {
                leftMax=height[left];
            } else{
                ans+=leftMax-height[left];
            }
            left++;
         }
          else{
            if(rightMax<height[right]) 
            {
                rightMax=height[right];
            } else{
                ans+=rightMax-height[right];
            }
            right--;
          }
        }
        return ans;
    }
}