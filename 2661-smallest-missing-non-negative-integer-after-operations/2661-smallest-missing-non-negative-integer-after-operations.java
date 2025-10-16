class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        HashMap<Integer, Integer> freq = new HashMap<>();
 
        for (int num : nums) {
            int rem = ((num % value) + value) % value; // handle negatives
            freq.put(rem, freq.getOrDefault(rem, 0) + 1);
        }
 
        int i = 0;
        while (true) {
            int rem = i % value;
            if (!freq.containsKey(rem) || freq.get(rem) == 0) {
                return i;
            }
            freq.put(rem, freq.get(rem) - 1);
            i++;
        }
    }
}
