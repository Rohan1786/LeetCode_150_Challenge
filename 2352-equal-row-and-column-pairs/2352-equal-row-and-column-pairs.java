class Solution {
    public int equalPairs(int[][] grid) {
        Map<String, Integer> map = new HashMap<>();
        int n = grid.length;
        for(int i=0; i<n; i++){
            String rows = Arrays.toString(grid[i]);
            map.put(rows, map.getOrDefault(rows, 0)+1);
        }
        int pair=0;
        for(int j=0; j<n; j++){
            int[]col = new int[n];
            for(int i=0; i<n; i++){
            col[i]=grid[i][j];
            }
            String cols = Arrays.toString(col);
            if(map.containsKey(cols)) pair+=map.get(cols);
        }
        return pair;
    }
}