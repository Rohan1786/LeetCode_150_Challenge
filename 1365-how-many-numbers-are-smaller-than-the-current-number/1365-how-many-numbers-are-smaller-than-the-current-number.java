class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        int i=0;
        for(int num: nums){
            int count=0;
            for(int n: nums){
            if(num>n){
             count++;
            }
            }
            res[i++]=count;
        }
        return res;
    }
}