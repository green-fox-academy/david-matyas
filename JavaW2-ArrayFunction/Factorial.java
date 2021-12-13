import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        //  Create the usual class wrapper and main method on your own

// - Create a function called `calculateFactorial()`
//   that returns the factorial of its input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Factorial");
        int number = scanner.nextInt();
        System.out.println(calculateFactorial(number));
    }

    public static int calculateFactorial(int number) {
        int calculateFactorial = 1;
        for (int i = 1; i <= number; i++) {
            calculateFactorial = calculateFactorial * i;
        }
        return calculateFactorial;

    }
}
