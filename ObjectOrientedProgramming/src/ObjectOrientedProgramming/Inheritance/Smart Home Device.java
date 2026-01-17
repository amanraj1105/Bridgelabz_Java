package ObjectOrientedProgramming.Inheritance;

/*
 * This class represents a generic Device
 * with basic device-related information.
 */
class Device {

    // Unique identifier for the device
    String deviceId;

    // Current status of the device (on/off)
    boolean status;

    // Constructor to initialize device details
    Device(String deviceId, boolean status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

/*
 * This class represents a Thermostat device
 * and extends the Device class.
 */
class Thermostat extends Device {

    // Temperature setting of the thermostat
    int temperatureSetting;

    // Constructor to initialize thermostat details
    Thermostat(String deviceId, boolean status, int temperatureSetting) {
        super(deviceId, status);
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display thermostat status
    void displayStatus() {
        System.out.println(
                deviceId + " " +
                status + " " +
                temperatureSetting
        );
    }
}
