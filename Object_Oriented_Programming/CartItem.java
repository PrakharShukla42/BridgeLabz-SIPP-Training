class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
        } else {
            System.out.println("Cannot remove more items than present in cart.");
        }
    }

    double totalCost() {
        return price * quantity;
    }

    void displayCart() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Laptop", 50000, 1);
        cart.addItem(1);
        cart.removeItem(1);
        cart.displayCart();
    }
}
