package Day2_ControlFlow;

import java.util.Scanner;

public class SumCompareWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;
            int loopSum = 0;
            int i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using loop: " + loopSum);
        } else {
            System.out.println("Not a natural number.");
        }

        sc.close();
    }
}
