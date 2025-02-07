// Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
// Tasks:
// Define a superclass Device with attributes like deviceId and status.
// Create a subclass Thermostat with additional attributes like temperatureSetting.
// Implement a method displayStatus() to show each device's current settings.





// Superclass: Device
class Device {
    protected String deviceId;
    protected String status;

    // Constructor
    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    // Method to display device status
    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass: Thermostat
class Thermostat extends Device {
    private int temperatureSetting;

    // Constructor
    public Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Overriding displayStatus method to include thermostat details
    @Override
    public void displayStatus() {
        super.displayStatus();  // Displaying device status
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class
public class SmartHomeDevices {
    public static void main(String[] args) {
        // Creating a Thermostat object
        Thermostat thermostat = new Thermostat("Thermo123", "On", 22);

        // Calling displayStatus() to show the details
        thermostat.displayStatus();
    }
}
