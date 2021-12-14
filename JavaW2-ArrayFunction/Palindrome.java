import java.lang.reflect.Array;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word or few words");
        String word = scanner.next();
        System.out.println(createPalindrome(word));
    }

    public static char[] createPalindrome(String word) {
        //      char[] allChar = new char[word.length()];
        char[] reverseChar = new char[word.length() * 2];
        int k = (word.length() - 1);
        for (int i = 0; i < word.length(); i++) {
            //      allChar[i] = word.charAt(i);
            reverseChar[i] = word.charAt(i);
        }

        for (int j = word.length(); j < reverseChar.length; j++) {
            reverseChar[j] = reverseChar[k];
            k--;
        }
        return reverseChar;
    }
}
