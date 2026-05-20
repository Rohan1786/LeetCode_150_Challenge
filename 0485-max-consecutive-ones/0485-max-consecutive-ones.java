class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int left =0;
        int maxCount = 0;
        int n = nums.length;
        int count  = 0;
        for(int right =0; right<n; right++){
            if(nums[right]!=0){
                count+=nums[right];
                maxCount = Math.max(count, maxCount);
            }
            else{
                maxCount = Math.max(count, maxCount);
                count = 0;

            }
         
        }
        return maxCount;
    }
}