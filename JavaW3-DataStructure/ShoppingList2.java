import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class ShoppingList2 {
    public static void main(String[] args) {

        HashMap < String, Double > productPrice = new HashMap < String, Double > ();

        productPrice.put("Milk", 1.07);
        productPrice.put("Rice", 1.59);
        productPrice.put("Eggs", 3.14);
        productPrice.put("Cheese", 12.60);
        productPrice.put("Chicken Breasts", 9.40);
        productPrice.put("Apples", 2.31);
        productPrice.put("Tomato", 2.58);
        productPrice.put("Potato", 1.75);
        productPrice.put("Onion", 1.10);

        //Represent Bob's shopping list:
        HashMap < String, Integer > bobList = new HashMap < String, Integer > ();
        bobList.put("Milk", 3);
        bobList.put("Rice", 2);
        bobList.put("Eggs", 2);
        bobList.put("Cheese", 1);
        bobList.put("Chicken Breasts", 4);
        bobList.put("Apples", 1);
        bobList.put("Tomato", 2);
        bobList.put("Potato", 1);

        //Represent Alice's shopping list:
        HashMap < String, Integer > aliceList = new HashMap < String, Integer > ();
        aliceList.put("Rice", 1);
        aliceList.put("Eggs", 5);
        aliceList.put("Chicken Breasts", 2);
        aliceList.put("Apples", 1);
        aliceList.put("Tomato", 10);

        System.out.println(Bill(productPrice, bobList, "price"));
        System.out.println(Bill(productPrice, aliceList, "price"));
        //Compare list:
        String[] productCompare = new String[] {
                "Rice",
                "Potato",
                "Ham",
                "Apples"
        };

        for (int i = 0; i < productCompare.length; i++) {
            System.out.println(CustomerMoreItems(bobList, aliceList, productCompare[i], "Bob", "Alice"));
        }

        // Who buys more of different products? - based on fact that Key is unique it could be only size of HasMap
        if (bobList.size() > aliceList.size()) {
            System.out.println("Bob");
        } else {
            if (bobList.size() > aliceList.size()) {

                System.out.println(aliceList.size());
            } else System.out.println("Both have same");
        }

        // Who buys more items? (more pieces)
        if (Bill(productPrice, bobList, "item") > Bill(productPrice, aliceList, "item")) {
            System.out.println("Bob");
        } else if (Bill(productPrice, bobList, "item") < Bill(productPrice, aliceList, "item")) {
            System.out.println("Alice");
        } else
            System.out.println("both have same");
    }

    public static Double Bill(HashMap < String, Double > productPrice, HashMap < String, Integer > customerList, String type) {
        Double bill = 0.0;
        Double items = 0.0;
        for (Map.Entry entry: productPrice.entrySet()) {
            for (Map.Entry entry2: customerList.entrySet()) {
                if (entry.getKey().equals(entry2.getKey())) {
                    bill += Double.valueOf((Double) entry.getValue()) * Double.valueOf((Integer) entry2.getValue());
                    items += Double.valueOf((Integer) entry2.getValue());
                }
            }
        }
        if (type == "price") {
            return bill;
        } else return items;

    }
    public static String CustomerMoreItems(HashMap < String, Integer > customer1List, HashMap < String, Integer > customer2List, String product, String customer1, String customer2) {
        String customer = "no one";
        if (customer1List.containsKey(product) && customer2List.containsKey(product)) { // Both have
            if (customer1List.get(product) - customer2List.get(product) > 0) {
                customer = customer1;
            } else {
                if (customer1List.get(product) - customer2List.get(product) < 0) {
                    customer = customer2;
                }
            }
        } else {
            if (customer1List.containsKey(product)) { // only Bob have
                customer = customer1;
            } else {
                if (customer2List.containsKey(product)) { // only Alice have
                    customer = customer2;
                }
            }
        }
        return customer;
    }
}