import java.util.Scanner;

public class DrawChessTable {
    public static void main(String[] args) {
        // Create a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
//
        Scanner scanner = new Scanner(System.in);
        System.out.println("Size of Chess table:");
        int size = scanner.nextInt();
        int i;
        int j;
        for (i = 0; i < size * 2; i++) {
            String blackWhite = " %";
            for (j = 0; j < size - 1; j++) {
                blackWhite = blackWhite + " %";
            }
            if (i % 2 == 0) {
                System.out.println(blackWhite);
            } else {
                System.out.println(" " + blackWhite);
            }
        }
    }

}

