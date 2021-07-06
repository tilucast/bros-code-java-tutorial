public class Methods {
    public static void main(String[] args) {
        sayHello("Argument x", 5);
        sayHello("Argument y", 6);
        sayHello("Argument z", 7);

        String returned = dull("LUCAS TAVARES");
        System.out.println(returned);

        int returnedsum = sum(5,6);
        System.out.println(returnedsum);
    }

    static void sayHello(String arg, int number){
        System.out.printf("first argument: %s, second argument: %d\n", arg, number);
    }

    static String dull(String arg){
        return arg.toLowerCase();
    }

    static int sum(int arg1, int arg2){
        return arg1 + arg2;
    }
}
