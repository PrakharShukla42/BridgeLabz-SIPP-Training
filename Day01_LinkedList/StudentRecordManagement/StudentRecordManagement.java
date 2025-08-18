import java.util.Scanner;

public class StudentRecordManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentList list = new StudentList();

        while (true) {
            System.out.println("\n1. Add at Beginning");
            System.out.println("2. Add at End");
            System.out.println("3. Delete by Roll No");
            System.out.println("4. Search by Roll No");
            System.out.println("5. Update Grade");
            System.out.println("6. Display All");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Roll No: ");
                    int r1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n1 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int a1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String g1 = sc.nextLine();
                    list.addAtBeginning(r1, n1, a1, g1);
                    break;

                case 2:
                    System.out.print("Enter Roll No: ");
                    int r2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String n2 = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int a2 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String g2 = sc.nextLine();
                    list.addAtEnd(r2, n2, a2, g2);
                    break;

                case 3:
                    System.out.print("Enter Roll No to Delete: ");
                    int d = sc.nextInt();
                    list.delete(d);
                    break;

                case 4:
                    System.out.print("Enter Roll No to Search: ");
                    int s = sc.nextInt();
                    Student found = list.search(s);
                    if (found != null)
                        System.out.println(found.rollNo + " " + found.name + " " + found.age + " " + found.grade);
                    else
                        System.out.println("Student not found.");
                    break;

                case 5:
                    System.out.print("Enter Roll No: ");
                    int u = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Grade: ");
                    String ng = sc.nextLine();
                    list.updateGrade(u, ng);
                    break;

                case 6:
                    list.display();
                    break;

                case 7:
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
