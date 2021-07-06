import java.util.ArrayList;

public class ForEach {
    public static void main(String[] args) {
        String[] animals = {"Cat", "Dog", "Monkey", "Zebra"};

        for (String i :  animals) {
            System.out.println(i);
        }

        ArrayList<String> animals2 = new ArrayList();
        animals2.add("Lion");
        animals2.add("Tiger");
        animals2.add("Crow");
        System.out.println();

        for (String i : animals2) {
            System.out.println(i);
        }
    }
}
