import java.util.Scanner;

public class DrawDiagonal {
    // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SquareSize");
        int size = scanner.nextInt();
        int counter = 0;
        String pointChar = "%";
        while (counter < size) {
            counter++;
            pointChar = pointChar + "%";
        }
        String outline = pointChar;
        String spacer = " ";
        System.out.println(pointChar);
        counter = 0;
        while (counter < size) {
            counter++;
            System.out.println("%" + spacer + "%");
            spacer = spacer + " ";
             }
    }
}
