public class Switches {
    public static void main(String[] args){
        String day = "friday";

        switch(day){
            case "sunday": System.out.println("it is sunday");
            break;
            case "monday": System.out.println("it is monday");
            break;
            default: System.out.println("That means that 'they' invented a new day of the week. Sad.");
        }
    }
}
