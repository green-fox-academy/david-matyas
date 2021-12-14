import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String word1 = "dog";
        String word2 = "god";
        System.out.println(isAnagram(word1, word2));
    }

    public static boolean isAnagram(String word1, String word2) {
//        char[] usedChar1 = new char[word1.length()];
//        char[] usedChar2 = new char[word2.length()];
//        for (int i = 0; i < usedChar1.length; i++) {
//            usedChar1[i] = word1.charAt(i);
//        }
//
//        for (int i = 0; i < usedChar2.length; i++) {
//            usedChar2[i] = word2.charAt(i);
//        }
        char[] usedChar1 = word1.toCharArray();
        char[] usedChar2 = word2.toCharArray();
        Arrays.sort(usedChar1);
        Arrays.sort(usedChar2);
        return Arrays.compare(usedChar1, usedChar2) == 0;
    }
}

