// Base class: Order
class Order {
    protected String orderId;
    protected String orderDate;

    // Constructor
    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the order status
    public String getOrderStatus() {
        return "Order placed on " + orderDate;
    }
}

// Subclass: ShippedOrder extends Order
class ShippedOrder extends Order {
    protected String trackingNumber;
    
        // Constructor
        public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
            super(orderId, orderDate);
            this.trackingNumber = trackingNumber;
        }
    
        // Overriding getOrderStatus method to include shipping status
        @Override
        public String getOrderStatus() {
            return "Order shipped with tracking number: " + trackingNumber;
        }
    }
    
    // Subclass: DeliveredOrder extends ShippedOrder
    class DeliveredOrder extends ShippedOrder {
        private String deliveryDate;
    
        // Constructor
        public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
            super(orderId, orderDate, trackingNumber);
            this.deliveryDate = deliveryDate;
        }
    
        // Overriding getOrderStatus method to include delivery status
        @Override
        public String getOrderStatus() {
            return "Order delivered on " + deliveryDate + " with tracking number: " + trackingNumber;
    }
}

// Main class
public class OrderRetailManagement {
    public static void main(String[] args) {
        // Creating an Order object
        Order order = new Order("ORD001", "2025-02-07");

        // Creating a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", "2025-02-05", "TRACK123");

        // Creating a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", "2025-02-01", "TRACK456", "2025-02-06");

        // Displaying order status for each object
        System.out.println(order.getOrderStatus());
        System.out.println(shippedOrder.getOrderStatus());
        System.out.println(deliveredOrder.getOrderStatus());
    }
}
