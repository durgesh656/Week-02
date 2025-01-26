package assistedproblems.vehicletransportsystem;

public class Main {
    public static void main(String[] args) {
        // object of parent class
        Vehicle vehicle = new Vehicle(50, "Petrol");

        // Object of car class
        Car car = new Car(180, "Desial", 4);

        // Object of Truck class
        Truck truck = new Truck(80, "Desiel", 10);

        // Object of MotorCycle class
        MotorCycle motorCycle = new MotorCycle(120, "Petrol", "LED");

        vehicle .displayInfo();
        car.displayInfo();
        truck.displayInfo();
        motorCycle.displayInfo();
    }
}
