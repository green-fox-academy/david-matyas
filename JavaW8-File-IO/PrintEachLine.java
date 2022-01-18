import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class PrintEachLine {
    public static void main(String[] args) {
        // Write a program that opens a file called "my-file.txt" and prints each
        // line from the file.
        // If the program is unable to read the file (for example the file does not exist),
        // it should print the following error message: "Unable to read file: my-file.txt".
        Path filePath = Paths.get("src/my-file.txt");
        try {
            var fileLines = Files.readAllLines(filePath);
            System.out.println(fileLines);
            System.out.println(fileLines.size());
        } catch (IOException e) {
            System.err.println("Unable to read file: " + filePath);
        }

    }
}