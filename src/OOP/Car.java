package OOP;

public class Car extends Vehicle {
    String make = "Chevrolet";
    String model = "Corvert";
    int year = 2020;
    String color = "red";
    double price = 20000;

    void drive(){
        System.out.println("You are driving.");
    }

    void brake(){
        System.out.println("You have stopped the car.");
    }
}
