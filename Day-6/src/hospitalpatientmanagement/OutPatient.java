package hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;

public class OutPatient extends Patient implements MedicalRecord {
    private static final double CONSULTATION_FEE = 200; // Flat fee
    private List<String> medicalRecords;

    public OutPatient(int patientId, String name, int age) {
        super(patientId, name, age);
        this.medicalRecords = new ArrayList<>();
    }

    @Override
    public double calculateBill() {
        return CONSULTATION_FEE;
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
