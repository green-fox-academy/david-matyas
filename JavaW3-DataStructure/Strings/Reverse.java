public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements of `numbers`
// - Print the elements of the reversed `numbers`
        int[] numbers = {3, 4, 5, 6, 7};
        int[] revNumbers = {0, 0, 0, 0, 0};
        for (int i = 0; i < numbers.length; i++) {
            revNumbers[numbers.length - 1 - i] = numbers[i];
        }
        for (int j = 0; j < numbers.length; j++) {
            System.out.print(revNumbers[j]);
        }

    }
}
