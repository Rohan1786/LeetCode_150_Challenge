class Solution {
    public int longestOnes(int[] nums, int k) {
        int windowSum = 0;
        int left =0;
        int maxLen=0;
      for(int right =0; right<nums.length; right++) {
        windowSum+=nums[right];
        while(windowSum+k<right-left+1) {
            windowSum-=nums[left];
            left++;
        }
        maxLen = Math.max(right-left+1, maxLen);
      }
      return maxLen;
    }
}