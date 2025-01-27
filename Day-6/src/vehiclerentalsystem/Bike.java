package vehiclerentalsystem;

public class Bike extends Vehicle {
    private float insuranceAmount;

    @Override
    public void set(String vehicleNumber, String type, float rentalRate) {
        this.type = type;
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rentalRate;
        this.insuranceAmount = calculateInsurance();
    }

    public String getType() {
        return this.type;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }

    public float getRentalRate() {
        return this.rentalRate;
    }

    public float getInsuranceAmount() {
        return this.insuranceAmount;
    }

    // overriding the method from Insurable interface
    @Override
    public void getInsuranceDetails() {
        System.out.println("This vehicle has a term insurance of " + this.insuranceAmount + "Rs.");
    }

    // overriding the abstract method of Vehicle class
    @Override
    protected void calculateRentalCost(int days) {
        System.out.println("You are taking this vehicle on rent. \nYour Rent: " + days * this.rentalRate);
    }

    // overriding the displayDetails method of Vehicle class
    @Override
    public void displayDetails() {
        System.out.println("type of the Vehicle: " + this.getType() + "\nVehicle Number: " + this.getVehicleNumber() + "\nRental Rate: " + this.getRentalRate());
        getInsuranceDetails();
    }
}

