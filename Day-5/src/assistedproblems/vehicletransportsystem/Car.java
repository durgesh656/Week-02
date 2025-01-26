package assistedproblems.vehicletransportsystem;

public class Car extends Vehicle{

    int seatCapacity;

    Car(int maxSpeed, String fuelType, int seatCapacity){
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Override the displayInfo method for adding seat capacity information
    @Override
    void displayInfo(){
        System.out.println("MaxSpeed of the Car is : " + maxSpeed);
        System.out.println("Fuel Type of Car is : " + fuelType);
        System.out.println("Seat Capacity of the Car is : " + seatCapacity);
        System.out.println("-------------------------");
    }
}
