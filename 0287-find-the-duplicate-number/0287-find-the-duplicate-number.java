class Solution {
    public int findDuplicate(int[] nums) {
        int max = nums.length;
        int[] arr = new int[max+1];
        for(int nm: nums){
             arr[nm]++;
            if(arr[nm]>1){
                return nm;
            }
            
        }
         return max;
    }
}