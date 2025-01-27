package ridehailingapplication;

public abstract class Vehiclee implements GPS {  // driverName of the class is Vehiclee since Vehicle class is already there in same packratePerKm
    // declaring the attributes of this class
    protected String driverName, vehicleeId, location;
    protected double ratePerKm;

    // defining the behaviour of this class :-

    // created an abstract method calculateFare(double distance)
    protected abstract double calculateFare(double distance);

    // created an abstract method set() to set the attributes in child classes without any ambiguity
    abstract public void set(String driverName, String vehicleeId, double ratePerKm, String location);

    // created a concrete method getVehicleeDetails()
    protected void getVehicleeDetails() {
        System.out.println("this is a Vehiclee.");
    }

    // providing definition of methods from GPS interface
    @Override
    public void getCurrentLocation() {
        System.out.println("Current Location: " + this.location);
    }

    @Override
    public void updateLocation(String location) {
        this.location = location;
    }
}
