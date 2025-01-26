package multilevelinheritance.onlineordermanagement;

public class DeliveredOrder extends ShippedOrder{
    String deliveryDate;   // unique attribute

    DeliveredOrder(String orderId, String orderDate, long trackingNumber, String deliveryDate){
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overridden method
    @Override
    void getOrderDetails(){
        super.getOrderDetails();
        System.out.println("Delivery date : " + deliveryDate);
    }
}
