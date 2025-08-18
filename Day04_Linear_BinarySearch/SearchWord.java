package Day04_Linear_BinarySearch;

public class SearchWord {
    public static String findSentence(String[] sentences, String word) {
        for (String s : sentences) if (s.contains(word)) return s;
        return "Not Found";
    }

    public static void main(String[] args) {
        String[] sentences = {"I love coding", "Java is fun", "DSA is important"};
        System.out.println(findSentence(sentences, "Java"));
    }
}
