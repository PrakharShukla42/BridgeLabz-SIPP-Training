package Inheritance.HybridInheritance;


public class Main {
    public static void main(String[] args) {
        Student student = new Student("Prakhar", 20, "Computer Science");
        Teacher teacher = new Teacher("Mr. Manu Saini", 45, "Mathematics");
        TeachingAssistant ta = new TeachingAssistant("Tanmay", 22, "Data Science", "Machine Learning");

        student.displayStudentInfo();
        System.out.println();
        teacher.displayTeacherInfo();
        System.out.println();
        ta.displayTAInfo();
    }
}
