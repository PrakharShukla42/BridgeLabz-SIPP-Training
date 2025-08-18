package Day04_Linear_BinarySearch;

public class ComparePerformance {
    public static void main(String[] args) {
        int n = 1000000;
        long start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append("Prakhar Shukla");
        long end = System.nanoTime();
        System.out.println("StringBuilder: " + (end - start));

        start = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < n; i++) sbuf.append("Prakhar Shukla");
        end = System.nanoTime();
        System.out.println("StringBuffer: " + (end - start));
    }
}
