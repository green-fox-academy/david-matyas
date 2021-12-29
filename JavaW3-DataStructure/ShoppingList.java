import java.util.ArrayList;
import java.util.Collections;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> shoppingList = new ArrayList<String>();

        shoppingList.add("eggs");
        Collections.addAll(shoppingList, "milk", "fish", "apples","bread", "chicken");
        if(shoppingList.contains("milk"))
        {
            System.out.println("yes");
        } else System.out.println("no");

        if(shoppingList.contains("bananas"))
        {
            System.out.println("yes");
        } else System.out.println("no");

    }
}