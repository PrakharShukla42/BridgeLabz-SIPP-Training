package Day4_Strings;

public class ComparisonCharAt {
    public static void run() {
        String a = "BridgeLabz";
        String b = "BridgeLabz";
        boolean areEqual = true;

        if (a.length() != b.length()) {
            areEqual = false;
        } else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    areEqual = false;
                    break;
                }
            }
        }

        System.out.println("Are equal using charAt(): " + areEqual);
    }
}
