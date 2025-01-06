// TLE ON HIDDEN CASE
class Task {
    int userId;
    int taskId;
    int priority;

    public Task(int userId, int taskId, int priority) {
        this.userId = userId;
        this.taskId = taskId;
        this.priority = priority;
    }
}

class TaskManager {
    private PriorityQueue<Task> pTask;
    private Map<Integer, Task> taskMap;

    public TaskManager(List<List<Integer>> tasks) {
        pTask = new PriorityQueue<>((t1, t2) -> {
            if (t1.priority == t2.priority) {
                return Integer.compare(t2.taskId, t1.taskId);
            }
            return Integer.compare(t2.priority, t1.priority);
        });

        taskMap = new HashMap<>();

        for (List<Integer> task : tasks) {
            int userId = task.get(0);
            int taskId = task.get(1);
            int priority = task.get(2);
            Task newTask = new Task(userId, taskId, priority);
            pTask.add(newTask);
            taskMap.put(taskId, newTask);
        }
    }

    public void add(int userId, int taskId, int priority) {
        Task newTask = new Task(userId, taskId, priority);
        pTask.add(newTask);
        taskMap.put(taskId, newTask);
    }

    public void edit(int taskId, int newPriority) {
        Task task = taskMap.get(taskId);
        if (task != null) {
            pTask.remove(task); 
            task.priority = newPriority;
            pTask.add(task);
        }
    }

    public void rmv(int taskId) {
        Task task = taskMap.get(taskId);
        if (task != null) {
            pTask.remove(task);
            taskMap.remove(taskId);
        }
    }

    public int execTop() {
        if (pTask.isEmpty()) {
            return -1;
        }

        Task topTask = pTask.poll();
        taskMap.remove(topTask.taskId);
        return topTask.userId;
    }
}
