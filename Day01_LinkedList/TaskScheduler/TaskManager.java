package Day01_LinkedList.TaskScheduler;

import java.util.Scanner;

public class TaskManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskScheduler scheduler = new TaskScheduler();

        while (true) {
            System.out.println("\n1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Display All Tasks");
            System.out.println("4. Search by Priority");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Task ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Task Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Priority: ");
                    int priority = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Due Date: ");
                    String due = sc.nextLine();
                    scheduler.addTask(id, name, priority, due);
                    break;

                case 2:
                    System.out.print("Enter Task ID to Remove: ");
                    int rid = sc.nextInt();
                    scheduler.removeTask(rid);
                    break;

                case 3:
                    scheduler.display();
                    break;

                case 4:
                    System.out.print("Enter Priority to Search: ");
                    int p = sc.nextInt();
                    scheduler.searchByPriority(p);
                    break;

                case 5:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
