class Solution {
    public int countHillValley(int[] nums) {
        int i=0;
        int cnt =0;
        int j=1;
        int n= nums.length;
        while(j+1<n){
        if((nums[i]<nums[j] && nums[j]>nums[j+1] )||  (nums[i]>nums[j] && nums[j]<nums[j+1])){
            i=j;
            cnt++;
        }
       j++;
       }
        return cnt;
    }
}