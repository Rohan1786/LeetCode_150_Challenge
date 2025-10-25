class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) return Collections.singletonList(0);
 
        List<Set<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new HashSet<>());
        }
        int[] degree = new int[n];
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
            degree[u]++;
            degree[v]++;
        }
 
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (degree[i] == 1) {
                q.offer(i);
            }
        }
     List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            res = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int node = q.poll();
                res.add(node);
                for (int neighbor : graph.get(node)) {
                     degree[neighbor]--;
                    graph.get(neighbor).remove(node);
                    if (degree[neighbor] == 1) {
                        q.offer(neighbor);
                    }
                }
            }
        }

        return res; // remaining 1–2 nodes are the MHT roots
    }
}
 