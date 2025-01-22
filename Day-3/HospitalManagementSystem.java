class Patient {
    // Static variable shared across all patients
    public static String hospitalName = "Lifecare Hospital";
    private static int totalPatients = 0; // Static variable to count total patients

    // Final variable for unique patient ID
    private final int patientID;
    private String name;
    private int age;
    private String ailment;

    // Constructor to initialize instance variables using 'this'
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;

        // Increment the total patients count
        totalPatients++;
    }

    // Static method to get the total number of patients
    public static void totalPatients() {
        System.out.println("Total number of patients are: " + totalPatients);
        System.out.println();
    }

    // Method to display patient details
    public void displayPatientDetails() {
        System.out.println("Patient ID: " + patientID);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Ailment: " + ailment);
        System.out.println("Hospital: " + hospitalName);
        System.out.println();
    }

    //method to check if an object is an instance of Patient and display details
    public void checkObject(Object p1) {
        if (p1 instanceof Patient) {
            displayPatientDetails();
        } 
        else {
            System.out.println("The object is not an instance of the Patient class.");
        }
    }
}


public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create Patient objects
        Patient p1 = new Patient("xyz", 20, "cold", 101);
        Patient p2 = new Patient("abc", 50, "feaver", 102);

        // Display details of each patient
        p1.displayPatientDetails();
        p2.displayPatientDetails();
        //Display total number of patients
        Patient.totalPatients();
        // Check if an object is a Patient and display details
        p1.checkObject(p1);; // Valid Patient object
    }
}
