package ObjectModelling.ECommercePlatform;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Prakhar Shukla");
        Product product1 = new Product("Laptop", 68000);
        Product product2 = new Product("Mouse", 2000);

        Order order1 = new Order(customer1);
        order1.addProduct(product1);
        order1.addProduct(product2);

        customer1.placeOrder(order1);
        order1.showOrderDetails();
    }
}
