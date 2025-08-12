package ObjectModelling.MedicalRecordManager;

public class LabReport extends MedicalRecord {
    private String testName;
    private String result;

    public LabReport(String patientName, String date, String testName, String result) {
        super(patientName, date);
        this.testName = testName;
        this.result = result;
    }

    @Override
    public boolean search(String keyword) {
        return testName.contains(keyword) || result.contains(keyword) || patientName.contains(keyword);
    }

    @Override
    public void print() {
        System.out.println("Lab Report:");
        System.out.println("Patient: " + patientName);
        System.out.println("Date: " + date);
        System.out.println("Test: " + testName);
        System.out.println("Result: " + result);
        System.out.println("--------------------------");
    }
}
