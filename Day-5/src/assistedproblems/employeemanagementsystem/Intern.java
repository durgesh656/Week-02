package assistedproblems.employeemanagementsystem;

public class Intern extends Employee {
    private String collegeName;

    // Constructor
    public Intern(String name, int id, double salary, String collegeName) {
        super(name, id, salary); // Call the superclass constructor
        this.collegeName = collegeName;
    }

    // Overriding displayDetails() to include collegeName
    @Override
    public void displayDetails() {
        System.out.println("Employee is an intern:");
        super.displayDetails(); // Call the superclass method
        System.out.println("college Name: " + collegeName);
        System.out.println("-----------------------");
    }
}
