class Solution {
    public int findCenter(int[][] edges) {
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int[]arr: edges) {
            int first=arr[0];
            int second= arr[1];
            map.put(first, map.getOrDefault(first, 0)+1);
            map.put(second, map.getOrDefault(second, 0)+1);
        }
           for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return entry.getKey();
            }
        }

        return -1;
    }
}