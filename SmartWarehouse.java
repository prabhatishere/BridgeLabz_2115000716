// Concepts: Generic Classes, Bounded Type Parameters, Wildcards
// Problem Statement:
// You are developing a Smart Warehouse System that manages different types of items like Electronics, Groceries,
//  and Furniture. The system should be able to store and retrieve items dynamically while maintaining type safety.
// Hints:
// Create an abstract class WarehouseItem that all items extend (Electronics, Groceries, Furniture).
// Implement a generic class Storage<T extends WarehouseItem> to store items safely.
// Implement a wildcard method to display all items in storage regardless of their type (List<? extends WarehouseItem>).

import java.util.ArrayList;
import java.util.List;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayDetails();
}

class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand) {
        super(name);
        this.brand = brand;
    }

    public void displayDetails() {
        System.out.println("Electronics: " + getName() + " | Brand: " + brand);
    }
}

class Groceries extends WarehouseItem {
    private String expirationDate;

    public Groceries(String name, String expirationDate) {
        super(name);
        this.expirationDate = expirationDate;
    }

    public void displayDetails() {
        System.out.println("Grocery: " + getName() + " | Expiration Date: " + expirationDate);
    }
}

class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material) {
        super(name);
        this.material = material;
    }

    public void displayDetails() {
        System.out.println("Furniture: " + getName() + " | Material: " + material);
    }
}

class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> getItems() {
        return items;
    }
}

class WarehouseUtils {
    public static void displayItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items)
            item.displayDetails();
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", "Dell"));
        electronicsStorage.addItem(new Electronics("Smartphone", "Samsung"));

        Storage<Groceries> groceryStorage = new Storage<>();
        groceryStorage.addItem(new Groceries("Milk", "2025-03-10"));
        groceryStorage.addItem(new Groceries("Bread", "2024-02-20"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", "Wood"));
        furnitureStorage.addItem(new Furniture("Table", "Metal"));

        System.out.println("Electronics:");
        WarehouseUtils.displayItems(electronicsStorage.getItems());
        System.out.println("\nGroceries:");
        WarehouseUtils.displayItems(groceryStorage.getItems());
        System.out.println("\nFurniture:");
        WarehouseUtils.displayItems(furnitureStorage.getItems());
    }
}
