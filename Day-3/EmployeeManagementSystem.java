class Employee
{
    static  final String companyName="Capgemini";
    static int totalEmployees;
    String name ,designation;
    final int id;
    Employee(String name ,String designation,int id)
    {
        this.name=name;
        this.designation=designation;
        this.id=id;
        totalEmployees++;
    }
    static void displayTotalEmplloyee()
    {
        System.out.println("Total number of employees are: "+totalEmployees);
    }
    void displayEmployeeDetails()
    {
        System.out.println("Company name is: "+companyName+"\nEmployee name is: "+ name+"\nEmployee Designation is: "+designation+"\nEmployee ID is: "+ id);
    }

}
public class EmployeeManagementSystem{
    public static void main(String [] args)
    {
        Employee employee1=new Employee("Durgesh","Software Engineer",31122003);
        if(employee1 instanceof Employee)
        {
            employee1.displayEmployeeDetails();
        }
        Employee.displayTotalEmplloyee();
       
    }
   
}