package assistedproblems.vehicletransportsystem;

public class MotorCycle extends Vehicle{

    String headLight;

    MotorCycle(int maxSpeed, String fuelType, String headLight){
        super(maxSpeed, fuelType);
        this.headLight = headLight;
    }

    // Overridden Method
    @Override
    void displayInfo(){
        System.out.println("MaxSpeed of the MotorCycle is : " + maxSpeed);
        System.out.println("Fuel Type of MotorCycle is : " + fuelType);
        System.out.println("Head light of the MotorCycle is : " + headLight);
        System.out.println("-----------------------");
    }
}
