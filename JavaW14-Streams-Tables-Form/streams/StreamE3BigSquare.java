import java.util.Arrays;
import java.util.List;

public class StreamE3BigSquare {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers.stream()
                .filter(p -> (p * p) > 20)
                .forEach(System.out::println);
    }
}
