package vehiclerentalsystem;

public abstract class Vehicle implements Insurable {
    protected String vehicleNumber, type;
    protected float rentalRate;

    protected abstract void calculateRentalCost(int days);

    abstract public void set(String vehicleNumber, String type, float rentalRate);

    // created a concrete method displayDetails()
    protected void displayDetails() {
        System.out.println("this is a vehicle.");
    }

    // providing definition of method from implemented interface, Insurable
    @Override
    public float calculateInsurance() {
        if(this instanceof Bike) return 500000;
        if(this instanceof Car) return 5000000;
        return 20000000;
    }
}
