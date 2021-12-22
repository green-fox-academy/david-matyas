import java.util.HashMap;
import java.util.Map;

public class MapIntroduction2 {
    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<String, String>();

        map1.put("978-1-60309-452-8", "A Letter to Jo");
        map1.put("978-1-60309-459-7", "Lupus");
        map1.put("978-1-60309-444-3", "Red Panda and Moon Bear");
        map1.put("978-1-60309-461-0", "The Lab");
        // 2. For-each loop
        for (Map.Entry entry : map1.entrySet()) {
            System.out.println(entry.getValue() + "(ISBN: " + entry.getKey() + ")");
        }
        System.out.println("/////////////////////////////");
        map1.remove("978-1-60309-444-3");
        map1.remove(true, "The Lab");
          System.out.println(map1.keySet());
        System.out.println(map1.entrySet());
        for (Map.Entry entry : map1.entrySet()) {

            System.out.println(entry.getValue()+ "(ISBN: " + entry.getKey() + ")");
        }
    }
}
