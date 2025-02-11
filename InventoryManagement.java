// Problem Statement: Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
// Add an item at the beginning, end, or at a specific position.
// Remove an item based on Item ID.
// Update the quantity of an item by Item ID.
// Search for an item based on Item ID or Item Name.
// Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
// Sort the inventory based on Item Name or Price in ascending or descending order.
// Hint:
// Use a singly linked list where each node represents an item in the inventory.
// Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
// For total value calculation, traverse through the list and sum up Quantity * Price for each item.


import java.util.Scanner;

class Item {
    String itemName;
    int itemId;
    int quantity;
    double price;
    Item next;

    public Item(String itemName, int itemId, int quantity, double price) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}

class Inventory {
    private Item head = null;
    Scanner sc = new Scanner(System.in);

    // Add item at the beginning, end, or specific position
    public void addItem(String itemName, int itemId, int quantity, double price, int position) {
        Item newItem = new Item(itemName, itemId, quantity, price);

        if (position == 1) { // Add at beginning
            newItem.next = head;
            head = newItem;
        } else if (position == 2) { // Add at end
            if (head == null) {
                head = newItem;
            } else {
                Item temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newItem;
            }
        } else { // Add at specific position
            Item temp = head;
            for (int i = 1; i < position - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp != null) {
                newItem.next = temp.next;
                temp.next = newItem;
            }
        }
    }

    // Remove item by Item ID
    public void removeItem(int itemId) {
        if (head == null) {
            System.out.println("No items to remove.");
            return;
        }

        if (head.itemId == itemId) {
            head = head.next;
            System.out.println("Item removed.");
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
            System.out.println("Item removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

    // Update quantity by Item ID
    public void updateQuantity(int itemId, int quantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = quantity;
                System.out.println("Quantity updated.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Search item by Item ID or Name
    public void searchItem(String searchTerm) {
        Item temp = head;
        while (temp != null) {
            if (String.valueOf(temp.itemId).equals(searchTerm) || temp.itemName.equals(searchTerm)) {
                System.out.println("Item Found: " + temp.itemName + " (ID: " + temp.itemId + ")");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item not found.");
    }

    // Calculate total value of inventory
    public void calculateTotalValue() {
        double total = 0;
        Item temp = head;
        while (temp != null) {
            total += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total Inventory Value: " + total);
    }

    // Sort inventory by Name or Price (Bubble Sort)
    public void sortInventory(int criteria) {
        if (head == null) return;

        boolean swapped;
        do {
            swapped = false;
            Item temp = head;
            while (temp != null && temp.next != null) {
                boolean swapCondition = criteria == 1 ? temp.itemName.compareTo(temp.next.itemName) > 0 :
                                          temp.price > temp.next.price;
                if (swapCondition) {
                    String tempName = temp.itemName;
                    int tempId = temp.itemId;
                    int tempQuantity = temp.quantity;
                    double tempPrice = temp.price;

                    temp.itemName = temp.next.itemName;
                    temp.itemId = temp.next.itemId;
                    temp.quantity = temp.next.quantity;
                    temp.price = temp.next.price;

                    temp.next.itemName = tempName;
                    temp.next.itemId = tempId;
                    temp.next.quantity = tempQuantity;
                    temp.next.price = tempPrice;

                    swapped = true;
                }
                temp = temp.next;
            }
        } while (swapped);
    }

    // Display all items
    public void displayItems() {
        if (head == null) {
            System.out.println("No items to display.");
            return;
        }
        Item temp = head;
        while (temp != null) {
            System.out.println("Item: " + temp.itemName + " | ID: " + temp.itemId + " | Quantity: " + temp.quantity +
                    " | Price: " + temp.price);
            temp = temp.next;
        }
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Inventory inventory = new Inventory();

        while (true) {
            System.out.println("\nInventory Management:");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Quantity");
            System.out.println("4. Search Item");
            System.out.println("5. Display All Items");
            System.out.println("6. Calculate Total Value");
            System.out.println("7. Sort Inventory");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1: // Add Item
                    System.out.print("Enter Item Name: ");
                    sc.nextLine(); // Consume newline
                    String itemName = sc.nextLine();
                    System.out.print("Enter Item ID: ");
                    int itemId = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    System.out.println("1. Add at Beginning\n2. Add at End\n3. Add at Specific Position");
                    int position = sc.nextInt();
                    inventory.addItem(itemName, itemId, quantity, price, position);
                    break;

                case 2: // Remove Item
                    System.out.print("Enter Item ID to remove: ");
                    int removeId = sc.nextInt();
                    inventory.removeItem(removeId);
                    break;

                case 3: // Update Quantity
                    System.out.print("Enter Item ID to update quantity: ");
                    int updateId = sc.nextInt();
                    System.out.print("Enter new Quantity: ");
                    int newQuantity = sc.nextInt();
                    inventory.updateQuantity(updateId, newQuantity);
                    break;

                case 4: // Search Item
                    System.out.print("Enter Item ID or Name to search: ");
                    sc.nextLine(); // Consume newline
                    String searchTerm = sc.nextLine();
                    inventory.searchItem(searchTerm);
                    break;

                case 5: // Display All Items
                    inventory.displayItems();
                    break;

                case 6: // Calculate Total Value
                    inventory.calculateTotalValue();
                    break;

                case 7: // Sort Inventory
                    System.out.println("1. Sort by Name\n2. Sort by Price");
                    int sortCriteria = sc.nextInt();
                    inventory.sortInventory(sortCriteria);
                    break;

                case 8: // Exit
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
