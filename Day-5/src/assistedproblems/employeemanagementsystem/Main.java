package assistedproblems.employeemanagementsystem;

public class Main {
    public static void main(String[] args) {
        // Create instances of each employee type
        Manager manager = new Manager("John", 1, 100000, 10);
        Developer developer = new Developer("peter", 2, 60000, "Java");
        Intern intern = new Intern("Charlie", 3, 20000, "TIT college");

        // Display details for each employee
        System.out.println("Employee Details:");
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
