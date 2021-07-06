public class OverloadedMethods {
    public static void main(String[] args) {

        int first = add(5,6);
        System.out.println(first);
        int second = add(5,6,7);
        System.out.println(second);
        int third = add(5,6,7,8);
        System.out.println(third);
        int fourth = add(5.0,6.0);
        System.out.println(fourth);

    }

    //These are overloaded methods. Methods that share the same name but have different parameters.

    static int add(int a, int b) {
        System.out.println("Overloaded 1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overloaded 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overloaded 3");
        return a + b + c + d;
    }

    static int add(double a, double b){
        System.out.println("Overloaded 4");
        double temp = a + b;
        return (int) temp;
    }
}
