package multilevelinheritance.onlineordermanagement;

public class Main {
    public static void main(String[] args) {
        // creating object for base class
        Order order = new Order("OR1", "22-01-2025");
        order.getOrderDetails();
        System.out.println();

        // creating object of ShippedOrder class
        ShippedOrder shippedOrder = new ShippedOrder("OR1", "22-01-2025", 123);
        shippedOrder.getOrderDetails();
        System.out.println();

        // creating object of DeliveredOrder
        DeliveredOrder deliveredOrder = new DeliveredOrder("OR1", "22-01-2025", 123, "24-01-2025");
        deliveredOrder.getOrderDetails();
        System.out.println();
    }
}
