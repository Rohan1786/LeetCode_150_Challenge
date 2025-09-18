class TaskManager {

    private static class Task {
        int userId, taskId, priority;
        Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
    }

    private Map<Integer, Task> taskMap; // taskId → Task
    private PriorityQueue<Task> pq;     // max-heap

    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        pq = new PriorityQueue<>((a, b) -> {
            if (b.priority != a.priority) return Integer.compare(b.priority, a.priority);
            return Integer.compare(b.taskId, a.taskId); // higher taskId wins if same priority
        });

        for (List<Integer> t : tasks) {
            add(t.get(0), t.get(1), t.get(2));
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        taskMap.put(taskId, task);
        pq.offer(task);
    }

    public void edit(int taskId, int newPriority) {
        Task oldTask = taskMap.get(taskId);
        if (oldTask == null) return;
        // remove outdated version (lazy removal handled in execTop)
        Task newTask = new Task(oldTask.userId, taskId, newPriority);
        taskMap.put(taskId, newTask);
        pq.offer(newTask);
    }

    public void rmv(int taskId) {
        taskMap.remove(taskId); // lazy removal (let execTop skip outdated tasks)
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            Task top = pq.poll();
            // check if this version is still valid
            Task current = taskMap.get(top.taskId);
            if (current != null && current == top) {
                taskMap.remove(top.taskId);
                return top.userId;
            }
        }
        return -1;
    }
}