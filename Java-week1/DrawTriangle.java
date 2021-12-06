import java.util.Scanner;

public class DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of lines");
        int lines = scanner.nextInt();
        int counter = 0;
        String stars = "*";
        while (counter < lines)
        {
            System.out.println(stars);
            counter++;
            stars = stars + "*";
        }



    }
}
