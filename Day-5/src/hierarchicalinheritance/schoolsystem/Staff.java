package hierarchicalinheritance.schoolsystem;

public class Staff extends Person{
    String department;

    Staff(String name, int age, String department){
        super(name, age);
        this.department = department;
    }

    // Overridden method
    @Override
    void displayRole(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Staff of department : " + department);
    }
}
