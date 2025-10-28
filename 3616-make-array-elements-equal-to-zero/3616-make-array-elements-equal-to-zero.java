class Solution {
    public int countValidSelections(int[] nums) {
       int total = Arrays.stream(nums).sum(); 
       int n = nums.length;
       int leftSum=0;
       int rightSum=0;
       int currSum =0;
       int result=0;
       for(int i=0; i<n; i++){
        currSum+=nums[i];
        if(nums[i]!=0){
            continue;
        }
         else if(nums[i]==0){
            leftSum =  currSum;
            rightSum = total-leftSum;
        }
         if(leftSum==rightSum) {
            result+=2;
        }
        if(Math.abs(leftSum-rightSum)==1){
            result+=1;
        }
       }
return result;
    }
}