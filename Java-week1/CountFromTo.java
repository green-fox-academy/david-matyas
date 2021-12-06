import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        // Create a program that asks for two numbers
        // If the second number is not bigger than the first one it should print:
// "The second number should be bigger"
//
// If it is bigger it should count from the first number to the second by one
//
// example:
//
// first number: 3, second number: 6, should print:
//
// 3
// 4
// 5
        Scanner   scanner = new Scanner(System.in);
        System.out.println("Number from");

        int numberFrom = scanner.nextInt();
        System.out.println("Number to");
        int numberTo = scanner.nextInt();
        int nextNumber =  numberFrom;

        if (numberFrom >= numberTo)
        {
            System.out.println("The second number should be bigger - Put new higher Number2" );
            numberTo = scanner.nextInt();
        } else

            while (nextNumber <= numberTo) {
                System.out.println(nextNumber);
                nextNumber++;

            }

    }
}
