class Solution {
    public int findLucky(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int value = arr[i] & 65535;  // get original value (lower 16 bits)
            if (value <= n && value > 0) {
                arr[value - 1] += (1 << 16);  // increment freq count in upper 16 bits
            }
        }

        for (int val = n; val >= 1; val--) {
            int freq = arr[val - 1] >> 16;
            if (freq == val) {
                return val;
            }
        }

        return -1;
    }
}
