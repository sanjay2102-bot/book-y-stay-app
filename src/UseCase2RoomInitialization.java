/**
 * UseCase2RoomInitialization
 *
 * Demonstrates room types using abstraction and inheritance.
 * Displays room details and static availability.
 *
 * @author Sanjay
 * @version 2.0
 */

// ABSTRACT CLASS
abstract class Room {
    protected String type;
    protected int beds;
    protected double price;

    public Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    // Abstract method
    public abstract void displayDetails();
}

// SINGLE ROOM
class SingleRoom extends Room {
    public SingleRoom() {
        super("Single Room", 1, 2000);
    }

    public void displayDetails() {
        System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
    }
}

// DOUBLE ROOM
class DoubleRoom extends Room {
    public DoubleRoom() {
        super("Double Room", 2, 3500);
    }

    public void displayDetails() {
        System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
    }
}

// SUITE ROOM
class SuiteRoom extends Room {
    public SuiteRoom() {
        super("Suite Room", 3, 6000);
    }

    public void displayDetails() {
        System.out.println(type + " | Beds: " + beds + " | Price: ₹" + price);
    }
}

// MAIN CLASS
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("====== Book My Stay App (Version 2.0) ======");

        // Creating room objects (Polymorphism)
        Room single = new SingleRoom();
        Room dbl = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // Display details
        single.displayDetails();
        System.out.println("Available: " + singleAvailable);

        dbl.displayDetails();
        System.out.println("Available: " + doubleAvailable);

        suite.displayDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}
