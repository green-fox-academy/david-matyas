import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap < String, Integer > productList = new HashMap < String, Integer > ();
        productList.put("Eggs", 200);
        productList.put("Milk", 200);
        productList.put("Fish", 400);
        productList.put("Apples", 150);
        productList.put("Bread", 50);
        productList.put("Chicken", 550);
        ArrayList < String > list = new ArrayList < String > ();
        HashMap < String, Integer > expensiveList = new HashMap < String, Integer > ();
        int under = 201;
        int moreThan = 150;
        for (Map.Entry entry: productList.entrySet()) {
            if ((Integer) entry.getValue() < under) {
                list.add(String.valueOf((String) entry.getKey()));
            }
            if ((Integer) entry.getValue() > moreThan) {
                expensiveList.put(String.valueOf((String) entry.getKey()), (Integer) entry.getValue());
            }
        }

        for (int i = 0; i < list.size(); i++) { // Print products cost less than 201
            System.out.println(list.get(i));
        }
        for (Map.Entry entry: expensiveList.entrySet()) { // Print products cost more than 150
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }

}