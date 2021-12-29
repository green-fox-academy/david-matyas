import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class MostFrequentWord {
    public static void main(String[] args) {
        String text_original = "But then they were married (she felt awful about being pregnant before but Harry had been talking about marriage for a while and anyway laughed when she told him in early February about missing her period and said Great she was terribly frightened and he said Great and lifted her put his arms around under her bottom and lifted her like you would a child he could be so wonderful when you didn’t expect it in a way it seemed important that you didn’t expect it there was so much nice in him she couldn’t explain to anybody she had been so frightened about being pregnant and he made her be proud) they were married after her missing her second period in March and she was still little clumsy dark-complected Janice Springer and her husband was a conceited lunk who wasn’t good for anything in the world Daddy said and the feeling of being alone would melt a little with a little drink.";
        System.out.println(MostFrequentedWord(text_original));
    }
    public static String MostFrequentedWord(String text) {
        text = text.replaceAll("’", "\\’"); // replace apostrof
        text = text.replaceAll("\\(", "").replaceAll("\\.", "").replaceAll("\\)", ""); // Replace all other specific char
        // All word from text to array
        String[] wordList = text.split(" ");
        HashMap < String, Integer > wordMap = new HashMap < String, Integer > ();
        int counter = 1;
        // Map of unique word from text with count of
        for (int i = 0; i < wordList.length; i++) { // All word in text
            if (wordMap.keySet().contains(wordList[i])) {

                counter = (Integer) wordMap.get(wordList[i]) + 1;
                wordMap.put(wordList[i], counter);
                counter = 1;
            } else wordMap.put(wordList[i], counter);

        }
        // Select from map maximum value
        int maxValue = 0;
        String mostFrequented = "";
        for (Map.Entry entry: wordMap.entrySet()) { // Print products cost more than 150

            if (maxValue < (Integer) entry.getValue()) {
                mostFrequented = String.valueOf((String) entry.getKey());
                maxValue = (Integer) entry.getValue();
            }
        }
        return mostFrequented;
    }
}