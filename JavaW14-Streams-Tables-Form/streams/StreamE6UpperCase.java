import java.util.ArrayList;
import java.util.List;

public class StreamE6UpperCase {
    public static void main(String[] args) {
        String s = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit. Morbi nec mattis odio.";
        List<String> text = new ArrayList<>();
        for (String s1 : s.split(" ")) {
            text.add(s1.substring(0, 1));
        }
        text.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);
    }
}