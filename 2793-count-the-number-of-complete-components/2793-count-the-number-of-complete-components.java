class Solution {
   

    // Build adjacency list graph
    private Map<Integer, List<Integer>> buildGraph(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int[] e : edges) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        return graph;
    }

    public int countCompleteComponents(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = buildGraph(n, edges);
        Set<Integer> visited = new HashSet<>();
        int count = 0;

        // check each unvisited node → new component
        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                List<Integer> component = dfs(i, graph, visited);
                if (isComplete(graph, component)) {
                    count++;
                }
            }
        }
        return count;
    }

    // DFS using stack → return all nodes in component
    private List<Integer> dfs(int start, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        Stack<Integer> stack = new Stack<>();
        List<Integer> component = new ArrayList<>();

        stack.push(start);
        visited.add(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            component.add(node);

            for (int nei : graph.get(node)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    stack.push(nei);
                }
            }
        }
        return component;
    }

    // Check if the component forms a complete graph
    private boolean isComplete(Map<Integer, List<Integer>> graph, List<Integer> comp) {
        int k = comp.size();
        int expectedEdges = k * (k - 1) / 2;
        int edgeCount = 0;

        for (int node : comp) {
            edgeCount += graph.get(node).size();
        }
        edgeCount /= 2; // because undirected edges counted twice

        return edgeCount == expectedEdges;
    }
}