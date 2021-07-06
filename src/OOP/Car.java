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

    @Override
    void describe() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
