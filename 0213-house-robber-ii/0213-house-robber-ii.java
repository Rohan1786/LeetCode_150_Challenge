class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
         if (n == 0) return 0;
        if (n == 1) return nums[0];
        int[] skipFirst = new int[n-1];
        int[] skipLast = new int[n-1];
        for(int i=0; i<n-1; i++){
            skipFirst[i]=nums[i+1];
            skipLast[i]=nums[i];
        }
        int res1= robbHelper(skipFirst);
        int res2 = robbHelper(skipLast);
        return Math.max(res1, res2);
    }
    public int robbHelper(int[]arr){
     int n = arr.length;
        if (n == 0) return 0;
        if (n == 1) return arr[0];

        int[] dp = new int[n];
        dp[0] = arr[0];
        dp[1] = Math.max(arr[0], arr[1]);

        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(arr[i] + dp[i - 2], dp[i - 1]);
        }

        return dp[n - 1];
    }
}