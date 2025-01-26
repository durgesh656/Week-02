package hybridinheritence.vehiclemanagementsystem;

public class PetrolVehicle extends Vehicle implements Refuelable{

    PetrolVehicle(int maxSpeed, String model){
        super(maxSpeed, model);
    }

    void displayDetails(){
        System.out.println("Model of the vehicle : " + model);
        System.out.println("MaxSpeed of the vehicle : " + maxSpeed);
    }

    // Overridden method
    @Override
    public void refuel(){
        System.out.println("Petrol should be refueled");
    }
}
