package ridehailingapplication;

public class Carr extends Vehiclee { // since Car class is already there in same package

    // overriding setter method of Vehiclee class
    @Override
    public void set(String driverName, String  vehicleeId, double ratePerKm, String location) {
        this. vehicleeId =  vehicleeId;
        this.driverName = driverName;
        this.ratePerKm =  ratePerKm;
        this.location = location;
    }

    // creating getter methods
    public String getVehicleeId() {
        return this.vehicleeId;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public double getRatePerKm() {
        return this.ratePerKm;
    }

    // overriding the abstract method of Vehiclee class
    @Override
    protected double calculateFare(double distance) {
        return this.ratePerKm * distance;
    }

    // overriding the getVehicleeDetails method of Vehiclee class
    @Override
    public void getVehicleeDetails() {
        System.out.println("Details of the Vehicle:\nDriver Name: " + getDriverName() + "\nVehicle ID: " + getVehicleeId() + "\nRate Per Km: " + getRatePerKm());
        getCurrentLocation(); // getting current location of this vehicle
        // getting vehicle on rent for 5 kilometer
        getOnRent(5);
    }

    public void getOnRent(double distance) {
        System.out.println("You have booked this vehicle for 5 kilometers and your fare is: " + calculateFare(distance));
    }
}
