public class StudentList {
    Student head;

    public void addAtBeginning(int rollNo, String name, int age, String grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int rollNo, String name, int age, String grade) {
        Student newNode = new Student(rollNo, name, age, grade);
        if (head == null) {
            head = newNode;
            return;
        }
        Student temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }

    public void delete(int rollNo) {
        if (head == null) return;
        if (head.rollNo == rollNo) {
            head = head.next;
            return;
        }
        Student temp = head;
        while (temp.next != null && temp.next.rollNo != rollNo)
            temp = temp.next;
        if (temp.next != null) temp.next = temp.next.next;
    }

    public Student search(int rollNo) {
        Student temp = head;
        while (temp != null) {
            if (temp.rollNo == rollNo) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void updateGrade(int rollNo, String grade) {
        Student s = search(rollNo);
        if (s != null) s.grade = grade;
    }

    public void display() {
        Student temp = head;
        while (temp != null) {
            System.out.println(temp.rollNo + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }
}
