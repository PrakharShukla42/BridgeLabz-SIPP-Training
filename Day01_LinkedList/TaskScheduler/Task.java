package Day01_LinkedList.TaskScheduler;

public class Task {
    int taskId, priority;
    String taskName, dueDate;
    Task next;

    public Task(int id, String name, int priority, String due) {
        this.taskId = id;
        this.taskName = name;
        this.priority = priority;
        this.dueDate = due;
        this.next = null;
    }
}
