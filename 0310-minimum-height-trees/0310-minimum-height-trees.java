class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n==1) return List.of(0);
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<n; i++)
        {
            graph.putIfAbsent(i, new ArrayList<>());
        }
        int[] indegree = new int[n];

        for(int[] e: edges) {
        int u = e[0], v=e[1];
      graph.get(u).add(v);
      graph.get(v).add(u);
      indegree[u]++;
       indegree[v]++;
        }
        Queue<Integer> q = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(indegree[i]==1){
                q.add(i);
            }
        }
      while(n>2){
        int size = q.size();
        n-=size;
        while(size-->0){
            int node = q.poll();
            for(int u: graph.get(node)){
                indegree[u]--;
                if(indegree[u]==1){
                    q.add(u);
                }
            }
        }
      }
      while(!q.isEmpty()){
        res.add(q.poll());
      }
      return res;
    }
}