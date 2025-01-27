package employeemanagementsystem;

import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees: ");
        int numberOfEmployees = sc.nextInt();

        // created an array of references of Employee class
        Employee [] employees = new Employee[numberOfEmployees];

        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.println("Enter Name of Employee-" + (i+1));
            String name = sc.nextLine();
            name = sc.nextLine();

            System.out.println("Enter ID of Employee-" + (i+1));
            String employeeID = sc.next();

            System.out.println("Enter Base Salary of Employee-" + (i+1));
            float baseSalary = sc.nextFloat();

            // initializing objects
            employees[i] = (baseSalary < 5000f)? new PartTimeEmployee() : new FullTimeEmployee();

            // setting attribute values
            employees[i].set(employeeID, name, baseSalary);

            // getting the details of employee
            employees[i].displayDetails();
        }
    }
}
