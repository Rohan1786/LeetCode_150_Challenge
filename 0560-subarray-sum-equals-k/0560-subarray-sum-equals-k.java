class Solution {
    public int subarraySum(int[] nums, int k) {
        int cnt=0;
       for(int i=0; i<nums.length; i++){
        int value = nums[i];
        if(value==k){
            cnt++;
        }
        for(int j=i+1; j<nums.length; j++){ 
             value+=nums[j];
            if(k==value){
                cnt++;
            }
           
        }
       }
        return cnt;
    }
}