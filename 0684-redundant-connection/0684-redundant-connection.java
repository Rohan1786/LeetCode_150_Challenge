class Solution {
    public int[] findRedundantConnection(int[][] edges) {
       int n = edges.length;
       int[] parent = new int[n+1];
       for(int i=1; i<=n; i++){
        parent[i]=i;
       }
  for(int [] edge: edges){
    int curr = edge[0];
    int e = edge[1];
    int node1 = find(parent, curr);
    int node2 = find(parent, e);
     
    if(node1==node2) return edge;
    parent[node2]=node1;
  }
  return new int[0];
    }
    public int find(int[] parent, int node){
        while(node!=parent[node]){
            int cur = parent[parent[node]];
            node = parent[node];
        }
        return node;
    }
}