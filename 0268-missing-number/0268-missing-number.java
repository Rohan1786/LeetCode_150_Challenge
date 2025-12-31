class Solution {
    public int missingNumber(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        int n = nums.length;
        int avg = n*(n+1)/2;
        return avg-sum;
    }
}