import java.util.*;

public class Candyshop{
    public static void main(String... args){
        ArrayList<Object> list = new ArrayList<Object>();
        list.add("Cupcake");
        list.add(2);
        list.add("Brownie");
        list.add(false);
        // Accidentally we added "2" and "false" to the `list`
        // Your task is to change the "2" to "Croissant" and change the "false" to "Ice cream"
        // No, don't just edit the lines above! :)
        // Create a method called "repairSweetList()" which takes the `list` as a parameter
        // and returns a list with the items "2" and "false" replaced (with "Croissant" and "Ice cream")
        // Expected output: [Cupcake, Croissant, Brownie, Ice cream]
        System.out.println(repairSweetList(list));
    }
    public static ArrayList<String>  repairSweetList(ArrayList<Object> badList) {
    ArrayList<String> repared = new ArrayList<String>();
        for (int i = 0; i < badList.size(); i++) {
            System.out.println(badList.get(i));
            if(badList.get(i).equals(2)) {
                repared.add(i,"Croissant");
            } else if(badList.get(i).equals(false)) {
                repared.add(i,"Ice cream");
            } else repared.add(i, (String) badList.get(i));
        }
            return repared;
    }

}
