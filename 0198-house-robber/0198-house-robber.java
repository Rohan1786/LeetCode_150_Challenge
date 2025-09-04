class Solution {
    public int choryKaro(int[] nums, int i, int[] memo) {
        if (i >= nums.length) return 0; // base case
        
        if (memo[i] != -1) return memo[i]; // memoization check
  
        int skip = choryKaro(nums, i + 1, memo);
        int rob = nums[i] + choryKaro(nums, i + 2, memo);
        
        return memo[i] = Math.max(skip, rob);
    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] memo = new int[n];
        Arrays.fill(memo, -1);
        
        return choryKaro(nums, 0, memo); // start from first house
    }
}
