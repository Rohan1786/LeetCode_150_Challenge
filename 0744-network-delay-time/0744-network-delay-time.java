class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
       HashMap<Integer, List<int[]>> graph = new HashMap<>(); // Change the value type
for (int[] edge : times) {
    graph.computeIfAbsent(edge[0], x -> new ArrayList<>()).add(new int[]{edge[1], edge[2]});
}
        PriorityQueue<int[]> pq= new PriorityQueue<>(Comparator.comparingInt(a->a[1]));
        pq.offer(new int[]{k,0});
        int[] distances= new int[n+1];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[k]=0;
        while(!pq.isEmpty()) {
    int[] current= pq.poll();
    int currentNode = current[0];
    int currentDist = current[1];
    if(currentDist>distances[currentNode]) {
        continue;

    }

    if(graph.containsKey(currentNode)){
          for(int[] neighbour : graph.get(currentNode)) {
            int nextNode = neighbour[0];
            
            int nextDist = currentDist+neighbour[1];
            if(nextDist<distances[nextNode]) {
                distances[nextNode]=nextDist;
                pq.offer(new int[]{nextNode,nextDist});
            }

          }
    }
        }
        int max=Arrays.stream(distances).skip(1).max().getAsInt();
        return max==Integer.MAX_VALUE?-1:max;
            }
}