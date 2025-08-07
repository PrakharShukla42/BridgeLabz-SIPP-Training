package Encapsultion;

public class ImmutableStudent {
    private final String name;
    private final int age;

    public ImmutableStudent(String name, int age) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid name.");
        }
        if (age <= 0 || age >= 150) {
            throw new IllegalArgumentException("Invalid age.");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        ImmutableStudent student = new ImmutableStudent("Prakhar", 21);
        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }
}
