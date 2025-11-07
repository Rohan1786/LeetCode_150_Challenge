class Solution {
    public int trap(int[] height) {
        int ans = 0;
        int n = height.length;
        int leftMax =height[0];;
        int rightMax =height[n-1];
        int left =0;
        int right = height.length-1;
        while(left<right)
        {
            if(height[left]<=height[right]){
                leftMax =Math.max(leftMax, height[left]);
                if(leftMax-height[left]>0){
                    ans += leftMax - height[left];
                }
                left++;
                }
                else{
                  rightMax=Math.max(rightMax, height[right]);
                  if(rightMax-height[right]>0){
                    ans += rightMax-height[right];
                  }
                  right--;
                }
            }
        
        return ans;
    }
}