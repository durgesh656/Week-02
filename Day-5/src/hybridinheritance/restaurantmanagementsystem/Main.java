package hybridinheritence.restaurantmanagementsystem;

public class Main {
    public static void main(String[] args) {
        // creating object of waiter
        Waiter waiter = new Waiter("John", 101);
        waiter.performDuties();
        System.out.println();

        // creating object of chef
        Chef chef = new Chef("Harry", 102);
        chef.performDuties();
        System.out.println();
    }
}
