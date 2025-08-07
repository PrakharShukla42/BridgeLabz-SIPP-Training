package Day4_Strings;

public class Main {
    public static void main(String[] args) {
        System.out.println("== String Comparison ==");
        ComparisonCharAt.run();
        ComparisonEquals.run();

        System.out.println("\n== Substring ==");
        SubstringCharAt.run();
        SubstringMethod.run();

        System.out.println("\n== Char Array Conversion ==");
        CharArrayManual.run();
        CharArrayBuiltIn.run();

        System.out.println("\n== Exception Demonstrations ==");
        ExceptionDemos.run();

        System.out.println("\n== Case Conversion ==");
        AsciiCaseConversion.run();
        BuiltInCaseConversion.run();
    }
}
