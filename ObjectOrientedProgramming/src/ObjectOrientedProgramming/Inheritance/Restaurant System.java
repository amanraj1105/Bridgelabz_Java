package ObjectOrientedProgramming.Inheritance;

/*
 * This interface represents a Worker
 * and defines common duties that workers must perform.
 */
interface Worker {

    // Method to perform assigned duties
    void performDuties();
}

/*
 * This class represents a base person
 * with common personal details.
 */
class PersonBase {

    // Name of the person
    String name;

    // Unique ID of the person
    int id;

    // Constructor to initialize person details
    PersonBase(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

/*
 * This class represents a Chef
 * who extends PersonBase and implements Worker.
 */
class Chef extends PersonBase implements Worker {

    // Constructor to initialize chef details
    Chef(String name, int id) {
        super(name, id);
    }

    // Implementation of worker duties for Chef
    public void performDuties() {
        System.out.println("Cooking food");
    }
}

/*
 * This class represents a Waiter
 * who extends PersonBase and implements Worker.
 */
class Waiter extends PersonBase implements Worker {

    // Constructor to initialize waiter details
    Waiter(String name, int id) {
        super(name, id);
    }

    // Implementation of worker duties for Waiter
    public void performDuties() {
        System.out.println("Serving customers");
    }
}

