class Solution {
    public int trap(int[] height) {
      int ans =0;
      int n = height.length;
      int left =0;
      int right = n-1;;
      int leftMax=0;
      int rightMax=0;
      while(left<=right) {
       leftMax=Math.max(leftMax,height[left]);
       rightMax=Math.max(rightMax,height[right]);
       if(rightMax<leftMax) {
        ans+=rightMax-height[right];
          right--;
       }
       else{
        ans+=leftMax-height[left];
        left++;
       
       }
      }
 return ans;
    }
}