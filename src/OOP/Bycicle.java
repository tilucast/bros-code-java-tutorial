package OOP;

public class Bycicle extends Vehicle{

    int wheels = 2;

    @Override
    void describe() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Bycicle{" +
                "wheels=" + wheels +
                '}';
    }
}
