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
//        String pokracuj = "%";
//        while (pokracuj == "N")
//        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("SquareSize");
            int size = scanner.nextInt();
            int counter = 0;
            String pointChar = "%";
            String spacerRight = ""; // right space after symbol
            // top and bottom outline
            while (counter < size) {
                counter++;
                pointChar = pointChar + "%";

            }

            String spacer = "";
            System.out.println(pointChar);
            counter = 0;


            while (counter < size - 2) {

                int counter2 = counter;
                spacerRight = "";
                while (counter2 < size - 2) {
                    spacerRight = spacerRight + " ";
                    counter2++;
                }
                counter++;

                System.out.println("%" + spacer + "%" + spacerRight + "%");
                spacer = spacer + " ";
            }
            System.out.println(pointChar);
 //          Scanner pokracuj = new Scanner(System.in);
  //      }
    }
}
