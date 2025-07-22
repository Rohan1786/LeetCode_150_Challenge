class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left =0,right =0;
        int n = nums.length;
        HashSet<Integer> seen = new HashSet<>();
        int maxSum=0,sum=0;
      while (right < nums.length) {
            if (!seen.contains(nums[right])) {
                sum += nums[right];
                seen.add(nums[right]);
                maxSum = Math.max(maxSum, sum);
                right++;
            } else {
                // remove from start until duplicate is removed
                sum -= nums[left];
                seen.remove(nums[left]);
                left++;
            }
        }

        return maxSum;
    }
}