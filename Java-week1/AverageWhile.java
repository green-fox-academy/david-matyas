import java.util.Scanner;

public class AverageWhile {
    // aritmetický průměr 4 čísel
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numNumbers = 0;
        int allNumbers = 0;
        double averageNumber = 0;

        while (numNumbers < 4) {
            numNumbers++;
            System.out.println("Zadej číslo "+ numNumbers + " :");
            allNumbers = scanner.nextInt() + allNumbers;
            System.out.println(allNumbers);
        }
        averageNumber = allNumbers / numNumbers;
        System.out.println("Průměr je "+ averageNumber);
    }
}
