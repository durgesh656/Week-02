package assistedproblems.animalhierarchy;

//super class Animal
public class Animal{
    public String name;
    public int age;
    // Constructor
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    //Animal class method
    public void makeSound(){
        System.out.println("Animal make a sound.");
    }
}
