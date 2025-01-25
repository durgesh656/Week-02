import java.util.ArrayList;
class Company {
    private String companyName;
    private ArrayList<Department> departments;

    // Constructor to initialize the company
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Add a department to the company
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Display all departments and their employees
    public void displayDepartments() {
        System.out.println("Departments in " + companyName + ":");
        for (Department department : departments) {
            department.displayEmployees();
        }
    }

    // Clear all departments and employees (simulate company deletion)
    public void deleteCompany() {
        System.out.println("Deleting company: " + companyName);
        for (Department department : departments) {
            department.clearDepartment();
        }
        departments.clear();
        System.out.println("All departments and employees removed.");
    }
}


class Department {
    private String departmentName;
    private ArrayList<Employee> employees;

    // Constructor to initialize the department
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Add an employee to the department
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Display all employees in the department
    public void displayEmployees() {
        System.out.println("Employees in " + departmentName + " Department:");
        for (Employee employee : employees) {
            employee.displayEmployeeDetails();
        }
    }

    // Clear the department (simulate deletion)
    public void clearDepartment() {
        employees.clear();
        System.out.println("Cleared all employees from " + departmentName + " department.");
    }
}
class Employee {
    private String name;
    private String designation;

    // Constructor to initialize employee details
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name + ", designation: " + designation);
    }
}


public class CompanyAndDepartments{
    public static void main(String[] args) {
        // Create a company
        Company company = new Company("xyz");

        // Create departments
        Department d1 = new Department("IT");
        Department d2 = new Department("HR");

        // Create employees
        Employee emp1 = new Employee("john", "Software Engineer");
        Employee emp2 = new Employee("harry", "designer");
        Employee emp3 = new Employee("tom", "HR Manager");
        Employee emp4 = new Employee("jarry", "Interviewer");

        // Add employees to departments
        d1.addEmployee(emp1);
        d1.addEmployee(emp2);
        d2.addEmployee(emp3);
        d2.addEmployee(emp4);
        // Add departments to the company
        company.addDepartment(d1);
        company.addDepartment(d2);

        // Display company structure
        company.displayDepartments();

        // Delete the company (clears all departments and employees)
        company.deleteCompany();
    }
}
