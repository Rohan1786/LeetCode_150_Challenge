class Solution {
    public int longestSubarray(int[] nums) {
        int zeroCount = 0;       
        int longestWindow = 0;   
        int i = 0;                
        
        for (int j = 0; j < nums.length; j++) { // Right pointer expands window
            zeroCount += nums[j] == 0?1:0;
            
            // Shrink window if more than 1 zero is inside
            while (zeroCount > 1) {
                zeroCount -= nums[i] == 0?1:0;
                i++;
            }
            
            // j - i is window length minus one deletion
            longestWindow = Math.max(longestWindow, j - i);
        }
        return longestWindow;
    }
}
