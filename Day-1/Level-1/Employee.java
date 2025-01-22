import java.util.Scanner;
public class Employee{
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String name=sc.nextLine().trim();//input name
		
		String ID=sc.next();//input ID
		
		int salary=sc.nextInt();//input salary
		
        //creating an object of class EmployeeDetails
        EmployeeDetails emp=new EmployeeDetails(name,ID,salary);
		
		//calling displayDetails method
        emp.displayDetails();
    }
}
class EmployeeDetails {
    String name,ID;
    int salary;
	//constructor used to set values
    EmployeeDetails(String name,String ID,int salary) {
        this.name=name;
        this.ID=ID;
        this.salary=salary;
    }
    void displayDetails(){
        System.out.println("Name: "+name+" ID: "+ID+" Salary: "+salary);
    }
    
}


