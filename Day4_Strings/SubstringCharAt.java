package Day4_Strings;

public class SubstringCharAt {
    public static void run() {
        String s = "BridgeLabz";
        String result = "";
        for (int i = 2; i <= 4; i++) {
            result += s.charAt(i);
        }
        System.out.println("Substring using charAt(): " + result);
    }
}
