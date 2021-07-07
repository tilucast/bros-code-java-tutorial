package OOP.interfaces;

public class Main {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        KoiFish fish = new KoiFish();
        fish.flee();
        fish.hunt();
    }
}
