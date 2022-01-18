import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class CountLines {
    public static void main(String[] args) {
        // Write a function called countLines() that takes a filename as string as a parameter
// and returns the number of lines the file contains.
// It should return zero if it can't open the file
// and should not raise any error.
countLines("src/my-file.txt");

    }

    public static void countLines(String file) {
        Path filePath = Paths.get(file);
        try {
            var fileLines = Files.readAllLines(filePath);
            System.out.println("The file " + file + " contain " + fileLines.size() + " lines.");
        } catch (IOException e) {
            System.err.println("Unable to read file: " + filePath);
        }

    }
}