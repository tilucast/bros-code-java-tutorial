public class Printf {
    public static void main(String[] args) {
        System.out.printf("This is a formatted string: %,d %b %.2f %c", 123123, true, 123.5, '@');

        //[flags]
        //adds an effect to output based on the flag added to the format specifier
        // - : left justify
        // + : outputs a plus sign on a numeric value
        // - : outputs a minus sign on a numeric value
        // 0 : numeric values are zero-padded
        // , : group numbers by comma if the given number is > 1000
    }
}
