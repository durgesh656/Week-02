package ecommerceplatform;

public abstract class Product {
    private int productID;
    private String name;
    private int price;
    private double tax;

    // getter setter method of tax
    void setTax(double tax1){
        this.tax = tax1;
    }
    double getTax(){
        return this.tax;
    }

    // getter setter method of price
    int getPrice(){
        return this.price;
    }
    void setPrice(int price1){
        this.price = price1;
    }

    Product(int productID, String name, int price){
        this.productID = productID;
        this.name = name;
        this.price = price;
    }

    abstract int calculateDiscount();

    void displayDetails(){
        System.out.println("Product Id : " + productID);
        System.out.println("Name : " + name);
        System.out.println("Price : " + price);
    }

}
