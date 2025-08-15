package ObjectModelling.Class_And_Object.GroceryManagementSystem;

public class BillGenerator {

    public double calculateTotal(Customer customer) {
        double total = 0;
        for (Product product : customer.getProducts()) {
            total += product.getTotalPrice();
        }
        return total;
    }

    public void printBill(Customer customer) {
        System.out.println("Bill for Customer: " + customer.getName());
        for (Product product : customer.getProducts()) {
            System.out.println(product.getName() + " - " + product.getQuantity() +
                               " units at $" + product.getPricePerUnit() + 
                               " each: $" + product.getTotalPrice());
        }
        System.out.println("Total Amount: $" + calculateTotal(customer));
    }
}
