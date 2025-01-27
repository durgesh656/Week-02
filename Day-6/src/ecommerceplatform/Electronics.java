package ecommerceplatform;

public class Electronics extends Product implements Taxable{

    Electronics(int productID, String name, int price){
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
        double set = (30.0/100.0) * (double) getPrice();
        setTax(set);
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Imposed Tax : " + (getTax()));
        System.out.println("Price after imposing tax : " + (getPrice() + getTax()));
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        getTaxDetail();
        System.out.println("Total price : " + (getPrice() - calculateDiscount() + getTax()));
    }
}
