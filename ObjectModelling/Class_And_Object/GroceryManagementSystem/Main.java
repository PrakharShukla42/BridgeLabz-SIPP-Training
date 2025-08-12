package ObjectModelling.Class_And_Object.GroceryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("Apples", 3.0, 2.0),
            new Product("Milk", 2.0, 1.0)
        };

        Customer customer = new Customer("Prakhar", products);

        BillGenerator billGenerator = new BillGenerator();
        billGenerator.printBill(customer);
    }
}
