package OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcpHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a whole number: ");
        try{

            int whole = scanner.nextInt();
            System.out.println("The whole is : " + whole);

        } catch(InputMismatchException error){
            System.out.println("You have entered something that isnt a whole number :/");
        }
        catch(Exception e){
            System.out.println("Something went wrong tho." + e);
        }
        finally {
            System.out.println("You can go back, and enter the right input if did something wrong boi.");
            scanner.close();
        }

    }
}
