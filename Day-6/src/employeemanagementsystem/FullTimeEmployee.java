package employeemanagementsystem;

public class FullTimeEmployee extends Employee {
    // declaring the attributes of this class
    private float cashInHandSalary;

    // defining the behaviour of this class :-

    // overriding setter method of Employee class
    @Override
    public void set(String employeeId, String name, float baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.cashInHandSalary = calculateSalary();
    }

    // creating getter methods
    public String getName() {
        return this.name;
    }

    public String getEmployeeID() {
        return this.employeeId;
    }

    public float getBaseSalary() {
        return this.baseSalary;
    }

    public float getCashInHandSalary() {
        return this.cashInHandSalary;
    }

    // overriding the method from Department interface
    @Override
    public void getDepartmentDetails() {
        System.out.println(this.name + " works in " + assignDepartment() + " department.");
    }

    // overriding the abstract method of Employee class
    @Override
    protected float calculateSalary() {
        this.cashInHandSalary = this.baseSalary - (baseSalary * 8 / 100); // reducing 8% of the base salary
        return this.cashInHandSalary;
    }

    // overriding the displayDetails method of Employee class
    @Override
    public void displayDetails() {
        System.out.println("Name of the employee: " + this.getName() + "\nID: " + this.getEmployeeID() + "\nBase Salary: " + this.getBaseSalary() + "\nSalary cash in hand: " + this.getCashInHandSalary());
        getDepartmentDetails();
    }
}
