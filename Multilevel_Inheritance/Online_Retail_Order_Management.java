package Multilevel_Inheritance;

class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}
public class Online_Retail_Order_Management {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(101, "2025-09-10", "TRK12345", "2025-09-15");
        System.out.println("Order ID: " + order.orderId + " Status: " + order.getOrderStatus());
    }
}