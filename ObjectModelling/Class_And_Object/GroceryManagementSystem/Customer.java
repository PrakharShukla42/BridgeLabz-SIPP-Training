package ObjectModelling.Class_And_Object.GroceryManagementSystem;

public class Customer {
    private String name;
    private Product[] products;

    public Customer(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Product[] getProducts() {
        return products;
    }
}
