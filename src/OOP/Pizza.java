package OOP;

public class Pizza {

    //constructor overriding

    String bread;
    String sauce;
    String cheese;
    String topping;

    Pizza(String bread, String cheese, String topping, String sauce){
        this.bread = bread;
        this.cheese = cheese;
        this.topping = topping;
        this.sauce = sauce;
    }

    Pizza(String bread, String cheese, String sauce){
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = sauce;
        this.topping = "Mushrooms";
    }

    Pizza(String bread, String cheese){
        this.bread = bread;
        this.cheese = cheese;
        this.sauce = "Pepper";
        this.topping = "Mushrooms";
    }

    Pizza(String bread){
        this.bread = bread;
        this.cheese = "Sakura cheese";
        this.sauce = "Pepper";
        this.topping = "Mushrooms";
    }
}
