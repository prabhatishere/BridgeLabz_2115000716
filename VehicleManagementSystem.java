// Description: Model a vehicle system where Vehicle is the superclass and ElectricVehicle and PetrolVehicle are subclasses. Additionally, create a Refuelable interface implemented by PetrolVehicle.
// Tasks:
// Define a superclass Vehicle with attributes like maxSpeed and model.
// Create an interface Refuelable with a method refuel().
// Define subclasses ElectricVehicle and PetrolVehicle. PetrolVehicle should implement Refuelable, while ElectricVehicle include a charge() method.



// Superclass: Vehicle
class Vehicle {
    protected String model;
    protected int maxSpeed;

    // Constructor
    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // Method to display vehicle details
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
    }
}

// Interface: Refuelable
interface Refuelable {
    // Abstract method for refueling
    void refuel();
}

// Subclass: ElectricVehicle extends Vehicle
class ElectricVehicle extends Vehicle {
    private int batteryCapacity;

    // Constructor
    public ElectricVehicle(String model, int maxSpeed, int batteryCapacity) {
        super(model, maxSpeed);
        this.batteryCapacity = batteryCapacity;
    }

    // Method to charge the electric vehicle
    public void charge() {
        System.out.println("Charging the electric vehicle...");
    }

    // Overriding displayInfo to include battery capacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Battery Capacity: " + batteryCapacity + " kWh");
    }
}

// Subclass: PetrolVehicle extends Vehicle implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {
    private int fuelTankCapacity;

    // Constructor
    public PetrolVehicle(String model, int maxSpeed, int fuelTankCapacity) {
        super(model, maxSpeed);
        this.fuelTankCapacity = fuelTankCapacity;
    }

    // Implementing the refuel method from the Refuelable interface
    @Override
    public void refuel() {
        System.out.println("Refueling the petrol vehicle...");
    }

    // Overriding displayInfo to include fuel tank capacity
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Fuel Tank Capacity: " + fuelTankCapacity + " liters");
    }
}

// Main class to test the system
public class VehicleManagementSystem {
    public static void main(String[] args) {
        // Creating an ElectricVehicle object
        ElectricVehicle electricVehicle = new ElectricVehicle("Tesla Model S", 250, 100);

        // Creating a PetrolVehicle object
        PetrolVehicle petrolVehicle = new PetrolVehicle("Ford Mustang", 220, 60);

        // Displaying information and calling methods for Electric and Petrol vehicles
        System.out.println("Electric Vehicle Details:");
        electricVehicle.displayInfo();
        electricVehicle.charge();
        System.out.println();

        System.out.println("Petrol Vehicle Details:");
        petrolVehicle.displayInfo();
        petrolVehicle.refuel();
    }
}
