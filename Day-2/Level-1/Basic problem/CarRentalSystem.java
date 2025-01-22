
class CarRental{
    // Declare the attributes
    private String customerName;
    private String carModel;
    private int rentalDays;

    // Parameterized constructor to initialize the attributes
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate the total cost based on the rental days and car model
    public double calculateTotalCost() {
        
        double costPerDay = 0;
        if (carModel.equals("Maruti")) {
            costPerDay = 500;
            } 
        else if (carModel.equals("Honda")) {
            costPerDay =1000;
        }

        // Calculate the total cost based on the rental days and cost per day
        double totalCost = costPerDay * rentalDays;
        return totalCost;
    }

    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total cost: " + calculateTotalCost());
    }

}
public class CarRentalSystem{
    public static void main(String[] args) {
        CarRental car1 = new CarRental("Happy singh", "Maruti", 5);
        CarRental car2 = new CarRental("Rahul singh", "Honda", 7);
       //displaying the details of car1 and car2
        car1.displayDetails();
        car2.displayDetails();
    }
        

}