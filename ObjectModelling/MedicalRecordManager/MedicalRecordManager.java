package ObjectModelling.MedicalRecordManager;

import java.util.ArrayList;
import java.util.List;

public class MedicalRecordManager {
    private List<MedicalRecord> records = new ArrayList<>();

    public void addRecord(MedicalRecord record) {
        records.add(record);
    }

    public void searchRecords(String keyword) {
        for (MedicalRecord record : records) {
            if (record.search(keyword)) {
                record.print();
            }
        }
    }

    public void printAllRecords() {
        for (MedicalRecord record : records) {
            record.print();
        }
    }
}
