import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<String, String>();

        map1.put("978-1-60309-452-8", "A Letter to Jo");
        map1.put("978-1-60309-459-7", "Lupus");
        map1.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        map1.put("978-1-60309-461-0", "The Lab");
        for (Map.Entry entry : map1.entrySet()) {
            System.out.println(entry.getValue() + "(ISBN: " + entry.getKey() + ")");

        }


        map1.remove("978-1-60309-444-3"); // Remove the key-value pair with key 978-1-60309-444-3

        for (Map.Entry entry : map1.entrySet()) { // Remove the key-value pair with value The Lab
            if (entry.getValue().equals("The Lab"))  {
                map1.remove(entry.getKey());
            }

        }
        map1.put("978-1-60309-450-4", "They Called Us Enemy");
        map1.put("978-1-60309-453-5", "Why Did We Trust Him?");
        boolean containValue = false;
        if (map1.get("478-0-61159-424-8") != null) { //Print whether there is an associated value with key 478-0-61159-424-8 or not
            containValue = true;
            System.out.println(containValue);
        } System.out.println(containValue);

        System.out.println(map1.get("978-1-60309-453-5")); // Print the value associated with key 978-1-60309-453-5

    }
}