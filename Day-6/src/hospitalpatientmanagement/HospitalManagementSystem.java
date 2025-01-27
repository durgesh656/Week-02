package hospitalpatientmanagement;
import java.util.ArrayList;
import java.util.List;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patients
        InPatient inPatient = new InPatient(1, "ram", 25, 5);
        OutPatient outPatient = new OutPatient(2, "shyam", 40);

        // Add medical records
        inPatient.addRecord("Diagnosed with pneumonia.");
        inPatient.addRecord("Prescribed antibiotics.");
        outPatient.addRecord("Diagnosed with a mild fever.");
        outPatient.addRecord("Prescribed paracetamol.");

        // Add patients to a list
        List<Patient> patients = new ArrayList<>();
        patients.add(inPatient);
        patients.add(outPatient);

        // Display patient details and billing
        System.out.println("Patient Details and Billing:");
        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Medical Records: " + ((MedicalRecord) patient).viewRecords());
            System.out.println("Total Bill: " + patient.calculateBill());
            System.out.println("----------------------------");
        }
    }
}
