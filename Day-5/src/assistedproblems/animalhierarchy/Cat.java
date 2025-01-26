package assistedproblems.animalhierarchy;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }
    //override makeSound method for Cat class
    @Override
    public void makeSound(){
        System.out.println("Cat meows.");
    }

}
