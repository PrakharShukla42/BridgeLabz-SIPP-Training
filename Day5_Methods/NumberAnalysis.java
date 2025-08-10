package Day5_Methods;

import java.util.Scanner;

public class NumberAnalysis {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
            if (isPositive(nums[i])) {
                System.out.println("Positive " + (isEven(nums[i]) ? "Even" : "Odd"));
            } else {
                System.out.println("Negative");
            }
        }
        int cmp = compare(nums[0], nums[nums.length - 1]);
        if (cmp == 0) System.out.println("Equal");
        else if (cmp > 0) System.out.println("First Greater");
        else System.out.println("First Smaller");
    }
}
