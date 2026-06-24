import java.util.Scanner;
class Order {
    int orderId;
    String orderDate;

    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order Shipped";
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered";
    }
}

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orderId = sc.nextInt();
        sc.nextLine();

        String orderDate = sc.nextLine();
        String trackingNumber = sc.nextLine();
        String deliveryDate = sc.nextLine();

        DeliveredOrder d = new DeliveredOrder(
                orderId,
                orderDate,
                trackingNumber,
                deliveryDate
        );

        System.out.println("Order Id: " + d.orderId);
        System.out.println("Order Date: " + d.orderDate);
        System.out.println("Tracking Number: " + d.trackingNumber);
        System.out.println("Delivery Date: " + d.deliveryDate);
        System.out.println("Status: " + d.getOrderStatus());

        sc.close();
    }
}