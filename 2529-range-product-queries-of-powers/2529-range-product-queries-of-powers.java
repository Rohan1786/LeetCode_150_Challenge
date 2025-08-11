class Solution {
    int mod = 1000000007;

    public int[] productQueries(int n, int[][] queries) {
        // Step 1: Extract powers of two from n (in order)
        ArrayList<Integer> powers = new ArrayList<>();
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) { // bit is set
                powers.add(1 << i);
            }
        }

        // Step 2: Process queries
        int size = queries.length;
        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            long product = 1;

            for (int j = left; j <= right; j++) {
                product = (product * powers.get(j)) % mod;
            }
            res[i] = (int) product;
        }

        return res;
    }
}
