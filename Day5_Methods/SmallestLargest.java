package Day5_Methods;

import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();
        System.out.print("Enter number3: ");
        int num3 = sc.nextInt();
        int smallest = Math.min(num1, Math.min(num2, num3));
        int largest = Math.max(num1, Math.max(num2, num3));
        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
        sc.close();
    }
}
