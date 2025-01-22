
class Product {
    // Static variable for discount (shared by all products)
    private static double discount;

    // Final variable for unique product ID
    private final int productID;

    // Instance variables
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize instance variables using `this`
    public Product(int productID,String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    public static void updateDiscount(double newDiscount) {
        if (newDiscount < 0 || newDiscount > 100) {
            System.out.println("Invalid discount value. It should be between 0 and 100.");
            return;
        }
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%.");
    }

    // Method to calculate the final price after applying the discount
    public double calculateTotalPrice() {
        double finalPrice = price * quantity * (1 - discount / 100);
        return finalPrice;
    }

    // Method to display product details
    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Price: " + calculateTotalPrice());
    }

}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        // Update the discount percentage
        Product.updateDiscount(15.0);

        // Create product instances
        Product product1 = new Product(1234,"Laptop", 50000.0, 2);
        Product product2 = new Product(1111,"Smartphone", 10000.0, 1);

        // Display product details
        if (product1 instanceof Product) {
            product1.displayDetails();
            System.out.println();
        }
        if (product2 instanceof Product) {
            product2.displayDetails();
        }

    }
}
