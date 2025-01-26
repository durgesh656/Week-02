package assistedproblems.employeemanagementsystem;

public class Manager extends Employee{
    private int teamSize;
    public Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize=teamSize;
    }
    //Overriding displayDetails() to include teamSize
    @Override
    public void displayDetails(){
        System.out.println("Employee is a manager:");
        super.displayDetails();//call the super class method
        System.out.println("Team size: "+teamSize);
        System.out.println("-----------------------------");
    }

}

