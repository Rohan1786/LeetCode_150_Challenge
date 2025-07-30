class Solution {
    public int longestSubarray(int[] nums) {
        // 1) find the global maximum
        int maxVal = Integer.MIN_VALUE;
        for (int x : nums) {
            if (x > maxVal) maxVal = x;
        }
        
        // 2) scan for the longest consecutive run of maxVal
        int maxLen = 0, currLen = 0;
        for (int x : nums) {
            if (x == maxVal) {
                currLen++;
                if (currLen > maxLen) {
                    maxLen = currLen;
                }
            } else {
                currLen = 0;
            }
        }
        return maxLen;
    }
}
