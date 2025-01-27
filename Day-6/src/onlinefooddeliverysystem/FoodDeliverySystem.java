package onlinefooddeliverysystem;
import java.util.ArrayList;
import java.util.List;

public class FoodDeliverySystem {
    public static void main(String[] args) {
        // Create food items
        VegItem vegBurger = new VegItem("Veg Burger", 5.99, 2);
        NonVegItem chickenBurger = new NonVegItem("Chicken Burger", 7.99, 3);

        // Apply discounts
        vegBurger.applyDiscount(10);  // 10% discount
        chickenBurger.applyDiscount(5); // 5% discount

        // Add items to a list
        List<FoodItem> order = new ArrayList<>();
        order.add(vegBurger);
        order.add(chickenBurger);

        // Process and display order details
        processOrder(order);
    }

    public static void processOrder(List<FoodItem> order) {
        System.out.println("Order Details:");
        for (FoodItem item : order) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("----------------------------");
        }
    }
}
