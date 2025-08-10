package Day5_Methods;

import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1 of triangle (m): ");
        double side1 = sc.nextDouble();
        System.out.print("Enter side2 of triangle (m): ");
        double side2 = sc.nextDouble();
        System.out.print("Enter side3 of triangle (m): ");
        double side3 = sc.nextDouble();
        double perimeter = side1 + side2 + side3;
        double rounds = 5000 / perimeter;
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds.");
        sc.close();
    }
}
