import java.util.ArrayList;

public class MultiDimArrayList {
    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList();
        shoppingList.add("Pasta");
        shoppingList.add("Doughnuts");
        shoppingList.add("Bread");

        ArrayList<String> vegetableList = new ArrayList();
        vegetableList.add("Tomato");
        vegetableList.add("I know its not a vegetable");
        vegetableList.add("Lettuce");

//        System.out.println(shoppingList);
//        System.out.println(vegetableList);

        ArrayList<ArrayList<String>> groceryList = new ArrayList();
        groceryList.add(shoppingList);
        groceryList.add(vegetableList);

        System.out.println(groceryList);
        System.out.println(groceryList.get(1).get(0));
        System.out.println(groceryList.get(1).get(2));
    }
}
