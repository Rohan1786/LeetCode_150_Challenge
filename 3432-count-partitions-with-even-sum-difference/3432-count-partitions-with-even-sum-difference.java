class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        return sum%2==0?n-1:0;
    }
}