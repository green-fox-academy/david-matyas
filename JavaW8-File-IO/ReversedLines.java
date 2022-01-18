import com.sun.jdi.Value;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        reversedLines("src/ReverseLine.txt");
    }

    private static void reversedLines(String file) {
        Path filePath = Paths.get(file);
        try {
            var fileLines = Files.readAllLines(filePath);
            for (String fileLine : fileLines) {
                String allString = String.valueOf(fileLine);
                for (int j = 0, discounter = allString.length() - 1; j < allString.length(); j++, discounter--) {
                    char[] correctOrder = new char[allString.length()];
                    System.out.print(allString.charAt(discounter));
                }
                System.out.println();
            }
        } catch (IOException e) {
            System.err.println("Enable to read the file: " + file);
        }
    }
}
