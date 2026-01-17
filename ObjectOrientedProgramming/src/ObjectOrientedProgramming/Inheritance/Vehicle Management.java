package ObjectOrientedProgramming.Inheritance;

/*
 * This interface defines refueling behavior
 * for vehicles that use fuel.
 */
interface Refuelable {

    // Method to refuel the vehicle
    void refuel();
}

/*
 * This class represents a base Vehicle
 * with common vehicle-related properties.
 */
class VehicleBase {

    // Maximum speed of the vehicle
    int maxSpeed;

    // Model name of the vehicle
    String model;

    // Constructor to initialize vehicle details
    VehicleBase(int maxSpeed, String model) {
        this.maxSpeed = maxSpeed;
        this.model = model;
    }
}

/*
 * This class represents an Electric Vehicle
 * and extends the VehicleBase class.
 */
class ElectricVehicle extends VehicleBase {

    // Constructor to initialize electric vehicle details
    ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Method specific to electric vehicles
    void charge() {
        System.out.println("Charging vehicle");
    }
}

/*
 * This class represents a Petrol Vehicle
 * and extends the VehicleBase class.
 * It implements the Refuelable interface.
 */
class PetrolVehicle extends VehicleBase implements Refuelable {

    // Constructor to initialize petrol vehicle details
    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    // Implementation of refuel method
    public void refuel() {
        System.out.println("Refueling vehicle");
    }
}

