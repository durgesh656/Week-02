package onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_EXTRA_CHARGE = 20; // Flat additional charge
    private double discount;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + NON_VEG_EXTRA_CHARGE - discount;
    }

    @Override
    public void applyDiscount(double discountPercentage) {
        discount = ((getPrice() * getQuantity()) + NON_VEG_EXTRA_CHARGE) * (discountPercentage / 100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount: " + discount;
    }
}
