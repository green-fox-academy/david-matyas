import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputMiles = 0;
        System.out.println("Miles :");
        inputMiles = scanner.nextDouble();
        double outputKm = inputMiles * 1.609344;
        System.out.println("in km :" + outputKm);
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it
    }
}
