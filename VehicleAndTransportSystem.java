// Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
// Tasks:
// Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
// Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
// Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.




class Vehicle {
    protected int maxSpeed;
    protected String fuelType;

    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Abstract method to be implemented by subclasses
    public void displayInfo(){
        System.out.println("Max speed: "+maxSpeed);
        System.out.println("Fuel type: "+fuelType);

    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int loadCapacity;

    // Constructor
    public Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Truck - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Load Capacity: " + loadCapacity + " tons");
    }
}

class Motorcycle extends Vehicle {
    private boolean hasSideCar;

    // Constructor
    public Motorcycle(int maxSpeed, String fuelType, boolean hasSideCar) {
        super(maxSpeed, fuelType);
        this.hasSideCar = hasSideCar;
    }

    @Override
    public void displayInfo() {
        System.out.println("Motorcycle - Max Speed: " + maxSpeed + " km/h, Fuel Type: " + fuelType + ", Has Sidecar: " + hasSideCar);
    }
}

public class VehicleAndTransportSystem {
    public static void main(String[] args) {
        // Creating objects of subclasses
        Vehicle car = new Car(220, "Petrol", 5);
        Vehicle truck = new Truck(120, "Diesel", 15);
        Vehicle motorcycle = new Motorcycle(180, "Petrol", false);

        Vehicle[] vehicles = {car, truck, motorcycle};

        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
