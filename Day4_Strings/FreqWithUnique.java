package Day4_Strings;

import java.util.Scanner;

public class FreqWithUnique {
    public static char[] unique(String s) {
        char[] res = new char[s.length()];
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == c)
                    found = true;
            if (!found)
                res[idx++] = c;
        }
        char[] finalRes = new char[idx];
        for (int i = 0; i < idx; i++)
            finalRes[i] = res[i];
        return finalRes;
    }

    public static int[] freq(String s) {
        int[] f = new int[256];
        for (int i = 0; i < s.length(); i++)
            f[s.charAt(i)]++;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] u = unique(s);
        int[] f = freq(s);
        for (char c : u)
            System.out.println(c + " : " + f[c]);
    }
}
