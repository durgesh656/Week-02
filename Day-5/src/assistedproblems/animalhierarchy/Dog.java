package assistedproblems.animalhierarchy;

public class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }
    //override makeSound method for Dog class
    @Override
    public void makeSound(){
        System.out.println("Dog barks.");
    }

}
