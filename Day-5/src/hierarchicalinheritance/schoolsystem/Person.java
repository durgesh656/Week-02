package hierarchicalinheritance.schoolsystem;

public class Person{
    String name;
    int age;

    // parent class constructor
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // method to display role
    void displayRole(){
        System.out.println("Normal Person with name : " + name + " and age : " + age);
    }
}