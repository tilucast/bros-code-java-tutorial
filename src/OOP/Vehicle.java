package OOP;

//abstract keyword on a class makes it so this class cannot be instantiated. Too generic for that.

public abstract class Vehicle {

    double maxSpeed;

    void go(){
        System.out.println("This vehicle is moving.");
    }

    void stop(){
        System.out.println("This vehicle has stopped.");
    }


    //abstract keyword on a method makes it so child classes must either declare or implement the method
    abstract void describe();
}
