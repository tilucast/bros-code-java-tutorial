package OOP.polymorphism;

public class Main {

    //The ability of an object to identify itself as more than one thing.
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bike = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bike, boat};
        for (Vehicle x : racers) {
            x.go();
        }
    }
}
