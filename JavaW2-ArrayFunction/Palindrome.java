import java.lang.reflect.Array;

public class Palindrome {
    public static void main(String[] args) {
        String word = "Ahoj";
        System.out.println(createPalindrome(word));
    }

    public static char[] createPalindrome(String word) {
        char[] allChar = new char[word.length()];
        char[] reverseChar = new char[word.length() * 2];
        int k;
        k = (word.length()  - 1);
        for (int i = 0; i < allChar.length; i++) {
            allChar[i] = word.charAt(i);
            reverseChar[i] = word.charAt(i);
        }

        for (int j = allChar.length; j < reverseChar.length; j++) {
            reverseChar[j] = allChar[k];
            k--;
        }


        return reverseChar;
    }
}
