package OOP.package2;
import OOP.package1.*;

public class C {

    //default access modifier makes it so only code on the same package can access the property/method
    static String defaultmessage = "default boi.";

    //public access modifier makes it so anything on the project folder can access the prop/method.
    public static String publicmessage = "public prop here";

    //private access modifier makes it so the method/prop is only available within the class itself.
    private static String privatemessage = "private message here.";
}
