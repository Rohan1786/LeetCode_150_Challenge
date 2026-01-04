class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> graph = new HashMap<>();
    PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1]));


        for(int arr[]: times){
           graph.computeIfAbsent(arr[0], x-> new ArrayList<>()).add(new int[]{arr[1], arr[2]});
        }

int[] distance = new int[n+1];
Arrays.fill(distance, Integer.MAX_VALUE);
distance[k]=0;
pq.offer(new int[]{k, 0});
while(!pq.isEmpty()){
    int[] curr = pq.poll();
    int node = curr[0];
    int dist = curr[1];
    if(dist!=distance[node]) continue;
  if(graph.containsKey(node)){
    for(int[] neighbour: graph.get(node)){
        int nextNode = neighbour[0];
        int nextDist = neighbour[1];
        int newDist = nextDist+dist;
        if(newDist< distance[nextNode]){
            distance[nextNode]=newDist;
            pq.offer(new int[]{nextNode, newDist});
        }

    }
  }
}

int max = Arrays.stream(distance).skip(1).max().getAsInt();
return max==Integer.MAX_VALUE?-1:max;
    }
}