package OOP;

public class Friend {

    //static keyword

    String name;
    private static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void displayFriends(){
        System.out.println("You have " + numOfFriends + " friends.");
    }
}
