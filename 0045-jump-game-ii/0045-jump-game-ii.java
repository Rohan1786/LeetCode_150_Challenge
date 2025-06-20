class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
       int end = 0, farest = 0;
       int steps = 0;
       for(int i = 0; i < n-1; i++){
        farest = Math.max(nums[i]+i,farest);
        if(i == end){
            steps++;
            end = farest;
        }
       }
       return steps;
    }
}