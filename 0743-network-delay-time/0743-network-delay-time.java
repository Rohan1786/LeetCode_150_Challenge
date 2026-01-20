class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<int[]>> graph = new ArrayList<>();
        for(int i=0; i<=n; i++){
            graph.add(new ArrayList<>());
        }
        for(int[] edge : times){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            graph.get(u).add(new int[]{v, w});
        }
        int[] dist =new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b)->a[1]-b[1]);
        pq.offer(new int[]{k, 0});
        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0];
            int d = curr[1];
            if(d>dist[node]){
                continue;
            }
        
                for(int[]neigh: graph.get(node)){
                    int currNode = neigh[0];
                    int weight = neigh[1];
                    if(d+weight<dist[currNode]){
                        dist[currNode]=d+weight;
                         pq.offer(new int[]{currNode, dist[currNode]});
                    }
                   
                }
            
        }
        int max =Arrays.stream(dist).skip(1).max().getAsInt();
        return max==Integer.MAX_VALUE?-1:max;
    }
}