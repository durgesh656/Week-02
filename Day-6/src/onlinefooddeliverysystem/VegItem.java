package onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable {
    private double discount;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) - discount;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = (getPrice() * getQuantity()) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount;
    }
}
