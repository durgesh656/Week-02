package vehiclerentalsystem;
import java.util.Scanner;
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking inputs for Vehicle details
        System.out.println("Enter number of Vehicles: ");
        int numberOfVehicles = sc.nextInt();

        // created an array of references of Vehicle class
        Vehicle [] vehicles = new Vehicle[numberOfVehicles];

        // iterating through a for loop to get input for the vehicles
        for (int i = 0; i < numberOfVehicles; i++) {
            // created variables for taking inputs for the attributes of vehicles
            System.out.println("Enter type of Vehicle-" + (i+1));
            String type = sc.nextLine();
            type = sc.nextLine(); // to avoid conflicts while taking inputs

            System.out.println("Enter Number of Vehicle-" + (i+1));
            String vehicleNumber = sc.next();

            System.out.println("Enter Rental Rate of Vehicle-" + (i+1));
            float rentalRate = sc.nextFloat();

            // initializing objects
            vehicles[i] = (type.charAt(0) == 'B')? new Bike() :(type.charAt(0) == 'C')? new Car() : new Truck();

            // setting attribute values
            vehicles[i].set(vehicleNumber, type, rentalRate);
            // getting the details of Vehicle
            vehicles[i].displayDetails();
            // renting this vehicle for 5 days
            vehicles[i].calculateRentalCost(5);
        }
    }
}
