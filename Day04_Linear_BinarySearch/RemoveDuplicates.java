package Day04_Linear_BinarySearch;

import java.util.*;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.contains(c)) {
                sb.append(c);
                set.add(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
        System.out.println(removeDuplicates("BridgeLabz"));
        System.out.println(removeDuplicates("Prakhar Shukla"));
    }
}
