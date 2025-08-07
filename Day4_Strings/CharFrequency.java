package Day4_Strings;

import java.util.Scanner;

public class CharFrequency {
    public static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;
        boolean[] visited = new boolean[256];
        String[][] res = new String[s.length()][2];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!visited[c]) {
                res[index][0] = c + "";
                res[index][1] = freq[c] + "";
                visited[c] = true;
                index++;
            }
        }
        String[][] finalRes = new String[index][2];
        for (int i = 0; i < index; i++)
            finalRes[i] = res[i];
        return finalRes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[][] res = frequency(s);
        for (String[] row : res)
            System.out.println(row[0] + " : " + row[1]);
    }
}
