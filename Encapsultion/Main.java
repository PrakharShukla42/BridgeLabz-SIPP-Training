package Encapsultion;

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Prakhar");
        s.setAge(21);

        System.out.println("Student Name: " + s.getName());
        System.out.println("Student Age: " + s.getAge());

        s.setAge(-5);
    }
}
