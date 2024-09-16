import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TopRepeating {
    public static void main(String[] args) {
        
          List<String> words = Arrays.asList(
            "apple", "banana", "apple", "orange", "banana",
            "apple", "orange", "banana", "apple", "kiwi",
            "banana", "kiwi", "kiwi", "apple", "banana"
        );

        int N = 3;

        printTopNFrequentWords(words, N);
        
    }

    public static void printTopNFrequentWords(List<String> words, int N) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        List<Entry<String, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        entryList.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        System.out.println("Top " + N + " frequent words:");
        for (int i = 0; i < N && i < entryList.size(); i++) {
            Entry<String, Integer> entry = entryList.get(i);
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
}
}
