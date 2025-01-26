package assistedproblems.vehicletransportsystem;

public class Truck extends Vehicle{

    int numberOfTyres;

    Truck(int maxSpeed, String fuelType, int numberOfTyres){
        super(maxSpeed, fuelType);
        this.numberOfTyres = numberOfTyres;
    }

    // Override Method to add tyre information
    @Override
    void displayInfo(){
        System.out.println("MaxSpeed of the Truck is : " + maxSpeed);
        System.out.println("Fuel Type of Truck is : " + fuelType);
        System.out.println("numberOfTyres in  the Truck is : " + numberOfTyres);
        System.out.println("------------------");
    }
}
