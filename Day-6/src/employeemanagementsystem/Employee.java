package employeemanagementsystem;

public abstract class Employee implements Department {
    protected String employeeId, name;
    protected float baseSalary;

    // created an abstract method
    protected abstract float calculateSalary();

    abstract public void set(String employeeId, String name, float baseSalary);

    // created a concrete method displayDetails()
    protected void displayDetails() {
        System.out.println("Name of the employee: " + this.name + "\nID: " + this.employeeId + "\nBase Salary: " + this.baseSalary + "\nSalary cash in hand: " + calculateSalary());
    }

    // providing definition of method from implemented interface, Department
    @Override
    public String assignDepartment() {
        return (this.baseSalary < 5000f)? "Department-B" : "Department-A";
    }
}
