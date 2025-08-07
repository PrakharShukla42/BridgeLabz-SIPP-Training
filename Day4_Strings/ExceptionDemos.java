package Day4_Strings;

public class ExceptionDemos {
    public static void run() {
        // NullPointerException
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException");
        }
        // StringIndexOutOfBoundsException
        try {
            String s = "abc";
            System.out.println(s.charAt(5));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException");
        }

        // IllegalArgumentException
        try {
            Thread t = new Thread();
            t.setPriority(11);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException");
        }

        // NumberFormatException
        try {
            int num = Integer.parseInt("abc123");
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int[] arr = new int[3];
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException");
        }
    }
}
