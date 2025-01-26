package assistedproblems.vehicletransportsystem;

public class Vehicle {
    int maxSpeed;
    String fuelType;

    Vehicle(int maxSpeed, String fuelType){
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    void displayInfo(){
        System.out.println("Maximum speed of the vehicle is : " + maxSpeed);
        System.out.println("Fuel Type of vehicle is : " + fuelType);
        System.out.println("--------------------------");

    }
}


