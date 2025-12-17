class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int maxLength = 1;

        for (int num : set) { 
            if (set.contains(num - 1)) continue; 
            int currNum = num;
            int curr = 1; 
            while (set.contains(currNum + 1)) {
                currNum++;
                curr++;
            } 
            maxLength = Math.max(maxLength, curr);
        }

        return maxLength;
    }
}
