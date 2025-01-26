package assistedproblems.employeemanagementsystem;

public class Developer extends Employee {
    private String programmingLanguage;

    // Constructor
    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary); // Call the superclass constructor
        this.programmingLanguage = programmingLanguage;
    }

    // Overriding displayDetails() to include programmingLanguage
    @Override
    public void displayDetails() {
        System.out.println("Employee is a developer:");
        super.displayDetails(); // Call the superclass  method
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.println("-------------------------------");
    }
}
