package Keywords;

class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;
    String name;
    final String rollNumber;
    String grade;
    Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    void displayDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Grade: " + grade);
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("Prakhar", "22BCS123", "A");
        s1.displayDetails();
        Student.displayTotalStudents();
    }
}
