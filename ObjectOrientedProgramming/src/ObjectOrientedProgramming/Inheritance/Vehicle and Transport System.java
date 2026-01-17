package ObjectOrientedProgramming.Inheritance;

/*
 * This class represents a generic Vehicle
 * with common vehicle-related properties.
 */
class Vehicle {

    // Maximum speed of the vehicle
    int maxSpeed;

    // Fuel type used by the vehicle
    String fuelType;

    // Constructor to initialize vehicle details
    Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }

    // Method to display vehicle information
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType);
    }
}

/*
 * This class represents a Car
 * and extends the Vehicle class.
 */
class Car extends Vehicle {

    // Seating capacity of the car
    int seatCapacity;

    // Constructor to initialize car details
    Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    // Override method to display car information
    @Override
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + seatCapacity);
    }
}

/*
 * This class represents a Truck
 * and extends the Vehicle class.
 */
class Truck extends Vehicle {

    // Load carrying capacity of the truck
    int loadCapacity;

    // Constructor to initialize truck details
    Truck(int maxSpeed, String fuelType, int loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    // Override method to display truck information
    @Override
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + loadCapacity);
    }
}

/*
 * This class represents a Motorcycle
 * and extends the Vehicle class.
 */
class Motorcycle extends Vehicle {

    // Indicates whether the motorcycle has gears
    boolean hasGear;

    // Constructor to initialize motorcycle details
    Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    // Override method to display motorcycle information
    @Override
    void displayInfo() {
        System.out.println(maxSpeed + " " + fuelType + " " + hasGear);
    }
}
