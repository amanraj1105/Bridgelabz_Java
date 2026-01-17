package ObjectOrientedProgramming.Inheritance;

/*
 * This class represents a basic Order
 * with common order details.
 */
class Order {

    // Unique order ID
    String orderId;

    // Date when the order was placed
    String orderDate;

    // Constructor to initialize order details
    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to return order status
    String getOrderStatus() {
        return "Order Placed";
    }
}

/*
 * This class represents a Shipped Order
 * and extends the Order class.
 */
class ShippedOrder extends Order {

    // Tracking number for shipped order
    String trackingNumber;

    // Constructor to initialize shipped order details
    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Override method to update order status
    @Override
    String getOrderStatus() {
        return "Order Shipped";
    }
}

/*
 * This class represents a Delivered Order
 * and demonstrates multilevel inheritance.
 */
class DeliveredOrder extends ShippedOrder {

    // Date when the order was delivered
    String deliveryDate;

    // Constructor to initialize delivered order details
    DeliveredOrder(
            String orderId,
            String orderDate,
            String trackingNumber,
            String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Override method to update order status
    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}
