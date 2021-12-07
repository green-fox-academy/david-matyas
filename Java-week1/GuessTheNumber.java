import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        // Write a program that stores a number and the user has to figure it out

// The user can input guesses
// After each guess the program would tell one of the following:
//
// The stored number is higher
// The stored number is lower
// You found the number: 8
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hidden number");
        int hiddenNumber = scanner.nextInt();
        int testedNumber = hiddenNumber + 1;

        while (hiddenNumber != testedNumber) {
            System.out.println("What is my number?");
            testedNumber = scanner.nextInt();
            if (hiddenNumber > testedNumber)
            {
                System.out.println("The stored number is higher");
            } else if (hiddenNumber < testedNumber) {
                System.out.println("The stored number is lower");
            }
            else
                System.out.println("You found the number:" + hiddenNumber );

        }
    }
}
