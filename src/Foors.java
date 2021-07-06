import java.util.Scanner;

public class Foors {
    public static void main(String[] args) {
//        for (int i = 10; i >=0; i--) {
//            System.out.println(i);
//        }

        Scanner scanner = new Scanner(System.in);
        int rows, columns;
        String symbol = "";

        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.println("Enter a symbol to use: ");
        symbol = scanner.next();

        for (int i = 0; i < rows; i++) {
            System.out.println();
            for (int j = 1; j <= columns ; j++) {
                System.out.print(symbol);
            }
        }
    }
}
