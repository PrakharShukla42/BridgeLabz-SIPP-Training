package Day4_Strings;

import java.util.Scanner;

public class UniqueCharacters {
    public static int stringLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    public static char[] findUniques(String s) {
        int len = stringLength(s);
        char[] result = new char[len];
        int index = 0;
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique)
                result[index++] = c;
        }
        char[] finalResult = new char[index];
        for (int i = 0; i < index; i++)
            finalResult[i] = result[i];
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] unique = findUniques(s);
        for (char c : unique)
            System.out.print(c + " ");
    }
}
