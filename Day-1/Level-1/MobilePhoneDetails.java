import java.util.Scanner;

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String brand = sc.nextLine();
        String model = sc.nextLine();
        int price = sc.nextInt();

        // creating an object of class 
        MobilePhone mobile = new MobilePhone(brand, model, price);

        mobile.displayDetails();
    }
}

class MobilePhone{
    String brand;
    String model;
    int price;

    // constructor to initialize attributes
    public MobilePhone(String brand, String model, int price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile details
    public void displayDetails(){
        System.out.println("Brand name : " + brand);
        System.out.println("Model name : " + model);
        System.out.println("Price : " + price);
    }
}

