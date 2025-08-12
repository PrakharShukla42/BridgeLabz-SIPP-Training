package Inheritance.HybridInheritance;


class TeachingAssistant extends Student {
    String assignedSubject;

    TeachingAssistant(String name, int age, String course, String assignedSubject) {
        super(name, age, course);
        this.assignedSubject = assignedSubject;
    }

    void displayTAInfo() {
        System.out.println("TA Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Assigned Subject: " + assignedSubject);
    }
}
