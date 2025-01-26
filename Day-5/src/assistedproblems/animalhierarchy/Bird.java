package assistedproblems.animalhierarchy;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }
    //override makeSound method for Bird class
    @Override
    public void makeSound(){
        System.out.println("Bird chirps.");
    }

}
