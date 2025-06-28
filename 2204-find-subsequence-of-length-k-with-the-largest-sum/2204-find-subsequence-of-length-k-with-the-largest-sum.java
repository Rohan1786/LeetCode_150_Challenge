import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        
        // Store elements with their original indices
        int[][] pair = new int[n][2];
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }

        // Sort by value in descending order
        Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));

        // Get top k elements
        Arrays.sort(pair, 0, k, (a, b) -> Integer.compare(a[1], b[1]));

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = pair[i][0];
        }

        return res;
    }
}
