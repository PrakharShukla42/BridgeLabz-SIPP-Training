package SmartWarehouseManegementSystem;

public class Order<I, S> {
    private I item;
    private S supplier;
    private int quantity;

    public Order(I item, S supplier, int quantity) {
        this.item = item;
        this.supplier = supplier;
        this.quantity = quantity;
    }

    public I getItem() {
        return item;
    }

    public void setItem(I item) {
        this.item = item;
    }

    public S getSupplier() {
        return supplier;
    }

    public void setSupplier(S supplier) {
        this.supplier = supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Order [item=" + item + ", supplier=" + supplier + ", quantity=" + quantity + "]";
    }
}
