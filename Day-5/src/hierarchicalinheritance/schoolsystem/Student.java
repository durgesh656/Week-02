package hierarchicalinheritance.schoolsystem;

public class Student extends Person{
    char grade;

    Student(String name, int age, char grade){
        super(name, age);
        this.grade = grade;
    }

    // Overridden method
    @Override
    void displayRole(){
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("grade : " + grade);
    }
}
