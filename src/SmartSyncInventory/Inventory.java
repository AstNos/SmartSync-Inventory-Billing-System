package SmartSyncInventory;

// Inventory.java
// Handles the business logic for managing products.

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Product> products;

    public Inventory() {
        this.products = new HashMap<>();
    }

    /**
     * Adds a new product to the inventory.
     * @param product The product to be added.
     */
    public void addProduct(Product product) {
        products.put(product.getId(), product);
        System.out.println("SUCCESS: Product '" + product.getName() + "' added.");
    }

    /**
     * Retrieves a product by its ID.
     * @param productId The ID of the product to find.
     * @return The Product object if found, otherwise null.
     */
    public Product getProduct(String productId) {
        return products.get(productId);
    }

    /**
     * Updates an existing product's details.
     * @param productId The ID of the product to update.
     * @param newName The new name for the product.
     * @param newQuantity The new quantity.
     * @param newPrice The new price.
     * @return true if update was successful, false otherwise.
     */
    public boolean updateProduct(String productId, String newName, int newQuantity, double newPrice) {
        Product product = products.get(productId);
        if (product != null) {
            product.setName(newName);
            product.setQuantity(newQuantity);
            product.setPrice(newPrice);
            System.out.println("SUCCESS: Product ID " + productId + " updated.");
            return true;
        }
        System.out.println("ERROR: Product ID " + productId + " not found.");
        return false;
    }

    /**
     * Deletes a product from the inventory.
     * @param productId The ID of the product to delete.
     * @return true if deletion was successful, false otherwise.
     */
    public boolean deleteProduct(String productId) {
        if (products.containsKey(productId)) {
            products.remove(productId);
            System.out.println("SUCCESS: Product ID " + productId + " deleted.");
            return true;
        }
        System.out.println("ERROR: Product ID " + productId + " not found.");
        return false;
    }

    /**
     * Displays all products in the inventory.
     */
    public void viewAllProducts() {
        if (products.isEmpty()) {
            System.out.println("Inventory is empty.");
            return;
        }
        System.out.println("\n--- Current Inventory ---");
        for (Product product : products.values()) {
            System.out.println(product);
        }
        System.out.println("-------------------------\n");
    }
}