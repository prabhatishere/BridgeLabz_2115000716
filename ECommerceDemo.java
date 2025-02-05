import java.util.ArrayList;
import java.util.List;

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
    }

    public void displayOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println("  Product: " + product.getName() + " - Price: $" + product.getPrice());
        }
    }
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}

public class ECommerceDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe");
        Order order1 = new Order(101);
        Order order2 = new Order(102);
        
        Product laptop = new Product("Laptop", 1200.00);
        Product phone = new Product("Smartphone", 800.00);
        
        order1.addProduct(laptop);
        order1.addProduct(phone);
        order2.addProduct(phone);
        
        customer.placeOrder(order1);
        customer.placeOrder(order2);
        
        customer.displayOrders();
    }
}
