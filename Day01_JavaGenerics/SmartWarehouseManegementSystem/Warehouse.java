package SmartWarehouseManegementSystem;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {
    private List<T> inventory;

    public Warehouse() {
        inventory = new ArrayList<>();
    }

    public void addItem(T item) {
        inventory.add(item);
    }

    public void removeItem(T item) {
        inventory.remove(item);
    }

    public List<T> getInventory() {
        return inventory;
    }

    @Override
    public String toString() {
        return "Warehouse Inventory: " + inventory;
    }
}
