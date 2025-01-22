class Product {
    // Instance variables
    private String productName;
    private double price;

    // Class variable 
    private static int totalProducts = 0;

    // Constructor to initialize the product
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }

    // Instance method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    // Class method to display total number of products
    public static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

   
}
public class ProductInventory{
	 
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Book", 120.99);
        Product product2 = new Product("Watch", 799.49);
        Product product3 = new Product("Mobile", 15000.75);

        // Display details of each product
        product1.displayProductDetails();
        product2.displayProductDetails();
        product3.displayProductDetails();

        // Display total products created
        Product.displayTotalProducts();
    }
}
