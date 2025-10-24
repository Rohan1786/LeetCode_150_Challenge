class Solution {
    public boolean bfs(Map<Integer, List<Integer>> graph, int start) {
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add(start);
        visited.add(start);
        while(!q.isEmpty()) {
            int curr = q.poll();
            for(int node: graph.get(curr)) {
                if(!visited.contains(node)) {
                    visited.add(node);
                    q.add(node);
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new LinkedHashMap<>();
        for(int i=0; i<numCourses; i++){
            graph.putIfAbsent(i, new ArrayList<>());
        }
         Queue<Integer> q= new LinkedList<>();
         int[] indegree = new int[numCourses];
         for(int[]arr: prerequisites) {
            int a = arr[0];
            int b = arr[1];
            graph.get(b).add(a);
            indegree[a]++;
         }
         for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                q.add(i);
            }
         }
         int visited=0;
         while(!q.isEmpty()) {
       int curr = q.poll();
       visited++;
       for(int node: graph.get(curr)) {
        indegree[node]--;
        if(indegree[node]==0){
            q.add(node);
        }
       }
         }
         return visited==numCourses;
    }
}