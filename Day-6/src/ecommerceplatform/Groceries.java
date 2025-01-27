package ecommerceplatform;

public class Groceries extends Product implements Taxable{

    Groceries(int productID, String name, int price){
        super(productID, name, price);
        calculateTax();
    }

    @Override
    int calculateDiscount() {
        // discount will be 10% of price
        return getPrice()/10;
    }

    @Override
    public void calculateTax() {
        double set = 0.0;  // no tax on Groceries
        setTax(set);
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Imposed Tax : " + getTax());
        System.out.println("No tax on Groceries");
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        getTaxDetail();
        System.out.println("Total price : " + (getPrice() - calculateDiscount() + getTax()));
    }
}
