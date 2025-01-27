package ecommerceplatform;

public class Ecommerceplateform {
    public static void main(String[] args) {
        // creating object of electronics
        Electronics electronics = new Electronics(101, "TV", 10000);
        // creating object of clothing
        Clothing clothing = new Clothing(102, "Shirt", 500);
        // creating object of groceries
        Groceries groceries = new Groceries(103, "Rice", 150);

        electronics.displayDetails();
        System.out.println();
        clothing.displayDetails();
        System.out.println();
        groceries.displayDetails();
        System.out.println();
    }
}
