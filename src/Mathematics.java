import java.util.Scanner;

public class Mathematics {
    public static void main(String[] args){
//        double x = 3.14;
//        double y = -10;
//
//        double greater = Math.max(x, y);
//        double lesser = Math.min(x, y);
//        System.out.println(greater);
//        System.out.println(lesser);
//
//        double squaredvalue = Math.sqrt(25);
//        System.out.println(squaredvalue);

        // ----------------------

        //Find hypotenuse of a triangle

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side x: ");
        x = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((Math.pow(x,2) + Math.pow(y,2)));

        System.out.println("The hypotenuse of a triangle with sides " + x + " and " + y + " is equal to = " + z);

        scanner.close();
    }
}
