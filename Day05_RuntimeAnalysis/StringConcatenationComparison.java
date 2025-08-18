package Day05_RuntimeAnalysis;

public class StringConcatenationComparison {
    public static void main(String[] args) {
        int n = 10000;

        long start = System.nanoTime();
        String s = "";
        for (int i = 0; i < n; i++) s += "a";
        long end = System.nanoTime();
        System.out.println("String Time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("a");
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < n; i++) sbf.append("a");
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
