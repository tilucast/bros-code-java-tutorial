public class Conditionals {
    public static void main(String[] args){
        int x = 9;
        String msg = "";

        msg = x >= 10 ? "i am greater than or equal to 10" : "Iam a weak number";

        System.out.println(msg);

        int age = 17;

        if(age >= 16){
            System.out.println("im an adult");
        }
        else if(age == 17){
            System.out.println("Almost there boi.");
        }
        else {
            System.out.println("I am not adult.");
        }

        String c = "boi";

        if(c == "boi"){
            // == compares references, not values.
            System.out.println("Strings equals boi");
        }
    }
}
