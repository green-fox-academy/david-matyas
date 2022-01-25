import java.util.ArrayList;
import java.util.HashMap;

public class Farm {
    ArrayList<Animal> animalList = new ArrayList();
    int limit = 0;

    public Farm(int limit) {
        this.limit = limit;
    }

    public void breed() {
        if (animalList.size() < limit) {
            Animal newAnimal = new Animal();
            animalList.add(newAnimal);
        } else System.out.println("Sorry farm is full.");
    }

    public void sell() {
        int lowestHungry = 0;
        int animalIndex = 0;
        for (int i = 0; i < animalList.size(); i++) {
            if (lowestHungry > animalList.get(i).hunger) {
                lowestHungry = animalList.get(i).hunger;
                animalIndex = animalList.indexOf(i);
            }
            animalList.remove(animalIndex);
        }

    }

    @Override
    public String toString() {
        return "Farm{" +
                "animalList=" + animalList +
                '}';
    }
}
