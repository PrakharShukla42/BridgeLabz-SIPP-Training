package ObjectModelling.MedicalRecordManager;

public abstract class MedicalRecord implements Searchable, Printable {
    protected String patientName;
    protected String date;

    public MedicalRecord(String patientName, String date) {
        this.patientName = patientName;
        this.date = date;
    }
}
