class Solution {
    public boolean dfs(int source, int dist,Map<Integer, List<Integer>> graph, boolean[] visited) {

        if(source == dist) return true;
        visited[source]=true;
        for(int node: graph.get(source)) {
             if(!visited[node]) {
                if(dfs(node, dist, graph, visited)){
                    return true;
                }
             }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
    Map<Integer, List<Integer>> graph = new LinkedHashMap<>();
    for(int i=0; i<n; i++){
        graph.putIfAbsent(i, new ArrayList<>());
    }
    for(int arr[]: edges) {
        graph.get(arr[0]).add(arr[1]);
        graph.get(arr[1]).add(arr[0]);
    }
    boolean [] visited=new boolean[n];
    return dfs(source, destination, graph, visited);
    }
}