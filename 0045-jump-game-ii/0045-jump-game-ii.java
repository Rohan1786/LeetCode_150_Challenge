class Solution {
    public int jump(int[] nums) {
       int jump =0, currEnd=0;
       int currMax =0, n = nums.length;
       int jumps=0;
       for(int i=0; i<n-1; i++){
        currMax=Math.max(i+nums[i], currMax);
        if(currEnd == i){
            jumps++;
            currEnd = currMax;
        }
       }
       return jumps;
    }
}