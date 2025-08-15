class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer, List<Integer>> courseGraph = new HashMap<>();

        // Build graph without returning false early
        for (int[] pre : prerequisites) {
            int course = pre[0];
            int prereq = pre[1];
            courseGraph.putIfAbsent(prereq, new ArrayList<>());
            courseGraph.get(prereq).add(course);
        }

        HashSet<Integer> visited = new HashSet<>(); // fully processed
        HashSet<Integer> path = new HashSet<>();    // current recursion path

        for (int current = 0; current < numCourses; current++) {
            if (!courseSchedule(current, visited, path, courseGraph)) {
                return false;
            }
        }
        return true;
    }

    public boolean courseSchedule(int currentCourse,
                                   Set<Integer> visited,
                                   Set<Integer> path,
                                   HashMap<Integer, List<Integer>> graph) {

        if (path.contains(currentCourse)) {
            return false; // cycle found
        }
        if (visited.contains(currentCourse)) {
            return true; // already checked & safe
        }

        path.add(currentCourse);

        if (graph.containsKey(currentCourse)) {
            for (int pre : graph.get(currentCourse)) {
                if (!courseSchedule(pre, visited, path, graph)) {
                    return false;
                }
            }
        }

        path.remove(currentCourse);
        visited.add(currentCourse);

        return true;
    }
}
