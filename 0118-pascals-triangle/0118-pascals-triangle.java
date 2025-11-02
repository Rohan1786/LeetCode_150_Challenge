class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<numRows; i++)
        {
            List<Integer> row = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                // First and last elements are always 1
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    // Middle elements are sum of two above it
                    int val = res.get(i - 1).get(j - 1) + res.get(i - 1).get(j);
                    row.add(val);
                }
            }
            
            res.add(row);
        }
        return res;
    }
}