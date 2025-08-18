package Day05_RuntimeAnalysis;

import java.util.*;

public class SearchComparison {
    public static void main(String[] args) {
        int n = 1000000;
        Random rand = new Random();

        int[] arr = new int[n];
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            int val = rand.nextInt(n * 2);
            arr[i] = val;
            hashSet.add(val);
            treeSet.add(val);
        }

        int target = arr[n / 2];

        long start = System.currentTimeMillis();
        boolean found = false;
        for (int x : arr) if (x == target) { found = true; break; }
        long end = System.currentTimeMillis();
        System.out.println("Array Search Time: " + (end - start) + " ms, Found: " + found);

        start = System.currentTimeMillis();
        found = hashSet.contains(target);
        end = System.currentTimeMillis();
        System.out.println("HashSet Search Time: " + (end - start) + " ms, Found: " + found);

        start = System.currentTimeMillis();
        found = treeSet.contains(target);
        end = System.currentTimeMillis();
        System.out.println("TreeSet Search Time: " + (end - start) + " ms, Found: " + found);
    }
}
