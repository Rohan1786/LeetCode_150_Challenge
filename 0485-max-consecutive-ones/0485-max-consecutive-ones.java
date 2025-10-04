class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
         int cnt=0;
        int maxCount=0;
        for(int i=0; i<nums.length; i++){
        if(nums[i]!=0){
            cnt++;
        }else{
            maxCount=Math.max(cnt, maxCount);
            cnt=0;
        }
        }
        return maxCount<cnt?cnt:maxCount;
    }
}