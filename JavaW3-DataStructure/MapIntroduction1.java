import java.util.HashMap;

public class MapIntroduction1 {
    public static void main(String[] args) {
        HashMap<Integer, Character> map1 = new HashMap<Integer, Character>();

        System.out.println(map1);
        map1.put(97, 'a');
        map1.put(98, 'b');
        map1.put(99, 'c');
        map1.put(65, 'A');
        map1.put(66, 'B');
        map1.put(67, 'C');
        System.out.println(map1.keySet());
        System.out.println(map1.values());
        map1.put(68, 'D');
        System.out.println(map1.size());
        System.out.println(map1.get(99));
        map1.remove(97);
        System.out.println(map1.containsKey(100));
        map1.clear();
        System.out.println(map1.keySet());

    }

}
