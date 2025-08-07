package Day4_Strings;

import java.util.Arrays;

public class CharArrayManual {
    public static void run() {
        String s = "BridgeLabz";
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }
        System.out.println("Char array (manual): " + Arrays.toString(chars));
    }
}

