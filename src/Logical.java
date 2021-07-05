import java.util.Scanner;

public class Logical {
    public static void main(String[] args){
//        String name = "Loucas Penico";
//
//        if(name.length() < 10){
//            System.out.println("Your name is too short boi.");
//        }
//
//        if(name.length() > 10 && name.length() <= 15){
//            System.out.println("Your name is just the right size. " + name.length());
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you want to quit? Press 'q' or 'Q' to quit.");
        String res = scanner.next();

        if(res.equals("q") || res.equals("Q")){
            System.out.println("Closing the game ...");
        } else {
            System.out.println("Imma do nothing." + res);
        }
    }
}
