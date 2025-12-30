class Solution {
    public int maxSubArray(int[] nums) {
        int currSum =0;
        int max =nums[0];
        int n  = nums.length;
        for(int i=0; i<n; i++){
            if(currSum<0){
                currSum =0;
            }  
         currSum+=nums[i];
         
            max = Math.max(currSum, max);
        }
        return max;
    }
}