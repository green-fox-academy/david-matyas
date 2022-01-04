import java.util.*;
public class SolarSystem {
    public static void main(String... args) {
        List<String> planetList = Arrays.asList("Mercury","Venus","Earth","Mars","Jupiter","Uranus","Neptune");

        ArrayList<String> planetList2 = new ArrayList<>();
        planetList2.addAll(planetList);


        // "Saturn" is missing from the planetList
        // Insert it into the correct position
        // Create a method called "putSaturn()" which has a list parameter and returns
        // the list of planets in the correct order

        // Expected output: [Mercury, Venus, Earth, Mars, Jupiter, Saturn, Uranus, Neptune]
        System.out.println(putSaturn(planetList2));

    }

    public static ArrayList<String> putSaturn(ArrayList<String> list) {
        //       List<String> correct = Arrays.asList("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Uranus", "Neptune");
        list.add(5, "Saturn");
        return  list;

    }
}

