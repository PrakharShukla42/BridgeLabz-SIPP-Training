package Day3_Arrays;

import java.util.Scanner;

public class BMI2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();

        double[][] personData = new double[n][3]; // weight, height, BMI
        String[] status = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight (kg) and height (m) for person " + (i + 1));
            double weight = sc.nextDouble();
            double height = sc.nextDouble();

            if (weight <= 0 || height <= 0) {
                System.out.println("Enter positive values.");
                i--;
                continue;
            }

            double bmi = weight / (height * height);

            personData[i][0] = weight;
            personData[i][1] = height;
            personData[i][2] = bmi;

            if (bmi < 18.5) status[i] = "Underweight";
            else if (bmi < 25) status[i] = "Normal";
            else if (bmi < 30) status[i] = "Overweight";
            else status[i] = "Obese";
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Person " + (i + 1) + ": Height = " + personData[i][1] + ", Weight = " + personData[i][0] +
                    ", BMI = " + personData[i][2] + ", Status = " + status[i]);
        }
        sc.close();
    }
}
