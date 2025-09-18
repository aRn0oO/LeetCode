class TaskManager {
    class Task implements Comparable<Task>{
        int userId, taskId, priority;
        public Task(int userId,int taskId, int priority){
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
        @Override
        public int compareTo(Task other){
            if(this.priority != other.priority)
                return -Integer.compare(this.priority, other.priority);
            return -Integer.compare(this.taskId, other.taskId);
        }

    }

    private PriorityQueue<Task> manager;
    private Map<Integer, Task> map;
    public TaskManager(List<List<Integer>> tasks) {
        manager= new PriorityQueue<>();
        map = new HashMap<>();

        for(List<Integer> task : tasks)
            add(task.get(0), task.get(1),task.get(2));

    }
    
    public void add(int userId, int taskId, int priority) {
        Task t = new Task(userId, taskId, priority);
        manager.offer(t);
        map.put(taskId, t);
    }
    
    public void edit(int taskId, int newPriority) {
        Task t= map.get(taskId);
        if(t == null) return;
        manager.remove(t);
        t.priority= newPriority;
        manager.offer(t);
    }
    
    public void rmv(int taskId) {
        Task task = map.get(taskId);
        if(task != null){
            manager.remove(task);
            map.remove(task);
        }
    }
    
    public int execTop() {  
        Task t = manager.poll();
        if(manager.isEmpty()) return -1;
        map.remove(t.taskId);
        return t.userId;

    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */