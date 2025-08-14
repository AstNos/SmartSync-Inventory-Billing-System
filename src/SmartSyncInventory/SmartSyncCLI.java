package SmartSyncInventory;

// SmartSyncCLI.java
// The main entry point and user interface for the application.

import java.util.Scanner;
import java.util.UUID;

public class SmartSyncCLI {
    private static Inventory inventory = new Inventory();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the SmartSync Inventory Management System!");
        runMenu();
    }

    public static void runMenu() {
        while (true) {
            printMenu();
            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addProduct();
                    break;
                case "2":
                    viewAllProducts();
                    break;
                case "3":
                    updateProduct();
                    break;
                case "4":
                    deleteProduct();
                    break;
                case "5":
                    System.out.println("Thank you for using SmartSync. Goodbye!");
                    return; // Exit the program
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== MENU =====");
        System.out.println("1. Add Product");
        System.out.println("2. View All Products");
        System.out.println("3. Update Product");
        System.out.println("4. Delete Product");
        System.out.println("5. Exit");
        System.out.println("==================");
    }

    private static void addProduct() {
        try {
            System.out.print("Enter Product Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Product Quantity: ");
            int quantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Product Price: ");
            double price = Double.parseDouble(scanner.nextLine());

            // Generate a unique ID
            String id = UUID.randomUUID().toString().substring(0, 8);

            Product newProduct = new Product(id, name, quantity, price);
            inventory.addProduct(newProduct);

        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid input. Quantity must be an integer and price must be a number.");
        }
    }

    private static void viewAllProducts() {
        inventory.viewAllProducts();
    }

    private static void updateProduct() {
        try {
            System.out.print("Enter Product ID to update: ");
            String id = scanner.nextLine();

            if (inventory.getProduct(id) == null) {
                System.out.println("ERROR: No product found with this ID.");
                return;
            }

            System.out.print("Enter New Product Name: ");
            String newName = scanner.nextLine();
            System.out.print("Enter New Product Quantity: ");
            int newQuantity = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter New Product Price: ");
            double newPrice = Double.parseDouble(scanner.nextLine());

            inventory.updateProduct(id, newName, newQuantity, newPrice);

        } catch (NumberFormatException e) {
            System.out.println("ERROR: Invalid input. Quantity must be an integer and price must be a number.");
        }
    }

    private static void deleteProduct() {
        System.out.print("Enter Product ID to delete: ");
        String id = scanner.nextLine();
        inventory.deleteProduct(id);
    }
}