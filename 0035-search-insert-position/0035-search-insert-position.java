class Solution {
    public int searchInsert(int[] nums, int target) {
    int n=nums.length;
    int cnt =0;
    for(int i=0; i<n; i++){
        if(nums[i]==target){
            return i;
        }
        else if(nums[i]<target){
            cnt =i+1;
        }
    }
    return cnt;
    }
}