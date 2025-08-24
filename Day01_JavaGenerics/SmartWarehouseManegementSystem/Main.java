package SmartWarehouseManegementSystem;

public class Main {
    public static void main(String[] args) {
        
        Item<Integer> item1 = new Item<>(101, "Laptop", 50);
        Item<String> item2 = new Item<>("A102", "Smartphone", 200);

        
        Supplier<Integer> supplier1 = new Supplier<>(201, "Tech Distributors");

        
        Order<Item<Integer>, Supplier<Integer>> order1 = new Order<>(item1, supplier1, 20);

        
        Warehouse<Item<?>> warehouse = new Warehouse<>();
        warehouse.addItem(item1);
        warehouse.addItem(item2);

        System.out.println(order1);
        System.out.println(warehouse);
    }
}
