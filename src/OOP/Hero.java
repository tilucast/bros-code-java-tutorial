package OOP;

public class Hero extends Person{

    String heroName;
    String power;

    Hero(String heroName, String power, String name, int age){
        super(name, age);
        this.heroName = heroName;
        this.power = power;
    }

    public String toString(){
        return String.format("%s %s ", this.heroName, this.power) + super.toString();
    }
}
