package Day2_ControlFlow;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        System.out.print("Enter your years of service: ");
        int years = scanner.nextInt();

        if (years > 5) {
            double bonus = salary * 0.05;
            System.out.println("You are eligible for a bonus of: ₹" + bonus);
        } else {
            System.out.println("No bonus. Years of service must be more than 5.");
        }

        scanner.close();
    }
}
