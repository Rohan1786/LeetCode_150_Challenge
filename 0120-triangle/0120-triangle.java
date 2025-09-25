class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        // Start from the second last row and go upwards
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int curr = triangle.get(i).get(j);
                int down = triangle.get(i + 1).get(j);
                int diag = triangle.get(i + 1).get(j + 1);
                // update current cell with min path sum
                triangle.get(i).set(j, curr + Math.min(down, diag));
            }
        }
        // top element now contains the minimum path sum
        return triangle.get(0).get(0);
    }
}
