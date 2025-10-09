class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> graph = new LinkedHashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        for(int[] pre : prerequisites)  {
            int first = pre[0];
            int second = pre[1];
            graph.putIfAbsent(second, new ArrayList<>());
            graph.get(second).add(first); 
        }
        HashSet<Integer>path = new HashSet<>();
        for(int current = 0; current<numCourses; current++) {
              if(!dfs(graph, current, visited, path)){
                return false;
              }
        }
        return true;
    }
    public boolean dfs(HashMap<Integer,List<Integer>>graph, int current,HashSet<Integer> visited, HashSet<Integer> path){
        if(path.contains(current)) {
            return false;
        }
         if(visited.contains(current)) {
            return true;
         }
         path.add(current);
         if(graph.containsKey(current)){
          for(int node: graph.get(current)) {
            if(!dfs(graph, node, visited,path)){
                return false;
            }}
         }
         path.remove(current);
         visited.add(current);
         return true;
    }
}