class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastIndex =-1;
        int n = nums.length;
        for(int i=0; i<n; i++){
           if(nums[i]==1){
            if(lastIndex!=-1 && i-lastIndex-1<k){
            return false;
           }
           lastIndex=i;
        }}
        return true;
    }
}