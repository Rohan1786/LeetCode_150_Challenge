class Solution {
    public long zeroFilledSubarray(int[] nums) {
    int n = nums.length;
    int i=0;
    long result =0;
    while(i<n){
        long l=0;
        if(nums[i]==0){
            while(i<n && nums[i]==0){
                l++;
                i++;
            }
        
        }
        result+=(l)*(l+1)/2;
        i++;

    }
    return result;
    }
}