import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroduction1 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names.size());
        names.add("Wiliam");

        if (names.size() == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //        names = Arrays.asList( "John", "Amanda"); adding multiple items

        names.add("John");
        names.add("Amanda");
        System.out.println(names.size());
        System.out.println(names.get(2)); // Print item on 3 position
        //       System.out.println("Print all names");
        for (String name : names) {
            System.out.println(name);

//            for (int i = 0; i < names.size(); i++) {
//                System.out.println(names.get(i));

        }
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + 1 + ". " + names.get(i));

        }
        names.remove(1);
        for (int i = names.size() - 1; i >= 0; i--) {
            System.out.println(names.get(i));

        }
        names.removeAll(names);
        System.out.println(names.size());

    }

}
