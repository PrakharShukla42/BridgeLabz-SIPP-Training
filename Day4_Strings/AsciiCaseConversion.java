package Day4_Strings;

public class AsciiCaseConversion {
    public static void run() {
        String s = "PrakharShukla";
        StringBuilder upper = new StringBuilder();
        StringBuilder lower = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                upper.append((char)(c - 32));
            } else {
                upper.append(c);
            }

            if (c >= 'A' && c <= 'Z') {
                lower.append((char)(c + 32));
            } else {
                lower.append(c);
            }
        }

        System.out.println("Uppercase (ASCII): " + upper);
        System.out.println("Lowercase (ASCII): " + lower);
    }
}
