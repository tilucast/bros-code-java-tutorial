package OOP.package1;

import OOP.package2.*;

public class A {

    //protected access modifier makes it so protected methods/props are available on other packages, as long as the class is a sub class of the class with the protected method/prop.
    protected static String protectedmessage = "this is protected.";

    public static void main(String[] args) {
        System.out.println(C.publicmessage);
    }
}
