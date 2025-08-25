import java.util.*;

public class ListFrequency {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("apple", "banana", "apple", "orange");
        Map<String, Integer> freqMap = new HashMap<>();

        for (String f : fruits) {
            freqMap.put(f, freqMap.getOrDefault(f, 0) + 1);
        }

        System.out.println(freqMap);
    }
}
