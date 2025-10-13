class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left =0;
        int min = Integer.MAX_VALUE;
        int sum =0;
        for(int right =0; right<nums.length; right++) {
            sum+=nums[right];
            while(sum>=target) {
                min=Math.min(right-left+1, min);
                sum=sum-nums[left];
                left++; 
            } 
        }
        return min==Integer.MAX_VALUE?0:min;
    }
}