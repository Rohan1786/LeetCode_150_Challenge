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
    
    // return dfs(source, destination, graph, visited);
    //above calculations is for dfs and now we will go with bfs too
    return bfs(source, destination, graph, visited);

    }

    public boolean bfs(int s, int d, Map<Integer, List<Integer>> graph, boolean[]visited) {
   Queue<Integer> q = new LinkedList<>();
   if(s==d)return true;
   q.add(s);
   visited[s]=true;
   while(!q.isEmpty()) {
    int curr = q.poll();
    if(curr==d){
        return true;
    }
    for(int node: graph.get(curr)) {
        if(!visited[node]){
            visited[node]=true;
            q.add(node); 
        }
    }
   }
   return false;
    }
}