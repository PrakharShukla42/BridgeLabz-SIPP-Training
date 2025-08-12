package Constructors;

class Employee {
    public int employeeID;
    protected String department;
    private double salary;
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getSalary() {
        return salary;
    }
}
class Manager extends Employee {
    String teamName;
    Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }
    void displayDetails() {
        System.out.println("Manager ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + getSalary());
        System.out.println("Team: " + teamName);
    }
    public static void main(String[] args) {
        Manager mgr = new Manager(101, "IT", 80000, "Development");
        mgr.displayDetails();
    }
}
