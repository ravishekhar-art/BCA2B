class Product {
    String productName;
    int quantity;
    int threshold;

    // Constructor
    Product(String productName, int quantity, int threshold) {
        this.productName = productName;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    // Method to check stock
    void checkStock() {
        if (quantity < threshold) {
            System.out.println("Product: " + productName + " - Low Stock Alert!");
        } else {
            System.out.println("Product: " + productName + " - Stock OK");
        }
    }
}

class InventoryManager {
    Product[] products;

    // Constructor
    InventoryManager(Product[] products) {
        this.products = products;
    }

    // Method to check all products
    void checkLowStock() {
        System.out.println("Checking Inventory...\n");

        for (int i = 0; i < products.length; i++) {
            products[i].checkStock();
        }
    }
}

public class WarehouseInventory {
    public static void main(String[] args) {

        // Creating product objects
        Product p1 = new Product("Laptop", 10, 5);
        Product p2 = new Product("Mouse", 2, 5);
        Product p3 = new Product("Keyboard", 7, 3);

        // Array of products
        Product[] items = {p1, p2, p3};

        // Inventory manager object
        InventoryManager manager = new InventoryManager(items);

        // Check stock
        manager.checkLowStock();
    }
}