class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int totalGCD = nums[0];

        // Compute total GCD
        for (int i = 1; i < n; i++) {
            totalGCD = gcd(totalGCD, nums[i]);
        }
        if (totalGCD > 1) return -1;  // Impossible

        int countOnes = 0;
        for (int x : nums) {
            if (x == 1) countOnes++;
        }
        if (countOnes > 0) {
            return n - countOnes;
        }

        int minLen = Integer.MAX_VALUE;

        // Find minimum subarray with GCD == 1
        for (int i = 0; i < n; i++) {
            int g = nums[i];
            for (int j = i + 1; j < n; j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    minLen = Math.min(minLen, j - i + 1);
                    break; // Stop expanding further
                }
            }
        }

        // (minLen - 1) + (n - 1)
        return (minLen - 1) + (n - 1);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}