import java.util.ArrayList;
import java.util.List;

public class SharpieSet {
    int counter;
    ArrayList<Sharpie> listOfSharpies = new ArrayList();

    public void add(Sharpie newSharpie) {
        listOfSharpies.add(counter, newSharpie);
        counter++;
    }

    public void countUsable() {
        int usable = 0;
        for (Sharpie sharpie : listOfSharpies) {
            if (sharpie.inkAmount > 0) {
                usable++;
            }
        }
        System.out.println("number of usable Sharpies :" + usable);

    }

    public void removeTrash() {
        for (int i = 0; i < listOfSharpies.size(); i++) {
            if (listOfSharpies.get(i).inkAmount == 0) {
                listOfSharpies.remove(i);
            }
        }
    }
}



