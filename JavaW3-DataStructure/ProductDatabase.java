import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap < String, Integer > productList = new HashMap < String, Integer > ();
        productList.put("Eggs", 200);
        productList.put("Milk", 200);
        productList.put("Fish", 400);
        productList.put("Apples", 150);
        productList.put("Bread", 50);
        productList.put("Chicken", 550);
        System.out.println(productList.get("Fish")); // How much is the fish?
        int max = 0;
        String maxProduct = "";
        int min = 0;
        String minProduct = "";
        int sum = 0;
        double average = 0;
        int under300 = 0;
        String exactly125 = "";
        for (Map.Entry entry: productList.entrySet()) {
            if ((Integer) entry.getValue() > max) {
                max = (Integer) entry.getValue();
                maxProduct = String.valueOf((String) entry.getKey());
            }

            if ((Integer) entry.getValue() < 300) {
                under300 += 1;
            }

            if (min == 0 || (Integer) entry.getValue() < min) { // min == 0 for first loop, because I dont know minimal value
                min = (Integer) entry.getValue();
                minProduct = String.valueOf((String) entry.getKey());
            }
            sum += (Integer) entry.getValue();
        }
        System.out.println(maxProduct);
        System.out.println(Float.valueOf((float) sum / productList.size()));
        System.out.println(under300);
        if (productList.containsValue(125)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(minProduct);
    }

}