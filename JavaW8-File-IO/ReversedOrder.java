import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedOrder {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reversedOrder("src/ReversedOrder.txt");
    }

    private static void reversedOrder(String file) {
        Path filePath = Paths.get(file);
        try {
            var fileLines = Files.readAllLines(filePath);
            for (int i = 0, discounter = fileLines.size() - 1; i < file.length() - 1; i++, discounter--) {
                System.out.println(fileLines.get(discounter));
            }

        } catch (IOException e) {
            System.err.println("Enable to read the file: " + file);
        }
    }
}