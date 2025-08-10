package Day5_Methods;

import java.util.Scanner;

public class UnitConverter1 {
    public static double convertMetersToFeet(double meters) {
        return meters * 3.28084;
    }
    public static double convertFeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meters = sc.nextDouble();
        System.out.println(convertMetersToFeet(meters));
        double feet = sc.nextDouble();
        System.out.println(convertFeetToMeters(feet));
        sc.close();
    }
}
