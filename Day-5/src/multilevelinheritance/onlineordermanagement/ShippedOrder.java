package multilevelinheritance.onlineordermanagement;

public class ShippedOrder extends Order{
    long trackingNumber;   // unique attribute

    ShippedOrder(String orderId, String orderDate, long trackingNumber){
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overridden method
    @Override
    void getOrderDetails(){
        super.getOrderDetails();
        System.out.println("Tracking Number : " + trackingNumber);
    }
}
