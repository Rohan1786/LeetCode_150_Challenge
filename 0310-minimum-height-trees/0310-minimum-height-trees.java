class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
     
        if (n == 1) {
            return List.of(0);
        }

        // Build adjacency list (graph)
        Map<Integer, List<Integer>> graph = new LinkedHashMap<>();
        int[] indegree = new int[n];
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }

        // Build connections and indegrees
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
            indegree[u]++;
            indegree[v]++; // <-- important fix
        }

        // Initialize queue with all leaf nodes (degree == 1)
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 1) {
                q.offer(i);
            }
        }

        // Start BFS trimming leaves layer by layer
        List<Integer> res = new ArrayList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            res = new ArrayList<>(); // new layer

            for (int i = 0; i < size; i++) {
                int node = q.poll();
                res.add(node);

                for (int neighbor : graph.get(node)) {
                    indegree[neighbor]--;
                    if (indegree[neighbor] == 1) {
                        q.offer(neighbor);
                    }
                }
            }
        }

        // Remaining nodes are the MHT roots
        return res;
    }
}
