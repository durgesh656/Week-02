package hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;

public class InPatient extends Patient implements MedicalRecord {
    private static final double DAILY_ROOM_CHARGE = 500; // Charge per day
    private int daysAdmitted;
    private List<String> medicalRecords;

    public InPatient(int patientId, String name, int age, int daysAdmitted) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * DAILY_ROOM_CHARGE;
    }

    @Override
    public void addRecord(String record) {
        medicalRecords.add(record);
    }

    @Override
    public List<String> viewRecords() {
        return medicalRecords;
    }
}
