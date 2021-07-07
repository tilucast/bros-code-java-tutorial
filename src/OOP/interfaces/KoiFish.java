package OOP.interfaces;

public class KoiFish implements Predator, Prey{

    @Override
    public void hunt() {
        System.out.println("KoiFish: Imma chase that mf");
    }

    @Override
    public void flee() {
        System.out.println("KoiFish: Lets get outta here");
    }
}
