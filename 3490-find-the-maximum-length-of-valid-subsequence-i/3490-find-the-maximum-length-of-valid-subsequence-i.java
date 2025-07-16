class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        int even=0;
        int odd=0;
        int alternate=1;
      for(int num:nums){
        if(num%2==0){
          even++;
        }
        else{
            odd++;
        }
      }
      int parity=nums[0]%2; // 1
      for(int i=1;i<n;i++){
        int current = nums[i]%2; // 0
        if(parity!=current){
            parity=current;
            alternate++;
        }
      }
      return Math.max(alternate,Math.max(odd,even));
    }
}
