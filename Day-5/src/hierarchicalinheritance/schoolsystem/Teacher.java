package hierarchicalinheritance.schoolsystem;

public class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject){
        super(name, age);
        this.subject = subject;
    }

    // Overridden method
    @Override
    void displayRole(){
        System.out.println("Name of teacher : " + name);
        System.out.println("Age : " + age);
        System.out.println("Teacher of subject : " + subject);
    }
}

