package Day01_LinkedList.TaskScheduler;

public class TaskScheduler {
    Task head = null;

    public void addTask(int id, String name, int priority, String due) {
        Task newNode = new Task(id, name, priority, due);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Task temp = head;
        while (temp.next != head) temp = temp.next;
        temp.next = newNode;
        newNode.next = head;
    }

    public void removeTask(int id) {
        if (head == null) return;
        Task curr = head, prev = null;
        do {
            if (curr.taskId == id) {
                if (prev != null) {
                    prev.next = curr.next;
                } else {
                    Task temp = head;
                    while (temp.next != head) temp = temp.next;
                    head = head.next;
                    temp.next = head;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void display() {
        if (head == null) return;
        Task temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName + " " + temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) return;
        Task temp = head;
        do {
            if (temp.priority == priority)
                System.out.println("Found: " + temp.taskName);
            temp = temp.next;
        } while (temp != head);
    }
}
