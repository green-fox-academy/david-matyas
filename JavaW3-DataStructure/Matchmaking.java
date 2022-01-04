
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Matchmaking {
    public static void main(String[] args) {
        List<String> girls = new ArrayList<>(Arrays.asList("Eve", "Ashley", "Claire", "Kat", "Jane"));
        List<String> boys = new ArrayList<>(Arrays.asList("Joe","Fred","Tom","Todd","Neef","Jeff"));

        // Write a method that joins the two lists by matching one girl with one boy into a new list
        // If someone has no pair, he/she should be added to the list on his/her own
        // Expected output: [Eve-Joe, Ashley-Fred, Claire-Tom, Kat-Todd, Jane-Neef, Jeff]
     System.out.println(match(girls, boys));
    }

    public static ArrayList<String> match(List<String> list1, List<String> list2) {
        ArrayList<String> pairs = new ArrayList<String>();
        System.out.println(list1.size());
        System.out.println(list2.size());
        if(list1.size()<= list2.size()) {
            for (int i = 0; i < list1.size(); i++) {
                pairs.add(list1.get(i) + "-" + list2.get(i));
            }
            for (int i = list1.size(); i < list2.size(); i++) {
                pairs.add(list2.get(i));
            }
        } else {
            for (int i = 0; i < list2.size(); i++) {
                pairs.add(list1.get(i) + "-" + list2.get(i));
            }
            for (int i = list2.size(); i < list1.size(); i++) {
                pairs.add(list1.get(i));
            }
        }
        return pairs;
    }
}
