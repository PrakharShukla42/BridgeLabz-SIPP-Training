package ObjectModelling.ECommercePlatform;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> products;

    public Order(Customer customer) {
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    public void showOrderDetails() {
        System.out.println("Order Details for " + customer.getName() + ":");
        for (Product product : products) {
            System.out.println("- " + product.getName() + " : $" + product.getPrice());
        }
        System.out.println("Total Cost: $" + calculateTotal());
    }
}
