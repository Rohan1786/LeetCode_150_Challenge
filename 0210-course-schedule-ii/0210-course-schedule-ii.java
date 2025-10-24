class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] indegree = new int[numCourses];
        Map<Integer,List<Integer>> graph = new LinkedHashMap<>();
        for(int i=0; i<numCourses; i++){
            graph.putIfAbsent(i, new ArrayList<>());
        }

        for(int[]arr: prerequisites) {
            int a = arr[0];
            int b = arr[1];
            graph.get(b).add(a);
            indegree[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<numCourses; i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        int[] current = new int[numCourses];
        int index=0;
        while(!q.isEmpty()) {
            int curr = q.poll();
           current[index++]=curr;
            for(int node: graph.get(curr)){
                 indegree[node]--;
                if (indegree[node] == 0) {
                    q.add(node);
                }
            }
        }
        if(index==numCourses) {
            return current;
        } else{
            return new int[0];
        }
    }
}