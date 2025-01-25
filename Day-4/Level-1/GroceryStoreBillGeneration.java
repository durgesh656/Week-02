import java.util.ArrayList;

// Class Customer
class Customer {
    private String name;
    private ArrayList<Product> products;

    public Customer(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }
}

// Class representing a Product
class Product {
    private String productName;
    private int productID;
    private double quantity; // in kg or liters
    private double pricePerUnit;

    public Product(String productName,int productID, double quantity, double pricePerUnit) {
        this.productName = productName;
        this.productID = productID;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getProductName() {
        return productName;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotalPrice() {
        return quantity * pricePerUnit;
    }
}

// Class Bill Generator
class BillGenerator {
    public double calculateTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }
    //method for generate bill
    public void generateBill(Customer customer) {
        System.out.println("Bill for Customer: " + customer.getName());
        for (Product product : customer.getProducts()) {
            System.out.println("Product name: "+product.getProductName());
            System.out.println("Quantity: "+product.getQuantity());
            System.out.println("Price per unit: " + product.getPricePerUnit());
            System.out.println("Total Price: " + product.getTotalPrice());
            System.out.println("-----------------");
        }
        System.out.println("Total Bill: $ " + calculateTotal(customer));
    }
}

public class GroceryStoreBillGeneration {
    public static void main(String[] args) {
        // Create a customer object
        Customer customer1= new Customer("Alice");

        // Create product objects
        Product p1= new Product("Apples",123, 2, 3); // quantity 2 kg ,price $3 per kg
        Product p2 = new Product("Milk",456, 1, 2); // quantity 1 liter ,price $2 per liter

        // Add products to the customer's cart
        customer1.addProduct(p1);
        customer1.addProduct(p2);

        // Display customer and product details
        System.out.println("Customer: " + customer1.getName());
        System.out.println("Products Purchased:");

        // create a bill generator object
        BillGenerator billGenerator = new BillGenerator();
        billGenerator.generateBill(customer1);
       
    }
}
