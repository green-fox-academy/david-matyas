import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // then prints "Odd" if the number is odd, or "Even" if it is even
        Scanner scanner = new Scanner(System.in);
        int numOddEven = 0;
        int isOdd = 0;
        System.out.println("Number :");
        numOddEven = scanner.nextInt();
        isOdd = numOddEven % 2;
        System.out.println(isOdd);
        switch (isOdd) {
            case 0:
                System.out.println("Number is odd");
                break;
            case 1:
                System.out.println("Number is even");
                break;
        }

    }
}
