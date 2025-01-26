package hybridinheritence.vehiclemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // creating object of PetrolVehicle
        PetrolVehicle petrolVehicle = new PetrolVehicle(220, "Y62");
        petrolVehicle.displayDetails();
        petrolVehicle.refuel();
        System.out.println();

        // Creating object of ElectricVehicle
        ElectricVehicle electricVehicle = new ElectricVehicle(200, "B140");
        electricVehicle.displayDetails();
        electricVehicle.charge();
        System.out.println();
    }
}
