package ObjectModelling.MedicalRecordManager;

public class Prescription extends MedicalRecord {
    private String medicine;
    private String dosage;

    public Prescription(String patientName, String date, String medicine, String dosage) {
        super(patientName, date);
        this.medicine = medicine;
        this.dosage = dosage;
    }

    @Override
    public boolean search(String keyword) {
        return medicine.contains(keyword) || dosage.contains(keyword) || patientName.contains(keyword);
    }

    @Override
    public void print() {
        System.out.println("Prescription:");
        System.out.println("Patient: " + patientName);
        System.out.println("Date: " + date);
        System.out.println("Medicine: " + medicine);
        System.out.println("Dosage: " + dosage);
        System.out.println("--------------------------");
    }
}
