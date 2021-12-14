
import java.util.Arrays;
import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as parameters
        //  It returns the indices of the integers of the array which contain the given number
        //  or returns an empty array (if the number is not part of any of the integers in the array)

        //  Examples:
//        System.out.println(Arrays.toString(findMatchingIndexes(1, new int[] {1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
//        System.out.println(Arrays.toString(findMatchingIndexes(9, new int[] {1, 11, 34, 52, 61})));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function to print the array returned
        // You could just as well iterate over the array and print its items one by one
        Scanner scanner = new Scanner(System.in);
        System.out.println("Looking number");
        int number = scanner.nextInt();
        int[] indexedArray = {1, 3, 2, 4, 9, 99993999};
        int index = -1;
        int position = 0;
        int[] fieldFind = new int[indexedArray.length];
        for (int i = 0; (i < indexedArray.length); i++) {
            if (numerIs(indexedArray[i], number)) {
                fieldFind[position] = i;
                position++;

            }
        }

        int[] clearField = Arrays.copyOf(fieldFind,position);
//        int[] clearField = new int[position];
//        for (int i = 0; i < clearField.length; i++) {
//            clearField[i] = fieldFind[i];
//        }
        System.out.println(Arrays.toString(clearField));
    }

    public static boolean numerIs(int number, int lookingNumber) {
        int zero = 1;
        while (zero != 0) {
            zero = number % 10;
            if (zero == lookingNumber) {
                return true;

            } else {
                zero = number / 10;
                number = zero;
            }

        }
        return false;

    }
}
