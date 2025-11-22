class Solution {
    public int minimumOperations(int[] nums) {
        int res = 0;
        for(int num: nums)
        {   
            int rem=num%3;
            res +=Math.min(rem,3-rem);
        }
        return res;
    }
}