class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean[] used = new boolean[n]; // Track if basket is already used
        int unplaced = 0;

        for (int i = 0; i < n; i++) {
            boolean placed = false;

            for (int j = 0; j < n; j++) {
                if (!used[j] && baskets[j] >= fruits[i]) {
                    used[j] = true; // mark this basket as used
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                unplaced++; // this fruit couldn't be placed
            }
        }

        return unplaced;
    }
}
