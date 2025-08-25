import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 1, 2, 2, 3, 4);
        Set<Integer> seen = new LinkedHashSet<>(list);
        List<Integer> result = new ArrayList<>(seen);

        System.out.println(result);
    }
}
