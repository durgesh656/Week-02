package ecommerceplatform;

public class Clothing extends Product implements Taxable{

    Clothing(int productID, String name, int price){
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
        double set = (double)getPrice() / 10.0;
        setTax(set);
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Imposed Tax : " + getTax());
        System.out.println("Price after imposing tax : " + (getPrice() + getTax()));
    }

    @Override
    void displayDetails(){
        super.displayDetails();
        getTaxDetail();
        System.out.println("Total price : " + (getPrice() - calculateDiscount() + getTax()));
    }
}
