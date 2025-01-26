package multilevelinheritance.onlineordermanagement;

public class Order {
    // declaring attributes
    String orderId;
    String orderDate;

    // constructor of parent class
    Order(String orderId, String orderDate){
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to display order detail
    void getOrderDetails(){
        System.out.println("Order ID is : " + orderId);
        System.out.println("Order Date : " + orderDate);
    }
}

