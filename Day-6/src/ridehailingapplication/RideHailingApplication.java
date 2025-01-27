package ridehailingapplication;

public class RideHailingApplication {
    public static void main(String[] args) {
        // created object of Carr class using reference of Vehiclee class
        Vehiclee vehiclee1 = new Carr();
        // providing state to this object
        vehiclee1.set("John", "V01", 12, "Bhopal");
        // displaying the details of first Vehiclee
        vehiclee1.getVehicleeDetails();

        // created object of Bikee class using reference of Vehiclee class
        Vehiclee vehiclee2 = new Bikee();
        // providing state to this object
        vehiclee2.set("Alice", "V02", 9, "Bhopal");
        // displaying the details of second Vehiclee
        vehiclee2.getVehicleeDetails();

        // created object of Auto class using reference of Vehiclee class
        Vehiclee vehiclee3 = new Auto();
        // providing state to this object
        vehiclee3.set("Bob", "V03", 7, "Bhopal");
        // displaying the details of third Vehiclee
        vehiclee3.getVehicleeDetails();
    }
}

