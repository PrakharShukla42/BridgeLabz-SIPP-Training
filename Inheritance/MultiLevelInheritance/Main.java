package Inheritance.MultiLevelInheritance;


public class Main {
    public static void main(String[] args) {
        DeliveredOrder order = new DeliveredOrder(
            101, "2025-08-10", "TRK12345", "2025-08-12"
        );
        order.getOrderStatus();
    }
}
