package hybridinheritence.vehiclemanagementsystem;

public class ElectricVehicle extends Vehicle{
    // invoke parent class constructor
    ElectricVehicle(int maxSpeed, String model){

        super(maxSpeed, model);
    }

    void displayDetails(){
        System.out.println("Model of the vehicle : " + model);
        System.out.println("MaxSpeed of the vehicle : " + maxSpeed);
    }

    void charge(){
        System.out.println("Electric vehicle needs to charge");
    }
}

