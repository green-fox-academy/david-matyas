import java.util.Scanner;

public class Prumer {
    public static void main(String[] args) {
// aritmetický průměr 4 čísel

        Scanner scanner = new Scanner(System.in);
        int numNumber = 0;
        int sumNumbers = 0;
        int allNumbers = 0;
        double average;

        while (numNumber < 4) {
            numNumber++;
            System.out.println("Zadej cislo " + numNumber);
            allNumbers = scanner.nextInt() + allNumbers;
            System.out.println(allNumbers);
        }
        average = allNumbers / numNumber;
        System.out.println("Průměr je  " + average);
    }
}
