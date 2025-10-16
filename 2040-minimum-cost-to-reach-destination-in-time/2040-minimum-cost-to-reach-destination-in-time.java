class Solution {
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        List<List<int[]>> graph = new ArrayList<>();
        int n = passingFees.length;
        for(int i=0; i<n; i++){
            graph.add(new ArrayList<>());
        }
   for(int[] e: edges) {
     int u = e[0], v=e[1], w=e[2];
     graph.get(u).add(new int[]{v,w});
     graph.get(v).add(new int[]{u,w});
        }
        int[]minCost = new int[n];
        int[]minTime = new int[n];
        Arrays.fill(minCost,Integer.MAX_VALUE);
        Arrays.fill(minTime, Integer.MAX_VALUE);
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        minCost[0]=passingFees[0];
        minTime[0]=0;
        pq.offer(new int[] {0, passingFees[0], 0});
        while(!pq.isEmpty()) {
            int[] curr = pq.poll();
            int node = curr[0], cost = curr[1], t = curr[2];
            if(node==n-1) return cost;
            for(int[] neigh: graph.get(node)) {
                 int nei = neigh[0], time = neigh[1];
                 int newTime = t+time;
                 int newCost = cost+ passingFees[nei];
   if (newTime <= maxTime && (newCost < minCost[nei] || newTime < minTime[nei])) {
                    minCost[nei] = newCost;
                    minTime[nei] = newTime;
                    pq.offer(new int[]{nei, newCost, newTime});
                }
            }
        }
        return -1;
    }
}