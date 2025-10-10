class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        res[0]=nums[0];
        for(int i=1; i<n; i++){
if(i>res[i-1]){
   return false;
}
else{
 res[i] = Math.max(res[i - 1], i + nums[i]);
}
        }
    return res[n-1]>=n-1;
    }
}