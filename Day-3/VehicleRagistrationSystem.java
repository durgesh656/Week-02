class Vehicle{
    // Static variable shared across all vehicles
    public static double registrationFee = 500.0;

    // Instance variables
    private final String registrationNumber; // Final variable to uniquely identify each vehicle
    private String ownerName;
    private String vehicleType;

     // Constructor to initialize instance variables using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }


    // Static method to update the registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: " + registrationFee);
    }

    
   

    // Method to display vehicle registration details
    public void displayRegistrationDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
        System.out.println();
    }

    //method to check if an object is an instance of the Vehicle class
    public void checkObject(Object v1) {
        if (v1 instanceof Vehicle) {
            displayRegistrationDetails();
        } else {
            System.out.println("The object is not an instance of the Vehicle class.");
        }
    }
}


public class VehicleRagistrationSystem{
    public static void main(String[] args) {
        // Create Vehicle objects
        Vehicle v1 = new Vehicle("xyz", "Car", "REG123");
        Vehicle v2 = new Vehicle("abc", "Bike", "REG456");

        // Display registration details of each vehicle
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();

        // Update the registration fee using the static method
        Vehicle.updateRegistrationFee(600.0);

        // Display registration details again to reflect the updated fee
        v1.displayRegistrationDetails();
        v2.displayRegistrationDetails();

        // Check if an object is a Vehicle before displaying its details
        v1.checkObject(v1);  // Valid Vehicle object
    }
}
