package assistedproblems.animalhierarchy;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("tuffy",12);//Dog class object
        Cat cat = new Cat("kitty",5);//Cat class object
        Bird bird = new Bird("parrot",2);//Bird class object

        dog.makeSound();//calling makeSound method for Dog class
        cat.makeSound();//calling makeSound method for Cat class
        bird.makeSound();//calling makeSound method for Bird class
    }
}
