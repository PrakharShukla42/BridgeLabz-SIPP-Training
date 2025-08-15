package Keywords;

class Patient {
    static String hospitalName = "City Hospital";
    static int totalPatients = 0;
    String name;
    int age;
    String ailment;
    final String patientID;
    Patient(String name, int age, String ailment, String patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    static void getTotalPatients() {
        System.out.println("Total Patients: " + totalPatients);
    }
    void displayDetails() {
        if (this instanceof Patient) {
            System.out.println("Hospital: " + hospitalName);
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Ailment: " + ailment);
            System.out.println("Patient ID: " + patientID);
        }
    }
    public static void main(String[] args) {
        Patient p1 = new Patient("Ravi", 30, "Fever", "P001");
        p1.displayDetails();
        Patient.getTotalPatients();
    }
}
