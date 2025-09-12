class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> graph = new ArrayList<>();
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] arr: edges){
            int u =arr[0];
            int v= arr[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        boolean []vis = new boolean[n];
        Stack<Integer> stack =new Stack<>();
        stack.push(source);
        while(!stack.isEmpty()){
            int node = stack.pop();
            if (node == destination) return true;
            if (vis[node]) continue;
            vis[node] = true;
                
            for(int neigh: graph.get(node)){
                if(!vis[neigh]){
                 
                    stack.push(neigh);
                }
            }
        }
   return false;
    }
}