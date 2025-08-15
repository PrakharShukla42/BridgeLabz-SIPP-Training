package Keywords;

class Employee {
    static String companyName = "Tech Corp";
    static int totalEmployees = 0;
    String name;
    final String id;
    String designation;
    Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    void displayDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Name: " + name);
            System.out.println("ID: " + id);
            System.out.println("Designation: " + designation);
        }
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee("Sakshi", "E101", "Developer");
        emp1.displayDetails();
        Employee.displayTotalEmployees();
    }
}
