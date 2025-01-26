package hybridinheritence.restaurantmanagementsystem;

public class Waiter extends Person implements Worker{
    Waiter(String name, int id){
        super(name, id);
    }

    // Overridden method
    @Override
    public void performDuties(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Performs duty of serving");
    }
}
