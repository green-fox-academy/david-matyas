import java.util.Scanner;

public class PalindromeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Word");
//        String word = "dog goat dad duck doodle never";
//       String word = scanner.next();
        String word = scanner.nextLine();
        //  word+=scanner.nextLine();
        scanner.close();

        //       System.out.println(word);
        System.out.println(searchPalindrome(word));
    }

    public static String searchPalindrome(String word) {
        int maxStorage = 0;
        String temp = "";
        String searchedPalindrome = "[";
//        String[] searchedPalArray =


        for (int i = 2; i < word.length(); i++) {
            maxStorage += word.length() / i;

        }
        String[] storage = new String[maxStorage];
        String reverse;

        for (int j = 3; j <= word.length(); j++) {
            for (int i = 0; i <= word.length() - j; i++) {
                temp = word.substring(i, i + j);
                reverse = "";
                //             System.out.println(word.length() + "j=" + j + "i=" + i + " temp =" + temp);
                for (int k = 0; k < temp.length(); k++) {
                    reverse = temp.charAt(k) + reverse;
                }
                if (reverse.equals(temp)) {
                    storage[i] = reverse;

                }

            }
        }
        for (int i = 0; i < maxStorage; i++) {
            if (storage[i] != null) {
                searchedPalindrome += "\"" + storage[i] + "\",";
            }

        }
        searchedPalindrome += "]";
        return searchedPalindrome;
    }
}
